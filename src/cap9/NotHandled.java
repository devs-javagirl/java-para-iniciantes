package cap9;

public class NotHandled {
    public static void main(String args[]) {
        int nums[] = new int[4];
        System.out.println("Before exception is generated.");
        // gera uma exce��o de �ndice fora do limite
        nums[7] = 10;
    }
}
