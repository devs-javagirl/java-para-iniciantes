package cap11;

class SyncronizedThreadDemo implements Runnable {
    Thread thrd;
    static SumArraySyncronized sa = new SumArraySyncronized();
    int a[];
    int answer;

    SyncronizedThreadDemo(String name, int nums[]) {
        thrd = new Thread(this, name);
        a = nums;
        thrd.start();
    }

    public void run() {
        System.out.println(thrd.getName() + " starting.");
        answer = sa.SumArraySyncronized(a);
        System.out.println("Sum for " + thrd.getName() + " is " + answer);
        System.out.println(thrd.getName() + " terminating.");
    }
}

class Sync {
    public static void main(String args[]) {
        int a[] = {1, 2, 3, 4, 5};
        SyncronizedThreadDemo mt1 = new SyncronizedThreadDemo("Child #1", a);
        SyncronizedThreadDemo mt2 = new SyncronizedThreadDemo("Child #2", a);
        try {
            mt1.thrd.join();
            mt2.thrd.join();
        } catch (InterruptedException exc) {
            System.out.println("Main thread interrupted.");
        }
    }
}
