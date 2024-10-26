package cap9;

public class DivisionExample2 {

    // M�todo que trata a divis�o por zero internamente
    public static void divideNumbers(int a, int b) {
        try {
            int result = a / b;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero.");
        }
    }

    public static void main(String[] args) {
        // Chamando o m�todo que trata a exce��o internamente
        divideNumbers(10, 0); // Tentativa de divis�o por zero
        divideNumbers(10, 2); // Divis�o v�lida
    }
}

