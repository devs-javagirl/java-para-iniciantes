package cap6;

// Uma classe de fila de caracteres melhorada.
class Queue {
    // Agora esses membros s�o privados
    private char q[];         // Array que cont�m a fila
    private int putloc, getloc; // �ndices de inser��o e remo��o

    Queue(int size) {
        q = new char[size]; // Aloca mem�ria para a fila
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

    // Obt�m um caractere da fila.
     synchronized char get() {
        if(getloc == putloc) {
            System.out.println(" ? Queue is empty.");
            return (char) 0;
        }
        return q[getloc++];
    }
}
