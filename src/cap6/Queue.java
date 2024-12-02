package cap6;

// Uma classe de fila de caracteres melhorada.
class Queue {
    // Agora esses membros são privados
    private char q[];         // Array que contém a fila
    private int putloc, getloc; // Índices de inserção e remoção

    Queue(int size) {
        q = new char[size]; // Aloca memória para a fila
        putloc = getloc = 0;
    }

    // Insere um caractere na fila.
    void put(char ch) {
        if(putloc == q.length) {
            System.out.println(" ? Queue is full.");
            return;
        }
        q[putloc++] = ch;
    }

    // Obtém um caractere da fila.
     synchronized char get() {
        if(getloc == putloc) {
            System.out.println(" ? Queue is empty.");
            return (char) 0;
        }
        return q[getloc++];
    }
}
