package cap9;

class UseFinally {
    public static void genException(int what) {
        int t;
        int nums[] = new int[2];
        System.out.println("Receiving " + what);
        try {
            switch(what) {
                case 0:
                    t = 10 / what; // gera erro de divisão por zero
                    break;
                case 1:
                    nums[4] = 4; // gera erro de índice de array.
                    break;
                case 2:
                    return; // retorna do bloco try
            }
        }
        catch (ArithmeticException exc) {
            // captura a exceção
            System.out.println("Can't divide by Zero!");
            return; // retorna de catch
        }
        catch (ArrayIndexOutOfBoundsException exc) {
            // captura a exceção
            System.out.println("No matching element found.");
        }
        finally {
            System.out.println("Leaving try.");
        }
    }
}


public class FinallyDemo {
    public static void main(String args[]) {
        for(int i=0; i < 3; i++) {
            UseFinally.genException(i);
            System.out.println();
        }
    }
}
