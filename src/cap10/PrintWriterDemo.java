package cap10;

import java.io.PrintWriter;

public class PrintWriterDemo {

    public record Product(String name, double price) {}
    public static void main(String args[]) {

        PrintWriter pw = new PrintWriter(System.out, true);
        int i = 10;
        double d = 123.65;
        pw.println("Using a PrintWriter.");
        pw.println(i);
        pw.println(d);
        pw.println(i + " + " + d + " is " + (i + d));

        Product product1 = new Product("Pencil", 2.45);
        pw.println(product1);
    }
}
