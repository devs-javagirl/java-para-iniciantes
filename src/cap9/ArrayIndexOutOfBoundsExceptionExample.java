package cap9;

public class ArrayIndexOutOfBoundsExceptionExample {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3};
        try {
            // Tentando acessar um �ndice fora do array
            System.out.println(numbers[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Erro: �ndice fora dos limites do array.");
        }
    }
}

