package cap10;

import java.io.*;

public class ShowFile3 {
    public static void main(String args[])
    {
        int i;
        FileInputStream fin = null;

        // Primeiro, confirma se um nome de arquivo foi especificado.
        if(args.length != 1) {
            System.out.println("Usage: ShowFile filename");
            return;
        }
        // a seguir abre um arquivo, l� caracteres at� EOF ser alcan�ado
        // e ent�o fecha o arquivo via um bloco finally.
        try {
            fin = new FileInputStream(args[0]);

            do
            {
                i = fin.read();
                if(i != -1)
                    System.out.print((char) i);
            } while(i != -1);
        } catch(FileNotFoundException exc) {
            System.out.println("File Not Found.");
        } catch(IOException exc) {
            System.out.println("An I/O Error Occurred");
        } finally {
            // Fecha o arquivo em todos os casos.
            try {
                if(fin != null)
                    fin.close();  //S� fecha fin se n�o for null.
            } catch(IOException exc) {
                System.out.println("Error Closing File");
            }
        }
    }
}
