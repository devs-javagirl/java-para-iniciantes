package collection;

import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetExemplo1 {
    public static void main(String[] args) {
        // Criar um TreeSet para armazenar os números
        Set<Integer> sortedNumbers = new TreeSet<>();

        // Criar uma instância de Random
        Random random = new Random();

        // Gerar 10 números aleatórios entre 1 e 100 e adicioná-los no TreeSet
        for (int i = 0; i < 10; i++) {
            int randomNumber = random.nextInt(100) + 1; // Gera números entre 1 e 100
            sortedNumbers.add(randomNumber);
            System.out.println("Número gerado: " + randomNumber);
        }

        // Exibir os números ordenados
        System.out.println("\nNúmeros ordenados no TreeSet:");
        sortedNumbers.forEach(numero -> System.out.println("Número: " + numero));
    }
}
