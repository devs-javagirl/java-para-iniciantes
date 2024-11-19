package cap11;

public class MyThread1 implements Runnable{
    Thread thrd; //Uma refer�ncia ao objeto thread � armazenada em thrd

    // Constr�i uma nova thread.
    MyThread1(String name) {
        thrd = new Thread(this, name);
        thrd.start(); // inicia a thread
    }

    // Come�a a execu��o da nova thread.
    public void run() {
        System.out.println(thrd.getName() + " starting.");
        try {
            for(int count=0; count<10; count++) {
                Thread.sleep(400);
                System.out.println("In " + thrd.getName() +
                        ", count is " + count);
            }
        }
        catch(InterruptedException exc) {
            System.out.println(thrd.getName() + " interrupted.");
        }
        System.out.println(thrd.getName() + " terminating.");
    }
}
class UseThreadsImproved {
    public static void main(String args[]) {
        System.out.println("Main thread starting.");
        //Agora a thread come�a quando � criada.
        MyThread1 mt = new MyThread1("Child #1");

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
