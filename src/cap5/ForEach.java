package cap5;

public class ForEach {
    public static void main(String[] args) {
        int nums[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = 0;

        // Usando o loop for-each para exibir e somar os valores
        for (int x : nums) {
            System.out.println("Value is: " + x);
            sum += x;

            x = 0; // Não afeta o array original
        }

        System.out.println("Summation: " + sum);
    }
}
