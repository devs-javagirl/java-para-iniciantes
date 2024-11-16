package cap10;

/* Copia um arquivo de texto, substituindo espaços por hífens.
   Esta versão usa fluxos de caracteres.
   Para usar esse programa, especifique o nome do
   arquivo de origem e do arquivo de destino.
   Por exemplo,
   java Hyphen2 source target
 */
import java.io.*;
class Hyphen2 {
    public static void main(String args[]) throws IOException {
        int i;
        // Primeiro verifica se os dois arquivos foram especificados.
        if(args.length !=2 ) {
            System.out.println("Usage: CopyFile From To");
            return;
        }
        // Copia o arquivo e insere os hifens.
        // Usa a instrução try-with-resources.
        try (FileReader fin = new FileReader(args[0]);
             FileWriter fout = new FileWriter(args[1]))
        {
            do
            {
                i = fin.read();
                // converte o espaço em um hífen
                if((char)i == ' ') i = '=';
                if(i != -1) fout.write(i);
            } while(i != -1);
        } catch(IOException exc) {
            System.out.println("I/O Error: " + exc);
        }
    }
}
