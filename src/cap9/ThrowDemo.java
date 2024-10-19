package cap9;

public class ThrowDemo {
    public static void main(String args[]) {
        try {
            System.out.println("Before throw.");
            // Lan�a manualmente uma exce��o
            throw new ArithmeticException();
        }
        catch (ArithmeticException exc) {
            // Captura a exce��o lan�ada manualmente
            System.out.println("Exception caught.");
        }
        System.out.println("After try/catch block.");
    }
}
