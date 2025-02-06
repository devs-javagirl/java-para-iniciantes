package collection.Streams;

import java.util.List;
import java.util.stream.Stream;

public class Introducao {
    public static void main(String[] args) {
        System.out.println("1 Apenas cria��o e opera��o final (sem intermedi�rias)");
        List<String> nomes = List.of("Ana", "Bruno", "Carlos");
        nomes.stream().forEach(System.out::println);

        System.out.println("2 Com opera��o intermedi�ria e final");
        List<String> nomes2 = List.of("Ana", "Bruno", "Carlos");
        nomes2.stream()
                .filter(nome -> nome.startsWith("B")) // Opera��o intermedi�ria
                .forEach(System.out::println); // Opera��o final

        System.out.println("3 Apenas cria��o e opera��o intermedi�ria (inv�lido!)");
        List<String> nomes3 = List.of("Ana", "Bruno", "Carlos");
        Stream<String> filtrada = nomes3.stream().filter(nome -> nome.startsWith("B"));
    }
}
