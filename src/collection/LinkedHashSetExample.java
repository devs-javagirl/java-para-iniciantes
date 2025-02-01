package collection;

import java.util.LinkedHashSet;
import java.util.Set;
public class LinkedHashSetExample {
    public static void main(String[] args) {
        Set<String> set = new LinkedHashSet<>();
        set.add("Maçã");
        set.add("Banana");
        set.add("Laranja");
        set.add("Maçã");//nao adiciona repetido também
        set.add("Banana");
        set.add("Abacaxi");
        System.out.println(set); // Ordem de inserção preservada
    }
}
