package cap9;

// Usa uma exceção personalizada.
// Cria uma exceção.
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
        // Aqui, number contém alguns valores ímpares.
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
                // captura a exceção
                System.out.println("Can't divide by Zero!");
            }
            catch (ArrayIndexOutOfBoundsException exc) {
                // captura a exceção
                System.out.println("No matching element found.");
            }
            catch (NonIntResultException exc) {
                System.out.println(exc);
            }
        }
    }
}
