package cap11;

// Aguarda o término das threads com join()
class MyThreadJoin implements Runnable {
    Thread thrd;

    MyThreadJoin(String name) {
        thrd = new Thread(this, name);
        thrd.start(); // Inicia a thread
    }

    public void run() {
        System.out.println(thrd.getName() + " starting.");
        try {
            for (int count = 0; count < 10; count++) {
                Thread.sleep(400); // Suspende a execução por 400ms
                System.out.println("In " + thrd.getName() + ", count is " + count);
            }
        } catch (InterruptedException exc) {
            System.out.println(thrd.getName() + " interrupted.");
        }
        System.out.println(thrd.getName() + " terminating.");
    }
}

class JoinThreads {
    public static void main(String[] args) {
        System.out.println("Main thread starting.");
        MyThreadJoin mt1 = new MyThreadJoin("Child #1");
        MyThreadJoin mt2 = new MyThreadJoin("Child #2");
        MyThreadJoin mt3 = new MyThreadJoin("Child #3");

        try {
            mt3.thrd.join(); // Aguarda Child #1 terminar
            System.out.println("Child #3 joined.");
            mt2.thrd.join(); // Aguarda Child #2 terminar
            System.out.println("Child #2 joined.");
            mt1.thrd.join(); // Aguarda Child #3 terminar
            System.out.println("Child #1 joined.");
        } catch (InterruptedException exc) {
            System.out.println("Main thread interrupted.");
        }

        System.out.println("Main thread ending.");
    }
}
