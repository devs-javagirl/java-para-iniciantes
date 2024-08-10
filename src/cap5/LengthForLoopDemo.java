package cap5;

public class LengthForLoopDemo {
    public static void main(String[] args) {
        int list[] = new int[10];

        // Usando length para controlar o loop
        for (int i = 0; i < list.length; i++) {
            list[i] = i * i;
        }

        // Imprimindo os valores do array list
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + " ");
        }
        // Saída: 0 1 4 9 16 25 36 49 64 81
    }
}
