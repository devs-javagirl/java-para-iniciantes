package cap9;

class ExcTest {
    // Gera uma exce��o.
    static void genException() {
        int nums[] = new int[4];
        System.out.println("Before exception is generated.");
        // gera uma exce��o de �ndice fora do limite
        nums[7] = 10; //A exce��o � gerada aqui.
        System.out.println("this won't be displayed");
    }
}

public class ExcDemo2 {
    public static void main(String args[]) {
        try {
            ExcTest.genException();
        } catch (ArrayIndexOutOfBoundsException exc) {
            // captura a exce��o
            System.out.println("Index out-of-bounds!");
        }

        System.out.println("After catch statement.");
    }
}
