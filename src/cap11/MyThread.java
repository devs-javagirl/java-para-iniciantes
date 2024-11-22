package cap11;

public class MyThread implements Runnable{
    /*
     Objetos de MyThread podem ser
    executados em suas pr�prias
    threads, porque MyThread
    implementa Runnable.
     */
    String thrdName;
    MyThread(String name) {
        thrdName = name;
    }

    // Threads come�am a ser executadas aqui.
    public void run() {
        System.out.println(thrdName + " starting.");
        try {
            for(int count=0; count < 10; count++) {
                Thread.sleep(400);
                System.out.println("In " + thrdName +
                        ", count is " + count);
            }
        }
        catch(InterruptedException exc) {
            System.out.println(thrdName + " interrupted.");
        }
        System.out.println(thrdName + " terminating.");
    }
}
class UseThreads {
    public static void main(String args[]) {
        System.out.println("Main thread starting.");
        // Primeiro, constr�i um objeto MyThread.
        MyThread mt = new MyThread("Child #1"); //Cria um objeto execut�vel.

        // Em seguida, constr�i uma thread a partir desse objeto.
        Thread newThrd = new Thread(mt); //Constr�i uma thread nesse objeto.

        // Para concluir, come�a a execu��o da thread.
        newThrd.start(); //Come�a a executar a thread.

        for(int i=0; i<50; i++) {
            System.out.print(".");
            try {
                Thread.sleep(100);
            }
            catch(InterruptedException exc) {
                System.out.println("Main thread interrupted.");
            }
        }
        System.out.println("Main thread ending.");
    }
}
