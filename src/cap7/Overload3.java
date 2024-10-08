package cap7;

/* Metodos com assinaturas diferentes sao
   sobrecarregados e nao sobrepostos. */
class A3 {
    int i, j;
    A3(int a, int b) {
        i = a;
        j = b;
    }
    // exibe i e j
    void show() {
        System.out.println("i and j: " + i + " " + j);
    }
}

// Cria uma subclasse estendendo a classe A.
class B3 extends A3 {
    int k;
    B3(int a, int b, int c) {
        super(a, b);
        k = c;
    }
    // sobrecarrega show()
    void show(String msg) {
        System.out.println(msg + k);
    }
}

public class Overload3 {
    public static void main(String args[]) {
        B3 subOb = new B3(1, 2, 3);
        subOb.show("This is k: "); // chama show() em B
        subOb.show(); // chama show() em A
    }
}
