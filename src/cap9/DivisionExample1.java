package cap9;

public class DivisionExample1 {
    // M�todo que realiza a divis�o, mas n�o trata a exce��o
    public static int divideNumbers(int a, int b) throws ArithmeticException {
        return a / b; // Pode lan�ar ArithmeticException
    }

    public static void main(String[] args) {
        try {
            // Chamando o m�todo que pode lan�ar a exce��o
            int result = divideNumbers(10, 0); // Tentativa de divis�o por zero
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            // Tratamento da exce��o no main
            System.out.println("Error: Cannot divide by zero.");
        }

        // Executando uma divis�o v�lida
        try {
            int result = divideNumbers(10, 2); // Divis�o v�lida
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero.");
        }
    }
}
