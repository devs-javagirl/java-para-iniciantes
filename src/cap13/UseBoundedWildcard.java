package cap13;

class A {
// ...
}
class B extends A {
// ...
}
class C extends A {
// ...
}
// Observe que D NÃO estende A.
class D {
// ...
}


public class UseBoundedWildcard {
    static void test(Gen<? extends A> o) { // Usa um curinga limitado.
        System.out.println("xx");
    }

    public static void main(String args[]) {
        A a = new A();
        B b = new B();
        C c = new C();
        D d = new D();
        Gen<A> w = new Gen<A>(a);
        Gen<B> w2 = new Gen<B>(b);
        Gen<C> w3 = new Gen<C>(c);
        Gen<D> w4 = new Gen<D>(d);
        //é possivel criar um objeto Gen<D> mesmo D não extendendo A
        // porque não há nenhuma restrição na declaração da classe Gen que diga que o tipo genérico T deve ser filho de A.
        // Logo, Gen<D> é válido na criação, mas não é possível usar o metodo test

        //Essas chamadas são válidas porque w, w2 e w3 são subclasses de A.
        test(w);
        test(w2);
        test(w3);

        // Não pode chamar test() com w4 porque
        // ele não é um objeto de uma classe que
        // herde A.
        //test(w4); // Error!
    }


}
