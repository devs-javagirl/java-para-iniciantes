package cap9;

public class OutOfMemoryErrorExample extends Throwable {
    public static void main(String[] args) {
        try {
            // Tentando alocar um array muito grande
            int[] largeArray = new int[Integer.MAX_VALUE];
        } catch (OutOfMemoryError e) { //Exception
            System.out.println("Erro: Sem memória suficiente!");
        }
    }
}
