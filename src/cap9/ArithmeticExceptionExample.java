package cap9;

public class ArithmeticExceptionExample {
    public static void main(String[] args) {
        try {
            // Tentando dividir por zero
            int result = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Erro: Divisão por zero.");
        }
    }
}

