package cap12;

import static java.lang.Math.sqrt;
import static java.lang.Math.pow;
import static java.lang.Math.E;
public class QuadraticStatic {

    class Quadratic {
        public static void main(String args[]) {
            double a = 4, b = 1, c = -3, x;

            // Primeira solução
            x = (-b + sqrt(pow(b, 2) - 4 * a * c)) / (2 * a);
            System.out.println("First solution: " + x);

            System.out.println("E: " + E);

            // Segunda solução
            x = (-b - sqrt(pow(b, 2) - 4 * a * c)) / (2 * a);
            System.out.println("Second solution: " + x);
        }
    }

}
