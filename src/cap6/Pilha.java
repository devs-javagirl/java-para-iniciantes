package cap6;

// Uma classe de fila de caracteres melhorada.
class Pilha {
    // Agora esses membros s�o privados
    private char q[];         // Array que cont�m a fila
    private int index;
    //, popIndex; // �ndices de inser��o e remo��o

    Pilha(int size) {
        q = new char[size]; // Aloca mem�ria para a fila
        index = 0;
    }


    // Insere um caractere na fila.
    //push - empurrar
    //pop - puxar

    void push(char ch) {
        if(index == q.length) {
            System.out.println(" ? Queue is full.");
            return;
        }
        q[index++] = ch;
    }

    // Obt�m um caractere da fila.
    char pop() {
        if(index == 0) {
            System.out.println(" ? Queue is empty.");
            return (char) 0;
        }
        return q[--index];
    }

    void print () {
        for (int i = 0; i < index; i++) {
            System.out.print(q[i]);
        }
    }
}
