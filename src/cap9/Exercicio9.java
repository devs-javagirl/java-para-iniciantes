package cap9;

class MyClass extends Exception { // Agora MyClass é uma exceção
    public MyClass(String message) {
        super(message);
    }
}

public class Exercicio9 {
    public static void main(String[] args) {
        try {
            throw new MyClass("Erro personalizado"); // Agora pode ser lançada
        } catch (MyClass e) {
            System.out.println("Exceção capturada: " + e.getMessage());
        }
    }
}
