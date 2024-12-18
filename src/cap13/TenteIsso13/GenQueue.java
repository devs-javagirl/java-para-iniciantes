package cap13.TenteIsso13;

// Classe gen�rica de uma fila de tamanho fixo.
class GenQueue<T> implements IGenQ<T> {
    private T q[]; // esse array cont�m a fila
    private int putloc, getloc; // �ndices de inser��o e retirada

    // Constr�i uma fila vazia com o array dado.
    public GenQueue(T[] aRef) {
        q = aRef;
        putloc = getloc = 0;
    }

    // Insere um item na fila.
    public void put(T obj) throws QueueFullException2 {
        if(putloc == q.length)
            throw new QueueFullException2(q.length);
        q[putloc++] = obj;
    }
    // Retira um item da fila.

    public T get() throws QueueEmptyException2 {
        if(getloc == putloc)
            throw new QueueEmptyException2();
        return q[getloc++];
    }
}
