package cap9;

public class NestTrys {
    // Usa um bloco try aninhado.
        public static void main(String args[]) {
            // O array numer é mais longo que denom.
            int numer[] = { 4, 8, 16, 32, 64, 128, 256, 512 };
            int denom[] = { 2, 0, 4, 4, 0, 8 };

            try { // Bloco try externo
                for (int i = 0; i < numer.length; i++) {
                    try { // Bloco try aninhado
                        // Tenta realizar a divisão
                        System.out.println(numer[i] + " / " + denom[i] + " is " + numer[i] / denom[i]);
                    } catch (ArithmeticException exc) {
                        // Captura exceção de divisão por zero
                        System.out.println("Can't divide by Zero!");
                    }
                }
            } catch (ArrayIndexOutOfBoundsException exc) {
                // Captura exceção de acesso fora dos limites do array
                System.out.println("No matching element found.");
                System.out.println("Fatal error - program terminated.");
            }
        }
}
