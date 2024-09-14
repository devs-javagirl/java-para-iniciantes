package cap7;

public class VarArgs4 {
    // Usa um parametro vararg int.
    static void vaTest(int ... v) {
        // ...
    }
    //Um vararg int
    // Usa um parâmetro vararg booleano.
    static void vaTest(boolean ... v) {
        // ...
    }

    public static void main(String args[])
    {
        vaTest(1, 2, 3); // OK
        vaTest(true, false, false); // OK
       // vaTest(); // Erro: ambíguo!
    }
}
