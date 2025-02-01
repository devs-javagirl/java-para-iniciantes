package collection;

import java.util.TreeSet;
import java.util.Set;

public class TreeSetExample {
    public static void main(String[] args) {
        Set<String> set = new TreeSet<>();
        set.add("Maçã");
        set.add("Banana");
        set.add("Laranja");
        set.add("Laranja"); //nao insere
        set.add("Abacaxi");
        System.out.println(set);  // Elementos em ordem alfabética

        set.remove("Abacaxi");
        System.out.println(set.contains("Abacaxi"));

        System.out.println(set);  // Elementos em ordem alfabética
    }
}
