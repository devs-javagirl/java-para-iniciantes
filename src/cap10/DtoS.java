package cap10;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class DtoS {

    public static void main(String args[]) {
        String s;
        // Cria e usa um FileReader encapsulado em um BufferedReader.
        try (BufferedReader br = new BufferedReader(new FileReader("C:\\arq_estudo_java\\test.txt")))
        {
            while((s = br.readLine()) != null) {
                System.out.println(s);
            }
        } catch(IOException exc) {
            System.out.println("I/O Error: " + exc);
        }
    }
}
