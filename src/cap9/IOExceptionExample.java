package cap9;

import java.io.*;



public class IOExceptionExample {
    public static void main(String[] args) {
        try {
            // Tentando abrir um arquivo que não existe
            leArquivo();
        } catch (IOException e) {
            System.out.println("Erro: O arquivo não foi encontrado.");
        }

        try {
            FileReader reader = new FileReader("C:\\Nova pasta\\arquivo.txt");
            System.out.println("Sucesso: O arquivo foi encontrado.");
        } catch (IOException e) {
            System.out.println("Erro: O arquivo não foi encontrado.");
        }
    }

    public static void leArquivo() throws  IOException {
        FileReader reader = new FileReader("arquivo_inexistente.txt");
    }
}

