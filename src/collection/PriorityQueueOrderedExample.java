package collection;

import java.util.PriorityQueue;
import java.util.Comparator;

public class PriorityQueueOrderedExample {
    public static void main(String[] args) {
        // Cria uma PriorityQueue com uma ordem personalizada usando Comparator
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.naturalOrder());

        // Adiciona alguns elementos
        pq.add(10);
        pq.add(20);
        pq.add(15);
        pq.add(70);

        // Exibe o elemento no topo da fila (o maior elemento devido ao Comparator reverseOrder)
        System.out.println("Top element: " + pq.peek());

        // Remove elementos um por um
        while (!pq.isEmpty()) {
            System.out.println(pq.poll());
        }
    }
}
