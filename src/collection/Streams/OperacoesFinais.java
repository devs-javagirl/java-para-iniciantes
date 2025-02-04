package collection.Streams;

import java.util.List;
import java.util.stream.Collectors;

public class OperacoesFinais {
    public static void main(String[] args) {

        System.out.println("forEach(): percorre os elementos");
        List<String> nomes = List.of("Ana", "Bruno", "Carlos");
        nomes.stream().forEach(System.out::println);

        System.out.println(" ");
        System.out.println("count(): conta elementos");
        long quantidade = List.of("A", "B", "C").stream().count();
        System.out.println(quantidade);

        System.out.println(" ");
        System.out.println("collect(): coleta elementos em uma coleção");
        List<String> listaFiltrada = nomes.stream()
                .filter(nome -> nome.startsWith("B"))
                .toList();
        System.out.println(listaFiltrada);

        System.out.println(" ");
        System.out.println("reduce(): reduz elementos a um único valor");
        List<Integer> numeros = List.of(1, 2, 3, 4, 5);
        int soma = numeros.stream()
                .reduce(0, Integer::sum);
        System.out.println("Soma: " + soma);
    }
}
