package cap10;

import  java.io.*;

public class ShowFileResource {
    public static void main(String args[])
    {
        int i;
        // Primeiro, confirma se um nome de arquivo foi especificado.
        if(args.length != 1) {
            System.out.println("Usage: ShowFile filename");
            return;
        }
        // O c�digo a seguir usa try-with-resources para abrir um arquivo
        // e depois fech�-lo automaticamente quando o bloco try � deixado.
        try(FileInputStream fin = new FileInputStream(args[0])) {
            do
            {
                i = fin.read();
                if(i != -1)
                    System.out.print((char) i);
            } while(i != -1);
        } catch(IOException exc) {
            System.out.println("I/O Error: " + exc);
        }
    }
}
