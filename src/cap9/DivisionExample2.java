package cap9;

public class DivisionExample2 {

    // Método que trata a divisão por zero internamente
    public static void divideNumbers(int a, int b) {
        try {
            int result = a / b;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero.");
        }
    }

    public static void main(String[] args) {
        // Chamando o método que trata a exceção internamente
        divideNumbers(10, 0); // Tentativa de divisão por zero
        divideNumbers(10, 2); // Divisão válida
    }
}

