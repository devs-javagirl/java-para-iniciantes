package cap13;

import java.util.ArrayList;
import java.util.List;

class Z {
    void show() {
        System.out.println("Classe Z");
    }
}

class Y extends Z {
    void show() {
        System.out.println("Classe Y");
    }
}

class X extends Y {
    void show() {
        System.out.println("Classe X");
    }
}

public class WildcardSuper {
    static void addToList(List<? super Y> list) {
        // Posso adicionar objetos de Y ou subclasses de Y
        list.add(new Y());
        list.add(new X());
    }

    public static void main(String[] args) {
        List<Z> listZ = new ArrayList<>();
        List<Y> listY = new ArrayList<>();

        // A cl�usula ? super Y aceita Y e superclasses de Y (como Z)
        addToList(listZ); // Aceita
        addToList(listY); // Aceita

        // List<X> n�o funciona porque X � uma subclasse de Y, n�o uma superclasse.
        // List<X> listX = new ArrayList<>();
        // addToList(listX); // Erro de compila��o
    }
}
