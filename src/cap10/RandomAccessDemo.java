package cap10;


import java.io.IOException;
import java.io.RandomAccessFile;

class RandomAccessDemo {
    public static void main(String args[]) {
        double data[] = { 19.4, 10.1, 123.54, 33.0, 87.9, 74.25 };
        double d;

        // Abre e usa um arquivo de acesso aleatório
        try (RandomAccessFile raf = new RandomAccessFile("random.dat", "rw")) {

            // Grava os valores no arquivo
            for(int i = 0; i < data.length; i++) {
                raf.writeDouble(data[i]);
            }

            // Lê valores específicos com o método seek()
            raf.seek(0); // Busca o primeiro valor
            d = raf.readDouble();
            System.out.println("Primeiro valor: " + d);

            raf.seek(8); // Busca o segundo valor
            d = raf.readDouble();
            System.out.println("Segundo valor: " + d);

            raf.seek(8 * 3); // Busca o quarto valor
            d = raf.readDouble();
            System.out.println("Quarto valor: " + d);

            System.out.println("\nValores alternados:");
            for(int i = 0; i < data.length; i += 2) {
                raf.seek(8 * i); // Busca o i-ésimo valor
                d = raf.readDouble();
                System.out.print(d + " ");
            }

        } catch(IOException exc) {
            System.out.println("Erro de I/O: " + exc);
        }

        //CONVERTER DOUBLE EM BINARIO
        double valor = 10.5;
        long bits = Double.doubleToLongBits(valor);
        String binario = Long.toBinaryString(bits);
        System.out.println("\nValor: " + valor + " - Binário: " + binario);
    }
}
