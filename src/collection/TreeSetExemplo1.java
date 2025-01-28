package collection;

import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetExemplo1 {
    public static void main(String[] args) {
        // Criar um TreeSet para armazenar os n�meros
        Set<Integer> sortedNumbers = new TreeSet<>();

        // Criar uma inst�ncia de Random
        Random random = new Random();

        // Gerar 10 n�meros aleat�rios entre 1 e 100 e adicion�-los no TreeSet
        for (int i = 0; i < 10; i++) {
            int randomNumber = random.nextInt(100) + 1; // Gera n�meros entre 1 e 100
            sortedNumbers.add(randomNumber);
            System.out.println("N�mero gerado: " + randomNumber);
        }

        // Exibir os n�meros ordenados
        System.out.println("\nN�meros ordenados no TreeSet:");
        sortedNumbers.forEach(numero -> System.out.println("N�mero: " + numero));
    }
}
