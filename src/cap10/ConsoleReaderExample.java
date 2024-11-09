package cap10;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConsoleReaderExample {
    public static void main(String args[]) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.print("Digite uma linha de texto: ");
            String linha = reader.readLine();
            System.out.println("Você digitou: " + linha);
        } catch(IOException e) {
            System.out.println("Erro de entrada/saída: " + e);
        }
    }
}
