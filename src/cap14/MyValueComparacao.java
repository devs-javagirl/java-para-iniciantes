package cap14;

@FunctionalInterface
interface MyValueCompara {
    double getValue();
}

public class MyValueComparacao {
    public static void main(String[] args) {
        // Expressão lambda sem atributo, mas retornando um valor
        MyValueCompara myVal = () -> 98.6;
        System.out.println("Value: " + myVal.getValue());  // Imprime 98.6
    }
}
