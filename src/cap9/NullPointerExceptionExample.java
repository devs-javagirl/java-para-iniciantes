package cap9;

public class NullPointerExceptionExample {
    public static void main(String[] args) {
        String str = null;
        try {
            // Tentando acessar um método em um objeto nulo
            System.out.println(str.length());
        } catch (NullPointerException e) {
            System.out.println("Erro: Tentativa de acessar um objeto nulo.");
        }
    }
}

