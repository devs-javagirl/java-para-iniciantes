package cap11;


// Verifica se as threads estão vivas
class ThreadIsAlive implements Runnable {
    Thread thrd;

    ThreadIsAlive(String name) {
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

class MoreThreadsIsAlive {
    public static void main(String[] args) {
        System.out.println("Main thread starting.");
        ThreadIsAlive mt1 = new ThreadIsAlive("Child #1");
        ThreadIsAlive mt2 = new ThreadIsAlive("Child #2");
        ThreadIsAlive mt3 = new ThreadIsAlive("Child #3");

        // Verifica se as threads ainda estão vivas
        do {
            System.out.print(".");
            try {
                Thread.sleep(100);
            } catch (InterruptedException exc) {
                System.out.println("Main thread interrupted.");
            }
        } while (mt1.thrd.isAlive() || mt2.thrd.isAlive() || mt3.thrd.isAlive());

        System.out.println("Main thread ending.");
    }
}
