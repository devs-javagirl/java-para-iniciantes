package cap7.superuse;

// Usando super para resolver o problema de ocultação de nomes.
class A {
    int i;
}

// Cria uma subclasse estendendo a classe A.
class B extends A {
    int i; // essa variável i oculta a variável i de A.

    B(int a, int b) {
        super.i = a; // i de A
        i = b;       // i de B
    }

    void show() {
        System.out.println("i in superclass: " + super.i);
        System.out.println("i in subclass: " + this.i);
    }
}

class Superuse {
    public static void main(String args[]) {
        B subOb = new B(1, 2);
        subOb.show();
    }
}
