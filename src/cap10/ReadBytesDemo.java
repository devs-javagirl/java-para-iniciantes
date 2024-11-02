package cap10;

import java.io.IOException;

public class ReadBytesDemo {
    public static void main(String args[]) throws IOException {
        byte data[] = new byte[10];
        System.out.println("Enter some characters:");
        System.in.read(data); // Lê o array de bytes
        System.out.print("You entered: ");
        for (int i = 0; i < data.length; i++)
            System.out.print((char) data[i]); // Converte e exibe cada byte como caractere
    }
}
