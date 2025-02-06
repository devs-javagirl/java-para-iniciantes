package collection.Streams;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamsParalelas {
    public static void main(String[] args) {
        System.out.println("Exemplo 1: Somar números de uma lista.");
        List<Integer> numeros = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        int soma = numeros.parallelStream()
                .reduce(0, Integer::sum);
        System.out.println("Soma com parallelStream: " + soma);

        System.out.println(" ");
        System.out.println("Exemplo 2: Filtrando e processando elementos com Stream paralelo.");
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        // Usando Stream paralelo para filtrar os números pares e multiplicá-los por 2
        List<Integer> result = numbers.parallelStream()
                .filter(n -> n % 2 == 0)  // Filtra os números pares
                .map(n -> n * 2)          // Multiplica por 2
                .toList();
        result.forEach(System.out::println);


        System.out.println(" ");
        System.out.println("Exemplo 3: Usando reduce em paralelo para encontrar o maior número");
        List<Integer> numbers2 = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        Optional<Integer> max = numbers2.parallelStream()
                .reduce(Integer::max);  // Usa max para encontrar o maior valor
        max.ifPresent(System.out::println);  // Imprime o maior número

        System.out.println(" ");
        System.out.println("Exemplo 4: Paralelizando a contagem de elementos");
        List<String> words = List.of("apple", "banana", "cherry", "date", "elderberry");
        // Contando o número de palavras com mais de 5 letras
        long count = words.parallelStream()
                .filter(word -> word.length() > 5)
                .count();
        System.out.println("Número de palavras com mais de 5 letras: " + count);
    }
}
