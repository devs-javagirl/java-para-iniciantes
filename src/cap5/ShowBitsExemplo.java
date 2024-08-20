package cap5;

class ShowBitsExemplo {
    public static void main(String args[]) {
        //Usando AND para mostrar bits de um valor byte:
        byte val = 123;
        for(int t = 128; t > 0; t = t/2) {
            System.out.println(Integer.toBinaryString(val) + " val em binário ");
            System.out.println(Integer.toBinaryString(t) + " t em binário ");

            System.out.print("val & t = ");
            if((val & t) != 0) System.out.print("1 \n");
            else System.out.print("0 \n");
        }
    }
}

