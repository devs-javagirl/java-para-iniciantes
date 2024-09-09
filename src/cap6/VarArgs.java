package cap7;

public class VarArgs {

    // vaTest() usa um vararg.
    static void vaTest(int ... v) {
        System.out.println("Number of args: " + v.length);
        System.out.println("Contents: ");
        for(int i=0; i < v.length; i++)
            System.out.println("  arg " + i + ": " + v[i]);
        System.out.println();
    }

    public static void main(String args[])
    {
        // Observe como vaTest() pode ser chamado
        // com um número de argumentos variável.
        vaTest(10);      // 1 argumento
        vaTest(1, 2, 3); // 3 argumentos
        vaTest();        // nenhum argumento
    }
}
