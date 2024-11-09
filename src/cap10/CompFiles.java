package cap10;

import java.io.FileInputStream;
import java.io.IOException;

class CompFiles {
    public static void main(String args[]) {
        int i = 0, j = 0;
        int position = 0; // Contador de posição para rastrear onde os arquivos diferem

        // Verifica se foram fornecidos exatamente dois arquivos para comparação.
        if (args.length != 2) {
            System.out.println("Uso: CompFiles arquivo1 arquivo2");
            return;
        }

        // Bloco try-with-resources para abrir e comparar os arquivos automaticamente.
        try (FileInputStream f1 = new FileInputStream(args[0]);
             FileInputStream f2 = new FileInputStream(args[1])) {

            // Lê e compara os arquivos byte a byte, ignorando a caixa das letras.
            do {
                i = f1.read();
                j = f2.read();
                position++;

                // Converte para minúsculas para comparação ignorando caixa.
                if (Character.toLowerCase((char) i) != Character.toLowerCase((char) j)) {
                    System.out.println("Arquivos diferem na posição: " + position);
                    break;
                }
            } while (i != -1 && j != -1);

            // Se o loop terminou sem diferenças, os arquivos são iguais.
            if (i == -1 && j == -1) {
                System.out.println("Arquivos são iguais.");
            } else if (i != j) {
                System.out.println("Arquivos diferem.");
            }

        } catch (IOException exc) {
            System.out.println("Erro de I/O: " + exc);
        }
    }
}
