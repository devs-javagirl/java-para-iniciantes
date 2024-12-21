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
// Observe que D N�O estende A.
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
        //� possivel criar um objeto Gen<D> mesmo D n�o extendendo A
        // porque n�o h� nenhuma restri��o na declara��o da classe Gen que diga que o tipo gen�rico T deve ser filho de A.
        // Logo, Gen<D> � v�lido na cria��o, mas n�o � poss�vel usar o metodo test

        //Essas chamadas s�o v�lidas porque w, w2 e w3 s�o subclasses de A.
        test(w);
        test(w2);
        test(w3);

        // N�o pode chamar test() com w4 porque
        // ele n�o � um objeto de uma classe que
        // herde A.
        //test(w4); // Error!
    }


}
