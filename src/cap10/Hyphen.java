package cap10;

/* Copia um arquivo de texto, substituindo espaços por hífens.
   Esta versão utiliza fluxos de bytes.
   Para usar este programa, especifique o nome
   do arquivo de origem e do arquivo de destino.
   Por exemplo,
   java Hyphen source target
 */

import java.io.*;
class Hyphen {
    public static void main(String args[])
    {
        int i;
        FileInputStream fin = null;
        FileOutputStream fout = null;
        // Primeiro verifica se os dois arquivos foram especificados.
        if(args.length !=2 ) {
            System.out.println("Usage: Hyphen From To");
            return;
        }
        // Copia o arquivo e insere os hifens.
        try {
            fin = new FileInputStream(args[0]);
            fout = new FileOutputStream(args[1]);
            do
            {
                i = fin.read();
                // converte o espaço em um hífen
                if((char)i == ' ') i = '-';
                if(i != -1) fout.write(i);
            } while(i != -1);

        } catch(IOException exc) {
            System.out.println("I/O Error: " + exc);
        } finally {
            try {
                if(fin != null) fin.close();
            } catch(IOException exc) {
                System.out.println("Error closing input file.");
            }
            try {
                if(fin != null) fout.close();
            } catch(IOException exc) {
                System.out.println("Error closing output file.");
            }
        }
    }
}
