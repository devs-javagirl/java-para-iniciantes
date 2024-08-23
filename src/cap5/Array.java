package cap5;

public class Array {
    public static void main(String args[]) {
        int sample[] = new int[10];
        int i;

        for (i = 0; i < 10; i = i + 1)
            sample[i] = i;

        System.out.println("Sample[" + i + "] : " + sample[i-1]);
    }
}
