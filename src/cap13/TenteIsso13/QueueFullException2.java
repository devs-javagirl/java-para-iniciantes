package cap13.TenteIsso13;

// Exce��o para erros de fila cheia.
public class QueueFullException2 extends Exception {
    int size;
    QueueFullException2(int s) { size = s; }
    public String toString() {
        return "\nQueue is full. Maximum size is " +
                size;
    }
}
