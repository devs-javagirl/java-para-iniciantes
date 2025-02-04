package collection.Streams;

import java.util.List;
import java.util.stream.Stream;

public class Introducao {
    public static void main(String[] args) {
        System.out.println("1 Apenas criação e operação final (sem intermediárias)");
        List<String> nomes = List.of("Ana", "Bruno", "Carlos");
        nomes.stream().forEach(System.out::println);

        System.out.println("2 Com operação intermediária e final");
        List<String> nomes2 = List.of("Ana", "Bruno", "Carlos");
        nomes2.stream()
                .filter(nome -> nome.startsWith("B")) // Operação intermediária
                .forEach(System.out::println); // Operação final

        System.out.println("3 Apenas criação e operação intermediária (inválido!)");
        List<String> nomes3 = List.of("Ana", "Bruno", "Carlos");
        Stream<String> filtrada = nomes3.stream().filter(nome -> nome.startsWith("B"));
    }
}
