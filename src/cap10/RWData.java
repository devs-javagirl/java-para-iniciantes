package cap10;

import  java.io.*;

public class RWData {
    public static void main(String args[])
    {
        int i = 190;
        double d = 41023.56;
        boolean b = false;

        // Grava alguns valores.
        try (DataOutputStream dataOut =
                     new DataOutputStream(new FileOutputStream("C:\\arq_estudo_java\\testdata1.TXT")))
        {
            System.out.println("Writing " + i);
            dataOut.writeInt(i);
            System.out.println("Writing " + d);
            dataOut.writeDouble(d);
            System.out.println("Writing " + b);
            dataOut.writeBoolean(b);
            System.out.println("Writing " + 12.2 * 7.4);
            dataOut.writeDouble(12.2 * 7.4);
        }
        catch(IOException exc) {
            System.out.println("Write error.");
            return;
        }
        System.out.println();

        // Agora os lê.
        try (DataInputStream dataIn =
                     new DataInputStream(new FileInputStream("C:\\arq_estudo_java\\testdata1.TXT")))
        {
            i = dataIn.readInt();
            System.out.println("Reading " + i);
            d = dataIn.readDouble();
            System.out.println("Reading " + d);
            b = dataIn.readBoolean();
            System.out.println("Reading " + b);
            d = dataIn.readDouble();
            System.out.println("Reading " + d);
        }
        catch(IOException exc) {
            System.out.println("Read error.");
        }
    }
}