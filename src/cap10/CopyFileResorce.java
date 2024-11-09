package cap10;

import java.io.*;

public class CopyFileResorce {
    public static void main(String args[]) throws IOException{
        int i;
        // Primeiro, confirma se os dois arquivos foram especificados.
        if(args.length != 2) {
            System.out.println("Usage: CopyFile from to");
            return;
        }
        // Abre e gerencia dois arquivos com a instrução try.
        try (FileInputStream fin = new FileInputStream(args[0]);
            FileOutputStream fout = new FileOutputStream(args[1]))
        {
            do
            {
                i = fin.read();
                if(i != -1)
                    fout.write(i);
            } while(i != -1);
        } catch(IOException exc) {
            System.out.println("I/O Error: " + exc);
        }
    }
}
