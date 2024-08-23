package cap3;

// Este programa contém um erro.
class BreakErr {
    public static void main(String args[]) {
        one: for(int i=0; i<3; i++) {
            System.out.print("Pass " + i + ": ");
        } //fechamento do bloco rotulado one

        for(int j=0; j<100; j++) {
        //    if(j == 10) break one; // ERRADO
            System.out.print(j + " ");
        }
    }
}
