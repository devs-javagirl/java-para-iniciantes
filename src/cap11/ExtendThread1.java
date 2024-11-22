package cap11;

/* Tente Isto 11-1 */
class MyThread2 extends Thread {
    // Constrói uma nova thread.
    MyThread2(String name) {
        super(name); // nomeia a thread
        start(); // inicia a thread
    }

    // Começa a execução da nova thread.
    public void run() {
        System.out.println(getName() + " starting.");
        try {
            for(int count=0; count < 10; count++) {
                Thread.sleep(400);
                System.out.println("In " + getName() +
                        ", count is " + count);
            }
        }
        catch(InterruptedException exc) {
            System.out.println(getName() + " interrupted.");
        }
        System.out.println(getName() + " terminating.");
    }
}
public class ExtendThread1 {
    public static void main(String args[]) {
        System.out.println("Main thread starting.");
        MyThread2 mt = new MyThread2("Child #1");
        for(int i=0; i < 50; i++) {
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
