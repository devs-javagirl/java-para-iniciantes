package cap7;



class finalA {
    final void meth() {
        System.out.println("This is a final method.");
    }
}

class finalB extends finalA {
    // ERRO! N�o pode sobrepor meth() porque � final
    /*
    void meth() {
        System.out.println("Illegal!");
    }
    */
}

final class finalC  {
    void printC() {
        System.out.println("Classe C");
    }
}

class finalD /*extends finalC*/ {
    void printD() {
        System.out.println("Classe D");
    }
}


public class Exercicio8 {
    public static void main(String[] args) {

    }
}
