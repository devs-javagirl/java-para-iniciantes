package collection.Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class CriandoStreams {
    public static void main(String[] args) {
        System.out.println("A partir de listas:");
        List<String> nomes = List.of("Ana", "Bruno", "Carlos");
        Stream<String> streamNomes = nomes.stream();
        streamNomes.forEach(System.out::println);

        System.out.println(" ");
        System.out.println("A partir de arrays:");
        String[] array = {"A", "B", "C"};
        Stream<String> streamArray = Arrays.stream(array);
        streamArray.forEach(System.out::println);

        System.out.println(" ");
        System.out.println("A partir de valores:");
        Stream<String> streamValores = Stream.of("Java", "Python", "C++");
        streamValores.forEach(System.out::println);

        //Gerando streams infinitas
        System.out.println("-- Gerando streams infinitas --");
        System.out.println("Stream.iterate(...)");
        Stream<Integer> numeros = Stream.iterate(0, n -> n + 2);
        numeros.limit(5).forEach(System.out::println);

        System.out.println("Stream.generate(...)");
        Stream<Double> aleatorios = Stream.generate(Math::random);
        aleatorios.limit(5).forEach(System.out::println);

    }
}
