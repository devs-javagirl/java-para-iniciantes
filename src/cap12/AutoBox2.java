package cap12;

class AutoBox2 {
    static void m(Integer v) {
        System.out.println("m() received " + v);
    }

    static int m2() {
        return 10;
    }

    static Integer m3() {
        return 99;
    }

    public static void main(String[] args) {
        // Autoboxing ao passar argumento
        m(199);

        // Autoboxing ao atribuir retorno de um int a um Integer
        Integer iOb = m2();
        System.out.println("Return value from m2() is " + iOb);

        // Autounboxing ao atribuir retorno de um Integer a um int
        int i = m3();
        System.out.println("Return value from m3() is " + i);

        // Autounboxing em operações
        iOb = 100;
        System.out.println("Square root of iOb is " + Math.sqrt(iOb));
    }
}
