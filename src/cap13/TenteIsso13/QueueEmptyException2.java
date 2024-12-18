package cap13.TenteIsso13;

// Exceção para erros de fila vazia.
public class QueueEmptyException2 extends Exception {
    public String toString() {
        return "\nQueue is empty.";
    }
}
