package collection;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ListExamples {
    public static void main(String[] args) {

        //forEachExample();

        //removeExample();

        //replaceAllExample();

        //sortExample();

        //streamExample();

        functionalManipulationExample();

    }

    private static void functionalManipulationExample() {
        List<String> frutas = new ArrayList<>();
        frutas.add("Maçã");
        frutas.add("Banana");
        frutas.add("Laranja");

        frutas.removeIf(f -> f.startsWith("M")); // Remove elementos começando com 'M'
        frutas.forEach(System.out::println); // Saída: Banana, Laranja
    }

    private static void streamExample() {
        List<Integer> numeros = List.of(10, 15, 20, 25);
        List<Integer> dobrados = numeros.stream()
                .map(n -> n * 2) // Dobra os valores
                .filter(n -> n > 30) // Filtra maiores que 30
                .toList();

        //dobrados.forEach(System.out::println);
        System.out.println(dobrados); // Saída: [40, 50]
    }

    private static void sortExample() {
        List<String> nomes = new ArrayList<>(List.of("Ana", "João", "Carlos"));
        nomes.sort((a, b) -> a.compareTo(b));
        nomes.sort(Comparator.naturalOrder()); // Ordem natural
        nomes.sort(Comparator.reverseOrder()); // Ordem reversa
        System.out.println(nomes); // Saída: [João, Carlos, Ana]
    }

    private static void replaceAllExample() {
        List<String> palavras = new ArrayList<>(List.of("java", "lambda", "stream"));
        palavras.replaceAll(p -> p.toUpperCase()); // lambda
        palavras.replaceAll(String::toUpperCase); // referencia de metodo
        System.out.println(palavras);
    }

    private static void removeExample() {
        List<Integer> numeros = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6));
        numeros.removeIf(n -> n % 2 == 0); // Remove números pares
        System.out.println(numeros); // Saída: [1, 3, 5]
    }

    private static void forEachExample() {
        List<String> nomes = List.of("Ana", "Carlos", "João");

        //3 formas diferentes de fazer o mesmo loop
        for(int i = 0; i < nomes.size(); i++) {
            System.out.println("Olá, " + nomes.get(i));
        }

        for (String nome : nomes) {
            System.out.println("Olá, " + nome);
        }

        nomes.forEach(nome -> System.out.println("Olá, " + nome));
    }
}
