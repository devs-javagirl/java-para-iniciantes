package cap11;

// Implementa Runnable para criar uma thread
class MultipleThread implements Runnable {
    Thread thrd;

    // Construtor que inicializa a thread com um nome
    MultipleThread(String name) {
        thrd = new Thread(this, name);
        thrd.start(); // Inicia a thread
    }

    // Código a ser executado pela thread
    public void run() {
        System.out.println(thrd.getName() + " starting.");
        try {
            for (int count = 0; count < 10; count++) {
                Thread.sleep(10000); // Pausa por 400ms
                System.out.println("In " + thrd.getName() + ", count is " + count);
            }
        } catch (InterruptedException exc) {
            System.out.println(thrd.getName() + " interrupted.");
        }
        System.out.println(thrd.getName() + " terminating.");
    }
}

// Classe principal
class MoreThreads {
    public static void main(String args[]) {
        System.out.println("Main thread starting.");

        // Criação de três threads filhas
        MultipleThread mt1 = new MultipleThread("Child #1");
        MultipleThread mt2 = new MultipleThread("Child #2");
        MultipleThread mt3 = new MultipleThread("Child #3");

        // Executando ações na thread principal
        for (int i = 0; i < 50; i++) {
            System.out.print(".");
            try {
                Thread.sleep(10000); // Pausa por 100ms
            } catch (InterruptedException exc) {
                System.out.println("Main thread interrupted.");
            }
        }
        System.out.println("Main thread ending.");
    }
}
