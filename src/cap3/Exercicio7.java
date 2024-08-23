package cap3;

public class Exercicio7 {
    public static void main(String[] args) {

        boolean running = true;
        int x = 0, y = 0;

        for (int i = 0; i < 10; i++) {
            while (running) {
                if (x < y)
                    break;
                // ...
            }
            System.out.println("after while");
        }
        System.out.println("After for");
    }
}
