package cap9;

class Rethrow {
    public static void genException() {
        // aqui, numer � mais longo do que denom
        int numer[] = { 4, 8, 16, 32, 64, 128, 256, 512 };
        int denom[] = { 2, 0, 4, 4, 0, 8 };
        for(int i=0; i<numer.length; i++) {
            try {
                System.out.println(numer[i] + " / " +
                        denom[i] + " is " +
                        numer[i]/denom[i]);
            }
            catch (ArithmeticException exc) {
                // captura a exce��o
                System.out.println("Can't divide by Zero!");
            }
            catch (ArrayIndexOutOfBoundsException exc) {
                // captura a exce��o
                System.out.println("No matching element found.");
                throw exc; // relan�a a exce��o
            }
        }
    }
}

class RethrowDemo {
    public static void main(String args[]) {
        try {
            Rethrow.genException();
        }
        catch(ArrayIndexOutOfBoundsException exc) {
            // recaptura a exce��o
            System.out.println("Fatal error - " +
                    "program terminated.");
        }
    }
}
