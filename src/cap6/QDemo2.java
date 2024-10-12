package cap6;

// Uma classe de fila para caracteres.
class Queue2 {
    private char q[]; // esse array contem a fila
    private int putloc, getloc; // os indices put e get

    // Constroi uma fila vazia dado seu tamanho.
    Queue2(int size) {
        q = new char[size]; // aloca mem�ria para a fila
        putloc = getloc = 0;
    }
    // Constroi uma fila a partir de outra.
    Queue2(Queue2 ob) {
        putloc = ob.putloc;
        getloc = ob.getloc;
        q = new char[ob.q.length];
        // copia elementos
        for(int i=getloc; i < putloc; i++)
            q[i] = ob.q[i];
    }
    // Constroi uma fila com valores iniciais.
    Queue2(char a[]) {
        putloc = 0;
        getloc = 0;
        q = new char[a.length];
        for(int i = 0; i < a.length; i++) put(a[i]);
    }
    // Insere um caractere na fila.
    void put(char ch) {
        if(putloc==q.length) {
            System.out.println(" � Queue is full.");
            return;
        }
        q[putloc++] = ch;
    }
    // Obtem um caractere da fila.
    char get() {
        if(getloc == putloc) {
            System.out.println(" � Queue is empty.");
            return (char) 0;
        }
        return q[getloc++];
    }
}
// Demonstra a classe Queue.
class QDemo2 {
    public static void main(String args[]) {
        // constroi uma fila vazia para 10 elementos
        Queue2 q1 = new Queue2(10);

        char name[] = {'T', 'o', 'm'};
        // constroi uma fila a partir do array
        Queue2 q2 = new Queue2(name);

        char ch;
        int i;
        // insere alguns caracteres em q1
        for(i=0; i < 10; i++)
            q1.put((char) ('A' + i)); //letra A + i

        // constroi uma fila a partir de outra
        Queue2 q3 = new Queue2(q1);
        // Exibe as filas.
        System.out.print("Contents of q1: ");
        for(i=0; i < 10; i++) {
            ch = q1.get();
            System.out.print(ch);
        }
        System.out.println("\n");
        System.out.print("Contents of q2: ");
        for(i=0; i < 3; i++) {
            ch = q2.get();
            System.out.print(ch);
        }
        System.out.println("\n");

        System.out.print("Contents of q3: ");
        for(i=0; i < 10; i++) {
            ch = q3.get();
            System.out.print(ch);
        }
    }
}
