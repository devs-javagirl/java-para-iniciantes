package cap7;

// Cria uma superclasse.
class A {
    A() {
        System.out.println("Constructing A.");
    }
}
// Cria uma subclasse estendendo a classe A.
class B extends A {
    B() {
        System.out.println("Constructing B.");
    }
}
// Cria outra subclasse estendendo B.
class C extends B {
    C() {
        System.out.println("Constructing C.");
    }
}

public class OrderOfConstruction {
    public static void main(String args[]) {
        C c = new C();
    }
}
