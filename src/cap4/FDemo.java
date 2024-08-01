package cap4;

public class FDemo {
    int x;

    FDemo(int i) {
        x = i;
    }
    // chamada quando o objeto  reciclado
    protected void finalize() {
        System.out.println("Finalizing " + x);
    }
    // gera um objeto que  imediatamente destruido
    void generator(int i) {
        FDemo o = new FDemo(i);
    }
}
