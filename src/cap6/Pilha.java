package cap6;

// Uma classe de fila de caracteres melhorada.
class Pilha {
    // Agora esses membros são privados
    private char q[];         // Array que contém a fila
    private int index;
    //, popIndex; // Índices de inserção e remoção

    Pilha(int size) {
        q = new char[size]; // Aloca memória para a fila
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

    // Obtém um caractere da fila.
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
