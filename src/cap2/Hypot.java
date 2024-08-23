package cap2;

public class Hypot {
    /*
 Usa o teorema de Pitágoras
 para encontrar o comprimento
 da hipotenusa dados os comprimentos
 dos dois lados opostos.
*/

    public static void main(String args[]) {
       double x, y, z;
       x = 3;
       y = 4;
       z = Math.sqrt(x*x + y*y);
       System.out.println("Hypotenuse is " +z);
    }
}
