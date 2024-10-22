package cap9;

public class DivisionExample1 {
    // Método que realiza a divisão, mas não trata a exceção
    public static int divideNumbers(int a, int b) throws ArithmeticException {
        return a / b; // Pode lançar ArithmeticException
    }

    public static void main(String[] args) {
        try {
            // Chamando o método que pode lançar a exceção
            int result = divideNumbers(10, 0); // Tentativa de divisão por zero
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            // Tratamento da exceção no main
            System.out.println("Error: Cannot divide by zero.");
        }

        // Executando uma divisão válida
        try {
            int result = divideNumbers(10, 2); // Divisão válida
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero.");
        }
    }
}
