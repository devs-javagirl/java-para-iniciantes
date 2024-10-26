package cap9;

// Usa uma exce��o personalizada.
// Cria uma exce��o.
class NonIntResultException extends Exception {
    int n;
    int d;
    NonIntResultException(int i, int j) {
        n = i;
        d = j;
    }
    public String toString() {
        return "Result of " + n + " / " + d +
                " is non-integer.";
    }
}
class CustomExceptDemo {
    public static void main(String args[]) {
        // Aqui, number cont�m alguns valores �mpares.
        int number[] = { 4, 8, 15, 32, 64, 127, 256, 512 };
        int denom[] = { 2, 0, 4, 4, 0, 8 };

        for(int i=0; i<number.length; i++) {
            try {
                if((number[i]%denom[i]) != 0)
                    throw new
                            NonIntResultException(number[i], denom[i]);
                System.out.println(number[i] + " / " +
                        denom[i] + " is " +
                        number[i]/denom[i]);
            }
            catch (ArithmeticException exc) {
                // captura a exce��o
                System.out.println("Can't divide by Zero!");
            }
            catch (ArrayIndexOutOfBoundsException exc) {
                // captura a exce��o
                System.out.println("No matching element found.");
            }
            catch (NonIntResultException exc) {
                System.out.println(exc);
            }
        }
    }
}
