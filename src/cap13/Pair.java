package cap13;

public class Pair<T, V extends T> {
    T first;
    V second;
    Pair(T a, V b) {
        first = a;
        second = b;
    }

    String getObjects(){
        return "first = " + first.toString() + " / second = " + second.toString();
    }
}

class ExemplePair{
    public static void main(String[] args) {
        // Isto est� certo porque T e V s�o Integer.
        Pair<Integer, Integer> x = new Pair<Integer, Integer>(1, 2);
        System.out.println("X: " + x.getObjects());

        // Isto est� certo porque Integer � uma subclasse de Number.
        Pair<Number, Integer> y = new Pair<Number, Integer>(10.4, 12);
        System.out.println("Y: " + y.getObjects());

        // Esta linha causa um erro, porque String n�o � subclasse de Number
        //Pair<Number, String> z = new Pair<Number, String>(10.4, "12");
    }

}
