package cap10;

import java.io.PrintStream;

public class WriteDemo {
    public static void main(String args[]) {
        int b = 'X';

        System.out.write(b);
        System.out.write('\n');

        String texto = "Hello";
        PrintStream ps = new PrintStream(System.out);
        ps.printf("Texto: %s\n", texto);

    }
}
