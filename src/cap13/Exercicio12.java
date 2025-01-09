package cap13;

interface IGenStack <T> {
    void push(T ch) throws StackFullException;
    T pop() throws StackEmptyException;
}

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

class GenStack<T> implements IGenStack<T> {
    private T stck[];   // Array que contém a fila
    private int tos; //topo da fila

    GenStack(T[] stckArray) {
        stck = stckArray;
        tos = 0;
    }

    // Constrói uma pilha a partir de outra.
    GenStack(T[] stckArray, GenStack<T> ob) {
        tos = ob.tos;
        stck = stckArray;
        try {
            if(stck.length < ob.stck.length)
                throw new StackFullException(stck.length);
        } catch(StackFullException exc) {
            System.out.println(exc);
        }

        // Copia os elementos.
        for(int i=0; i < tos; i++)
            stck[i] = ob.stck[i];
    }

    // Constrói uma pilha com valores iniciais.
    GenStack(T[] stckArray, T[] a) {
        stck = stckArray;
        for(int i = 0; i < a.length; i++) {
            try {
                push(a[i]);
            }
            catch(StackFullException exc) {
                System.out.println(exc);
            }
        }
    }

     // Insere um caractere na fila.
    //push - empurrar
    //pop - puxar
    public void push(T ch) throws StackFullException {
        if(tos == stck.length) {
            throw new StackFullException(stck.length);
        }
        stck[tos++] = ch;
    }

    // Obtém um caractere da fila.
    public T pop() throws StackEmptyException {
        if(tos == 0) {
            throw new StackEmptyException();
        }
        return stck[--tos];
    }

    void print () {
        for (int i = 0; i < tos; i++) {
            System.out.print(stck[i]);
        }
    }
}

public class Exercicio12 {

    public static void main(String[] args) {
        Integer iStore[] = new Integer[10];
        GenStack<Integer> stk1 = new GenStack<Integer>(iStore);

        // Constrói a pilha a partir do array.
        String name[] = {"One", "Two", "Three"};
        String strStore[] = new String[3];

        GenStack<String> stk2 = new GenStack<String>(strStore, name);

        String str;
        int n;
        try {
            // Insere alguns caracteres em stk1.
            for(int i=0; i < 10; i++)
                stk1.push(i);
        } catch(StackFullException exc) {
            System.out.println(exc);
        }
        // Constrói uma pilha a partir de outra pilha.
        String strStore2[] = new String[3];
        GenStack<String> stk3 =
                new GenStack<String>(strStore2, stk2);
        try {
            // Exibe as pilhas.
            System.out.print("Contents of stk1: ");
            for(int i=0; i < 10; i++) {
                n = stk1.pop();
                System.out.print(n + " ");
            }
            System.out.println("\n");
            System.out.print("Contents of stk2: ");
            for(int i=0; i < 3; i++) {
                str = stk2.pop();
                System.out.print(str + " ");
            }
            System.out.println("\n");
            System.out.print("Contents of stk3: ");
            for(int i=0; i < 3; i++) {
                str = stk3.pop();
                System.out.print(str + " ");
            }
        } catch(StackEmptyException exc) {
            System.out.println(exc);
        }

        System.out.println();
    }
}
