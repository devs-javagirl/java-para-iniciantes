package cap4;

public class MyCounter extends Object {
    int count;

    MyCounter(int count) {
        this.count = count;
    }

    MyCounter() {
        this.count = 0;
    }

    @Override
    public String toString() {
        return "Sobrescreveu";
    }

}
