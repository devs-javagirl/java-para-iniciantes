package cap11;

// Demonstra as prioridades das threads.
class PriorityThread implements Runnable {
    int count;
    Thread thrd;
    static boolean stop = false;
    static String currentName;

    // Construtor para criar uma nova thread
    PriorityThread(String name) {
        thrd = new Thread(this, name);
        count = 0;
        currentName = name;
    }

    // Define o comportamento da thread
    public void run() {
        System.out.println(thrd.getName() + " starting.");
        do {
            count++;
            if (!currentName.equals(thrd.getName())) {
                currentName = thrd.getName();
                System.out.println("In " + currentName);
            }
        } while (!stop && count < 10000000);
        stop = true; // Interrompe outras threads ao alcançar 10.000.000
        System.out.println("\n" + thrd.getName() + " terminating.");
    }
}

class PriorityDemo {
    public static void main(String args[]) {
        // Cria duas threads com diferentes prioridades
        PriorityThread highPriority = new PriorityThread("High Priority");
        PriorityThread lowPriority = new PriorityThread("Low Priority");

        // Configura as prioridades
        highPriority.thrd.setPriority(Thread.MIN_PRIORITY); // Alta prioridade 7
        lowPriority.thrd.setPriority(Thread.MAX_PRIORITY); // Baixa prioridade 3

        // Inicia as threads
        highPriority.thrd.start();
        lowPriority.thrd.start();

        try {
            highPriority.thrd.join();
            lowPriority.thrd.join();
        } catch (InterruptedException exc) {
            System.out.println("Main thread interrupted.");
        }

        // Exibe os resultados
        System.out.println("\nHigh priority thread counted to " + highPriority.count);
        System.out.println("Low priority thread counted to " + lowPriority.count);
    }
}
