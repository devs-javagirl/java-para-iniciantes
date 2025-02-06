package collection.Streams;

import java.util.List;
import java.util.stream.Collectors;

/*Criar uma Lista de Quadrados dos N�meros
Dada uma lista de n�meros, crie uma nova lista contendo o quadrado de cada n�mero.
*/
public class Exemplo5 {
    public static void main(String[] args) {
        List<Integer> lista = List.of(1,5,8,7,6,3,22,10);

        lista.stream()
                .map(n -> n*n)
                .forEach(System.out::println);
    }
}
