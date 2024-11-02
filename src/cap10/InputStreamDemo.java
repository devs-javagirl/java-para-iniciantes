package cap10;

import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class InputStreamDemo {

    public static void main(String[] args) {

        try(InputStream input = System.in; Scanner scanner = new Scanner(input)) {
            System.out.print("Digite um caractere: ");
            String texto = scanner.nextLine();
            System.out.println("Você digitou: " + texto);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

