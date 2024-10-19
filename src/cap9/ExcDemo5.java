package cap9;

public class ExcDemo5 {
    public static void main(String args[]) {
        // O array numer é mais longo que denom.
        int numer[] = { 4, 8, 16, 32, 64, 128, 256, 512 };
        int denom[] = { 2, 0, 4, 4, 0, 8 };

        for (int i = 0; i < numer.length; i++) {
            try {
                // Tenta realizar a divisão
                System.out.println(numer[i] + " / " + denom[i] + " is " + numer[i] / denom[i]);
            } catch (ArrayIndexOutOfBoundsException exc) {
                // Captura exceção de acesso fora dos limites do array
                System.out.println("No matching element found.");
            } catch (Throwable exc) {
                // Captura qualquer outra exceção
                System.out.println("Some exception occurred.");
            }
        }
    }
}
