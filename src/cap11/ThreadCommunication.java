package cap11;

class SharedResource {
    private boolean flag = false;

    synchronized void produce() {
        while (flag) {
            try {
                wait(); //Coloca a thread atual no estado de espera até ser notificada.
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Producing...");
        flag = true;
        notify();
    }

    synchronized void consume() {
        while (!flag) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Consuming...");
        flag = false;
        notify();
    }
}

public class ThreadCommunication {
    public static void main(String[] args) {
        SharedResource resource = new SharedResource();

        Thread producer = new Thread(resource::produce);
        Thread consumer = new Thread(resource::consume);

        producer.start();
        consumer.start();
    }
}
