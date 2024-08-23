package cap5;

public class ArrayDemo {
    // Demonstra um array unidimensional.
    public static void main(String args[]) {
        int sample[] = new int[10];
        int i;

        //Os arrays sao indexados a partir de zero.
        for (i = 0; i < 10; i++)
            sample[i] = i;

        for (i = 0; i < 10; i = i + 1)
            System.out.println("This is sample[" + i + "]: " + sample[i]);
    }
}
