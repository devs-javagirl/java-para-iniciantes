package cap9;

class ExcTest1 {
    static void genException() {
        int nums[] = new int[4];
        System.out.println("Before exception is generated.");
        // gera uma exceção de índice fora do limite
        nums[7] = 10;
        System.out.println("this won't be displayed");
    }
}


public class UseThrowableMethods {
    public static void main(String args[]) {
        try {
            ExcTest1.genException();
        }
        catch (ArrayIndexOutOfBoundsException exc) {
            // captura a exceção
            System.out.println("Standard message is: ");
            System.out.println(exc);
            System.out.println("\nStack trace: ");
            exc.printStackTrace();
        }
        System.out.println("After catch statement.");
    }
}
