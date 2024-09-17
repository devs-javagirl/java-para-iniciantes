package cap7;

// Sobreposicao de metodos.
class A1 {
    int i, j;
    A1(int a, int b) {
        i = a;
        j = b;
    }
    // exibe i e j
    void show() {
        System.out.println("i and j: " + i + " " + j);
    }
}
class B1 extends A1 {
    int k;
    B1(int a, int b, int c) {
        super(a, b);
        k = c;
    }
    // exibe k – esta versao sobrepoe show() em A
    void show() {
        System.out.println("k: " + k);
    }
}

public class Override {
    public static void main(String args[]) {
        B1 subOb = new B1(1, 2, 3);
        subOb.show(); // chama show() em B
    }
}
