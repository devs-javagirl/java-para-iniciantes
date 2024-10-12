package cap8.queue.qpack;

//Fila circular.
public class CircularQueue implements ICharQ {
    private char q[]; // esse array contém a fila
    private int putloc, getloc; // os índices put e get

    // Constrói uma fila vazia dado seu tamanho.
    public CircularQueue(int size) {
        q = new char[size + 1]; // aloca memória para a fila
        putloc = getloc = 0;
    }

    // Insere um caractere na fila.
    public void put(char ch) {
        /* A fila estará cheia se putloc for uma unidade
       menor do que getloc ou se putloc estiver no fim
       do array e getloc estiver no início. */
        if (putloc + 1 == getloc |
                ((putloc == q.length - 1) & (getloc == 0))) {
            System.out.println(" - Queue is full.");
            return;
        }
        q[putloc++] = ch;
        if (putloc == q.length) putloc = 0; // retrocede
    }

    // Remove um caractere da fila.
    public char get() {
        if (getloc == putloc) {
            System.out.println(" - Queue is empty.");
            return (char) 0;
        }

        char ch = q[getloc++];
        if (getloc == q.length) getloc = 0; // loop back
        return ch;
    }
}
