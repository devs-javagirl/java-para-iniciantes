package cap8.queue;
import cap8.queue.qpack.*;

public class QDemo {
    public static void main(String args[]) {
        FixedQueue qfixed = new FixedQueue(10);
        DynQueue qDyn = new DynQueue(5);
        CircularQueue qCircular = new CircularQueue(10);

        ICharQ iQ;
        char ch;
        int i;
        iQ = qfixed;

        // Insere alguns caracteres na fila fixa.
        for(i=0; i < 10; i++)
            iQ.put((char) ('A' + i));
        // Exibe a fila.
        System.out.print("Contents of fixed queue: ");
        for(i=0; i < 10; i++) {
            ch = iQ.get();
            System.out.print(ch);
        }
        System.out.println();


        iQ = qDyn;
        // Insere alguns caracteres na fila dinâmica.
        for(i=0; i < 10; i++)
            iQ.put((char) ('Z' - i));
        // Exibe a fila.
        System.out.print("Contents of dynamic queue: ");
        for(i=0; i < 10; i++) {
            ch = iQ.get();
            System.out.print(ch);
        }
        System.out.println();


        iQ = qCircular;
        // Insere alguns caracteres na fila circular.
        for(i=0; i < 10; i++)
            iQ.put((char) ('A' + i));
        // Exibe a fila.
        System.out.print("Contents of circular queue: ");
        for(i=0; i < 10; i++) {
            ch = iQ.get();
            System.out.print(ch);
        }
        System.out.println();

        // Insere mais caracteres na fila circular.
        for(i=10; i < 20; i++)
            iQ.put((char) ('A' + i));
        // Exibe a fila.
        System.out.print("Contents of circular queue: ");
        for(i=0; i < 10; i++) {
            ch = iQ.get();
            System.out.print(ch);
        }
        System.out.println("\nStore and consume from" +
                " circular queue.");
        // Armazena e consome itens da fila circular.
        for(i=0; i < 20; i++) {
            iQ.put((char) ('A' + i));
            ch = iQ.get();
            System.out.print(ch);
        }
    }
}
