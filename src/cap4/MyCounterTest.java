package cap4;

public class MyCounterTest {

    /**
     * Mostre como um m�todo chamado myMeth( )
     * ser� declarado se tiver um tipo de retorno double e dois par�metros int chamados a e b.
     */
    static double myMeth(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        MyCounter counter;
        counter = new MyCounter();

        counter.count = 0;

        //System.out.println("Counter: " + counter.count);
        System.out.println("myMeth: " + myMeth(1, 2));

    }
}
