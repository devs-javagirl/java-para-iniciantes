package cap9;

import java.io.*;

public class IOExceptionExample {
    public static void main(String[] args) {
        try {
            // Tentando abrir um arquivo que n�o existe
            FileReader reader = new FileReader("arquivo_inexistente.txt");
        } catch (IOException e) {
            System.out.println("Erro: O arquivo n�o foi encontrado.");
        }

        try {
            FileReader reader = new FileReader("C:\\Nova pasta\\arquivo.txt");
            System.out.println("Sucesso: O arquivo foi encontrado.");
        } catch (IOException e) {
            System.out.println("Erro: O arquivo n�o foi encontrado.");
        }
    }
}

