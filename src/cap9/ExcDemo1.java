package cap9;

public class ExcDemo1 {
    public static void main(String args[]) {
        int nums[] = new int[4];
        try {
            System.out.println("Before exception is generated.");
            // Gera um exce��o de �ndice fora dos limites.
            nums[7] = 10; //Tenta indexar excedendo o limite de nums.
            System.out.println("this won't be displayed");
        } catch (ArrayIndexOutOfBoundsException exc) {
            // captura a exce��o
           System.out.println("Index out-of-bounds!");
        }

        System.out.println("After catch statement.");
    }
}
