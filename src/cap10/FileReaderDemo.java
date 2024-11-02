package cap10;

import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderDemo {

    public static void main(String[] args) {
        try (FileReader fr = new FileReader("C:/arquivos/entrada.txt");
             BufferedWriter bw = new BufferedWriter(new FileWriter("C:/arquivos/saida2.txt"))) {
            int charData;
            while ((charData = fr.read()) != -1) {
                bw.write(charData);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
