package collection.Streams;

import java.util.List;

public class OperacoesIntermediarias {
    public static void main(String[] args) {

        System.out.println("map(): transforma elementos");
        List<String> nomes = List.of("ana", "bruno");
        nomes.stream()
                .map(String::toUpperCase)
                .forEach(System.out::println);

        System.out.println(" ");
        System.out.println("filter(): filtra elementos");
        List<String> nomesFilter = List.of("Ana", "Bruno", "Carlos");
        nomesFilter.stream()
                .filter(n -> n.startsWith("B"))
                .forEach(System.out::println);

        System.out.println(" ");
        System.out.println("sorted(): ordena elementos");
        List<Integer> numeros = List.of(3, 1, 4, 2);
        numeros.stream()
                .sorted()
                .forEach(System.out::println);

        System.out.println(" ");
        System.out.println("distinct(): remove duplicatas");
        List<Integer> numerosD = List.of(1, 2, 2, 3, 3, 4);
        numerosD.stream()
                .distinct()
                .forEach(System.out::println);

        System.out.println(" ");
        System.out.println("limit() e skip(): limitar e pular elementos");
        List<Integer> numerosL = List.of(1, 2, 3, 4, 5, 6);
        numerosL.stream()
                .skip(2) // Pula os dois primeiros elementos
                .limit(3) // Pega apenas três elementos
                .forEach(System.out::println);

        System.out.println("-----------");
        numerosL.forEach(System.out::println);

    }
}
