package cap11;

class MyThread3 extends Thread {
    MyThread3(String name) {
        super(name);
    }

    public void run() {
        System.out.println(getName() + " starting.");
        try {
            for (int i = 0; i < 10; i++) {
                Thread.sleep(400);
                System.out.println("In " + getName() + ", count is " + i);
            }
        } catch (InterruptedException e) {
            System.out.println(getName() + " interrupted.");
        }
        System.out.println(getName() + " terminating.");
    }
}

public class UseThreads1 {
    public static void main(String[] args) {
        System.out.println("Main thread starting.");

        MyThread3 thread = new MyThread3("Child #1");
        thread.start();

        for (int i = 0; i < 50; i++) {
            System.out.print(".");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                System.out.println("Main thread interrupted.");
            }
        }
        System.out.println("Main thread ending.");
    }
}
