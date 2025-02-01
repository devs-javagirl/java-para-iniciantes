package collection;

import java.util.HashSet;
import java.util.Set;

public class HashSetMetodos {
    public static void main(String[] args) {
        Set<Integer> numbers = new HashSet<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        if (numbers.contains(20)) {
            System.out.println("O conjunto contém o número 20");
        }
        numbers.remove(30);
        System.out.println("Tamanho da lista: " + numbers.size());

        numbers.forEach(n -> System.out.println("Número: " + n));
    }
}
