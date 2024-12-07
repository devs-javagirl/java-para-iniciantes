package cap11;

class MyThread6 implements Runnable {
    Thread thrd;
    boolean suspended; //Suspende a thread quando igual a true.
    boolean stopped; //Encerra a thread quando igual a true.

    MyThread6(String name) {
        thrd = new Thread(this, name);
        suspended = false;
        stopped = false;
        thrd.start();
    }
    // Este é o ponto de entrada da thread.
    public void run() {
        System.out.println(thrd.getName() + " starting.");
        try {
            for(int i = 1; i < 1000; i++) {
                System.out.print(i + " ");
                if((i%10)==0) {
                    System.out.println();
                    Thread.sleep(250);
                }
                // Usa um bloco sincronizado para verificar suspended e stopped.
                synchronized(this) { //Esse bloco sincronizado verifica suspended e stopped.
                    while(suspended) {
                        wait();
                    }
                    if(stopped)
                        break;
                }
            }
        } catch (InterruptedException exc) {
            System.out.println(thrd.getName() + " interrupted.");
        }
        System.out.println(thrd.getName() + " exiting.");
    }
    // Encerra a thread.
    synchronized void mystop() {
        stopped = true;
        // O código a seguir assegura que uma thread suspensa possa ser encerrada.
        suspended = false;
        notify();
    }
    // Suspende a thread.
    synchronized void mysuspend() {
        suspended = true;
    }
    // Retoma a thread.
    synchronized void myresume() {
        suspended = false;
        notify();
    }
}


class Suspend {
    public static void main(String args[]) {
        MyThread6 ob1 = new MyThread6("My Thread");
        try {
            Thread.sleep(1000); // permite que a thread ob1 comece a ser executada
            ob1.mysuspend();
            System.out.println("Suspending thread.");
            Thread.sleep(1000);
            ob1.myresume();
            System.out.println("Resuming thread.");
            Thread.sleep(1000);
            ob1.mysuspend();
            System.out.println("Suspending thread.");
            Thread.sleep(1000);
            ob1.myresume();
            System.out.println("Resuming thread.");
            Thread.sleep(1000);
            ob1.mysuspend();
            System.out.println("Stopping thread.");
            ob1.mystop();
        } catch (InterruptedException e) {
            System.out.println("Main thread Interrupted");
        }
        // espera a thread terminar
        try {
            ob1.thrd.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread Interrupted");
        }
        System.out.println("Main thread exiting.");
    }
}