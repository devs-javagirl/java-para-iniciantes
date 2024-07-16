package cap2;

// Demonstra os operadores relacionais e lógicos.
class RelLogOps {
    public static void main(String args[]) {
        int i, j;
        boolean b1, b2;
        i = 10;
        j = 11;
        if(i < j) System.out.println("i < j");
        if(i <= j) System.out.println("i <= j");
        if(i != j) System.out.println("i != j");
        if(i == j) System.out.println("this won't execute");
        if(i >= j) System.out.println("this won't execute");
        if(i > j) System.out.println("this won't execute");
        b1 = true;
        b2 = false;
        if(b1 & b2) System.out.println("this won't execute");
        if(!(b1 & b2)) System.out.println("!(b1 & b2) is true");
        if(b1 | b2) System.out.println("b1 | b2 is true");
        if(b1 ^ b2) System.out.println("b1 ^ b2 is true");

        boolean b3 = true;
        boolean b4 = false;

        if(b3 || b4) System.out.println("b3 || b4");
    }
}
