package cap5;

class Queue {
    char q[]; // esse array cont�m a fila
    int putloc, getloc; // os �ndices put e get

    Queue(int size) {
        q = new char[size]; // aloca mem�ria para a fila
        putloc = getloc = 0;
    }

    void put(char ch) {
        if(putloc == q.length) {
            System.out.println(" ? Queue is full.");
            return;
        }
        q[putloc++] = ch;
    }

    char get() {
        if(getloc == putloc) {
            System.out.println(" ? Queue is empty.");
            return (char) 0;
        }
        return q[getloc++];
    }



}

