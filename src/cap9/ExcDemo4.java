package cap9;

public class ExcDemo4 {
    public static void main(String args[]) {
        // O array numer � maior que denom.
        int numer[] = { 4, 8, 16, 32, 64, 128, 256, 512 };
        int denom[] = { 2, 0, 4, 4, 0, 8 };

        for (int i = 0; i < numer.length; i++) {
            try {
                // Tenta realizar a divis�o
                System.out.println(numer[i] + " / " + denom[i] + " is " + numer[i] / denom[i]);
            } catch (ArithmeticException exc) {
                // Captura e trata a exce��o de divis�o por zero
                System.out.println("Can't divide by Zero!");
            } catch (ArrayIndexOutOfBoundsException exc) {
                // Captura e trata a exce��o de acesso fora dos limites do array
                System.out.println("No matching element found.");
            }
        }
    }
}
