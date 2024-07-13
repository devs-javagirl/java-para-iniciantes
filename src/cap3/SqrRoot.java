package cap3;

// Exibe as ra�zes quadradas de 1 a 99 e o erro de arredondamento.
class SqrRoot {
    public static void main(String args[]) {
        double num, sroot, rerr;
        for(num = 1.0; num < 100.0; num++) {
            sroot = Math.sqrt(num);
            System.out.println("Square root of " + num +
                    " is " + sroot);
            // calcula o erro de arredondamento
            rerr = num - (sroot * sroot);
            System.out.println("Rounding error is " + rerr);
            System.out.println();
        }
    }
}
