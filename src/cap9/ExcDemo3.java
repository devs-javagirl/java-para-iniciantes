package cap9;

public class ExcDemo3 {

    public static void main(String args[]) {
        int numer[] = { 4, 8, 16, 32, 64, 128 };
        int denom[] = { 2, 0, 4, 4, 0, 8 };

        for (int i = 0; i < numer.length; i++) {
            try {
                // Tenta realizar a divisão
                System.out.println(numer[i] + " / " + denom[i] + " is " + numer[i] / denom[i]);
            } catch (Exception exc) {
                // Captura e trata a exceção de divisão por zero
                System.out.println("Can't divide by Zero!");
            }
        }
    }

}
