package cap12;

public class QuadraticNonStatic {

    public static void main(String args[]) {
        double a = 4, b = 1, c = -3, x;

        // Primeira solução
        x = (-b + Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a);
        System.out.println("First solution: " + x);

        // Segunda solução
        x = (-b - Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a);
        System.out.println("Second solution: " + x);
    }

}
