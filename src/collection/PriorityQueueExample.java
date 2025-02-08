package collection;

import java.util.PriorityQueue;

public class PriorityQueueExample {
    public static void main(String[] args) {
        PriorityQueue<Integer> filaPrioridade = new PriorityQueue<>();

        filaPrioridade.add(70);
        filaPrioridade.add(30);
        filaPrioridade.add(10);
        filaPrioridade.add(20);

        System.out.println("Fila de prioridade: " + filaPrioridade); // A ordem pode não ser óbvia

        // Removendo elementos na ordem de prioridade (menor primeiro)
        System.out.println("Removido: " + filaPrioridade.poll()); // 10
        System.out.println("Removido: " + filaPrioridade.poll()); // 20
        System.out.println("Removido: " + filaPrioridade.poll()); // 30
        System.out.println("Removido: " + filaPrioridade.poll()); // 70
    }
}
