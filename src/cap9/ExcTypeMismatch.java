package cap9;

public class ExcTypeMismatch {
    public static void main(String args[]) {
        int nums[] = new int[4]; //Essa linha lança uma ArrayIndexOutOfBoundsException.

        try {
            System.out.println("Before exception is generated.");
            //gera uma exceção de índice fora do limite - ArrayIndexOutOfBoundsException
            nums[7] = 10;
            System.out.println("this won't be displayed");

        /* Não pode capturar um erro de limite de array com uma ArithmeticException. */
        } catch (ArithmeticException exc) {
            System.out.println("Index out-of-bounds!");
        } /*catch (ArrayIndexOutOfBoundsException exc) {
            System.out.println("Index out-of-bounds!");
        }*/


        System.out.println("After catch statement.");
    }
}
