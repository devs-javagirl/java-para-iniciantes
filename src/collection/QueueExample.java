package collection;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        Queue<String> fila = new LinkedList<>();

        // Adicionando elementos à fila
        fila.add("A");
        fila.add("B");
        fila.add("C");


        System.out.println("Valores da Fila: "); // [A, B, C]
        fila.forEach(value -> System.out.println(" " + value));


        // Removendo elementos na ordem de chegada (FIFO)
        System.out.println("Removido: " + fila.poll()); // A
        System.out.println("Nova fila: " + fila); // [B, C]
    }
}
