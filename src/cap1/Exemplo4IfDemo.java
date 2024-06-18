package cap1;

public class Exemplo4IfDemo {
    public static void main(String args[]) {
        int a, b, c;
        a = 2;
        b = 3;

        if(a < b) System.out.println("a eh menor que b");

        // esta instrução não exibirá nada
        if(a == b) System.out.println("you won't see this");

        System.out.println(); //linha em branco

        c = a - b; // c contém -1
        System.out.println("c contains -1: " + c);
        if(c >= 0) System.out.println("c is non-negative");

        if(c < 0) System.out.println("c is negative");

        System.out.println(); //linha em branco

        c = b - a; // agora c contém 1
        System.out.println("c contains 1: " + c);
        if(c >= 0) System.out.println("c is non-negative");
        if(c < 0) System.out.println("c is negative");
    }
}
