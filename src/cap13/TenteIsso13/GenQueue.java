package cap13.TenteIsso13;

// Classe genérica de uma fila de tamanho fixo.
class GenQueue<T> implements IGenQ<T> {
    private T q[]; // esse array contém a fila
    private int putloc, getloc; // índices de inserção e retirada

    // Constrói uma fila vazia com o array dado.
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
