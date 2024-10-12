package cap8.queue.qpack;

public interface ICharQ {
    // Insere um caractere na fila.
    void put(char ch);
    // Remove um caractere da fila.
    char get();

    default void reset() {
        System.out.println("Reset not supported.");
    }
}
