package cap9;

public class ExcTypeMismatch {
    public static void main(String args[]) {
        int nums[] = new int[4]; //Essa linha lan�a uma ArrayIndexOutOfBoundsException.

        try {
            System.out.println("Before exception is generated.");
            //gera uma exce��o de �ndice fora do limite - ArrayIndexOutOfBoundsException
            nums[7] = 10;
            System.out.println("this won't be displayed");

        /* N�o pode capturar um erro de limite de array com uma ArithmeticException. */
        } catch (ArithmeticException exc) {
            System.out.println("Index out-of-bounds!");
        } /*catch (ArrayIndexOutOfBoundsException exc) {
            System.out.println("Index out-of-bounds!");
        }*/


        System.out.println("After catch statement.");
    }
}
