package cap13.TenteIsso13;


// Interface de fila genérica.
public interface IGenQ<T> {
    // Insere um item na fila.
    void put(T ch) throws QueueFullException2;

    // Retira um item da fila.
    T get() throws QueueEmptyException2;
}
