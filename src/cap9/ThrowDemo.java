package cap9;

public class ThrowDemo {
    public static void main(String args[]) {
        try {
            System.out.println("Before throw.");
            // Lança manualmente uma exceção
            throw new ArithmeticException();
        }
        catch (ArithmeticException exc) {
            // Captura a exceção lançada manualmente
            System.out.println("Exception caught.");
        }
        System.out.println("After try/catch block.");
    }
}
