package cap8.queue;

// Fila din�mica.
class DynQueue implements ICharQ {
    private char q[]; // esse array cont�m a fila
    private int putloc, getloc; // os indices put e get
    // Constr�i uma fila vazia dado seu tamanho.
    public DynQueue(int size) {
        q = new char[size]; // aloca mem�ria para a fila
        putloc = getloc = 0;
    }
    // Insere um caractere na fila.
    public void put(char ch) {
        if(putloc==q.length) {
            // aumenta o tamanho da fila
            char t[] = new char[q.length * 2];
            // copia elementos para a nova fila
            for(int i=0; i < q.length; i++)
                t[i] = q[i];
            q = t;
        }

        q[putloc++] = ch;
    }

    // Remove um caractere da fila.
    public char get() {
        if(getloc == putloc) {
            System.out.println(" - Queue is empty.");
            return (char) 0;
        }
        return q[getloc++];
    }
}