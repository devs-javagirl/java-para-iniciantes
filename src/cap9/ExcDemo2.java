package cap9;

class ExcTest {
    // Gera uma exceção.
    static void genException() {
        int nums[] = new int[4];
        System.out.println("Before exception is generated.");
        // gera uma exceção de índice fora do limite
        nums[7] = 10; //A exceção é gerada aqui.
        System.out.println("this won't be displayed");
    }
}

public class ExcDemo2 {
    public static void main(String args[]) {
        try {
            ExcTest.genException();
        } catch (ArrayIndexOutOfBoundsException exc) {
            // captura a exceção
            System.out.println("Index out-of-bounds!");
        }

        System.out.println("After catch statement.");
    }
}
