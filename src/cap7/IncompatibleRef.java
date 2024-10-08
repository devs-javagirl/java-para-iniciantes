package cap7;

// Este codigo nao sera compilado.
class X {
    int a;

    X(int i) {
        a = i;
    }
}
class Y {
    int a;
    Y(int i) {
        a = i;
    }
}

public class IncompatibleRef {
    public static void main(String args[]) {
        X x = new X(10);
        X x2;
        Y y = new Y(5);
        x2 = x; // Correto, as duas sao do mesmo tipo
     //apagar comentario abaixo para teste
       // x2 = y; // Erro, nao sao do mesmo tipo
    }
}
