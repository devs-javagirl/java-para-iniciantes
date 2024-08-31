package cap6;

class StaticMeth {
    static double val = 1024; // vari�vel est�tica
    static int divisor = 2; // vari�vel est�tica

    // m�todo est�tico
    static double valDiv2() {
        return val / divisor;
    }

}

class SDemo2 {
    public static void main(String args[]) {
        System.out.println("val is " + StaticMeth.val);
        System.out.println("StaticMeth.valDiv2(): " + StaticMeth.valDiv2());

        StaticMeth.val = 4;
        System.out.println("val is " + StaticMeth.val);
        System.out.println("StaticMeth.valDiv2(): " + StaticMeth.valDiv2());

        StaticMeth.divisor = 3;
        System.out.println("divisor is " + StaticMeth.divisor);
        System.out.println("StaticMeth.valDiv2(): " + StaticMeth.valDiv2());
    }
}

