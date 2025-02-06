package collection.Streams;

/*Somar N�meros Pares de uma Lista
Dada uma lista de n�meros inteiros, some apenas os n�meros pares.
*/

import java.util.List;

public class Exemplo2 {
    public static void main(String[] args) {
        List<Integer> lista = List.of(1,5,8,7,6,3,22,10);

        int soma = lista.stream()
                .filter(n -> n % 2 == 0)
                .reduce(0, Integer::sum);

        System.out.println("soma = " + soma);

    }
}
