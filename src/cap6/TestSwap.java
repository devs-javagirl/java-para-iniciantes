package cap6;

public class TestSwap {
    int a;
    TestSwap(int i) {
        a = i;
    }

    void swap(TestSwap ob1, TestSwap ob2) {
        int t;

        t = ob1.a;
        ob1.a = ob2.a;
        ob2.a = t;
    }
}
