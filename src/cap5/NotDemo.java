package cap5;

class NotDemo {
    public static void main(String args[]) {
        //Inverte o estado de todos os bits do operando.
        byte b = -34;
        for(int t = 128; t > 0; t = t/2) {
            if((b & t) != 0) System.out.print("1 ");
            else System.out.print("0 ");
        }
        System.out.println();

        // Inverte todos os bits
        b = (byte) ~b; // inverte todos os bits
        for(int t = 128; t > 0; t = t/2) {
            if((b & t) != 0) System.out.print("1 ");
            else System.out.print("0 ");
        }
    }
}

