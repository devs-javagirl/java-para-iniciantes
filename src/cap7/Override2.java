package cap7;

// Sobreposicao de metodos.
class A2 {
    int i, j;
    A2(int a, int b) {
        i = a;
        j = b;
    }
    // exibe i e j
    void show() {
        System.out.println("i and j: " + i + " " + j);
    }
}
class B2 extends A2 {
    int k;
    B2(int a, int b, int c) {
        super(a, b);
        k = c;
    }
    // exibe k – esta versao sobrepoe show() em A
    void show() {
        super.show(); // essa instrucao chama o método show() de A
        System.out.println("k: " + k);
    }
}

public class Override2 {
    public static void main(String args[]) {
        B2 subOb = new B2(1, 2, 3);
        subOb.show(); // chama show() em B
    }
}
