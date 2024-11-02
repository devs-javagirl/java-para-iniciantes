package cap10;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Logger;

public class IODemo {

    public static void main(String[] args) {

        try (FileInputStream in = new FileInputStream("C:/arquivos/entrada.txt");
             FileOutputStream out = new FileOutputStream("C:/arquivos/saida.txt")
        ) {
            int byteData;
            while ((byteData = in.read()) != -1) {
                out.write(byteData);
                //Logger.getGlobal().info("Byte copiado: " + byteData);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (FileOutputStream fos = new FileOutputStream("C:/arquivos/arquivo1.txt")) {
            fos.write("Texto de exemplo".getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Este é o fluxo de saída padrão.");
        System.err.println("Este é o fluxo de erro.");

    }

}
