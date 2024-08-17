package cap5;

/*
 Tente Isto 5-3
 Uma classe que exibe a representação binária de um valor.
*/

public class ShowBits {
    int numbits;
    ShowBits(int n) {
        numbits = n;
    }
    void show(long val) {
        long mask = 1;
        // desloca um 1 para a esquerda para a posição apropriada
        mask <<= numbits-1;
        int spacer = 0;
        for(; mask != 0; mask >>>= 1) {
            if((val & mask) != 0) System.out.print("1");
            else System.out.print("0");
            spacer++;
            if((spacer % 8) == 0) {
                System.out.print(" ");
                spacer = 0;
            }
        }
        System.out.println();
    }
}
