package cap7;

// Uma referencia de superclasse pode referenciar um objeto da subclasse.
class X1 {
    int varX;
    X1(int i) {
        varX = i;
    }
}

class Y1 extends X1 {
    int varY;
    Y1(int i, int j) {
        super(j);
        varY = i;
    }
}

public class SupSubRef {
    public static void main(String args[]) {
        X1 x = new X1(10);
        X1 xNovo;
        Y1 y = new Y1(5, 6);
        xNovo = x; // Correto, as duas são do mesmo tipo
        System.out.println("xNovo.a: " + xNovo.varX);

        //Correto porque Y e subclasse de X, logo, xNovo pode referenciar y.
        xNovo = y; // continua correto porque Y e derivada de X
        System.out.println("xNovo.a: " + xNovo.varX);
        // Referencias de X so conhecem membros de X
        xNovo.varX = 34; // OK
       // xNovo.b = 27; // Erro, X não tem um membro b
    }
}
