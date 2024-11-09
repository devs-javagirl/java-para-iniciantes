package cap10;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

class FileWriterDemo {
    public static void main(String args[]) {
        String str;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter text ('stop' to quit).");

        try (FileWriter fw = new FileWriter("C://arquivos/test.txt")) {
            do {
                System.out.print("Write the line text: ");
                str = br.readLine();
                if (str.compareTo("stop") == 0) break;
                str = str + "\r\n"; // adiciona nova linha
                fw.write(str);
            } while (str.compareTo("stop") != 0);
        } catch(IOException exc) {
            System.out.println("I/O Error: " + exc);
        }
    }
}
