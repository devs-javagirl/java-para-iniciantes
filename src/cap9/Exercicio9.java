package cap9;

class MyClass extends Exception { // Agora MyClass � uma exce��o
    public MyClass(String message) {
        super(message);
    }
}

public class Exercicio9 {
    public static void main(String[] args) {
        try {
            throw new MyClass("Erro personalizado"); // Agora pode ser lan�ada
        } catch (MyClass e) {
            System.out.println("Exce��o capturada: " + e.getMessage());
        }
    }
}
