package cap9;

class StackFullException extends Exception {
    int size;
    StackFullException(int s) { size = s; }

    public String toString() {
        return "\nStack is full. Maximum size is " +
                size;
    }
}

class StackEmptyException extends Exception {
    public String toString() {
        return "\nStack is empty.";
    }
}

class PilhaEx10 {
    private char q[];         // Array que contém a fila
    private int index;
    //, popIndex; // Índices de inserção e remoção

    PilhaEx10(int size) {
        q = new char[size]; // Aloca memória para a fila
        index = 0;
    }

    // Insere um caractere na fila.
    //push - empurrar
    //pop - puxar

    void push(char ch) throws StackFullException {
        if(index == q.length) {
           // System.out.println(" ? Queue is full.");
           // return;
            throw new StackFullException(q.length);
        }
        q[index++] = ch;
    }

    // Obtém um caractere da fila.
    char pop() throws StackEmptyException {
        if(index == 0) {
            //System.out.println(" ? Queue is empty.");
            //return (char) 0;
            throw new StackEmptyException();
        }
        return q[--index];
    }

    void print () {
        for (int i = 0; i < index; i++) {
            System.out.print(q[i]);
        }
    }
}

public class Exercicio10 {

    public static void main(String[] args) {
        PilhaEx10 pilha1 = new PilhaEx10(10);
        PilhaEx10 pilha2 = new PilhaEx10(10);

        for (int i = 0; i < 10; i++) {  ///
            try{
                pilha1.push((char) ('A' + i));
                //pilha1.push(' ');
            }
            catch (StackFullException e){
                System.out.println(e.toString());
            }
        }

        System.out.print("Conteúdo de pilha1: ");
        pilha1.print();
        System.out.println();

        char ch;

        for (int i = 0; i < 10; i++) {
            try{
                ch = pilha1.pop();
                pilha2.push(ch);
            }
            catch (StackFullException | StackEmptyException e){
                System.out.println(e.toString());
            }
        }

        System.out.print("Conteúdo de pilha2: ");
        pilha2.print();
        System.out.println();
    }
}
