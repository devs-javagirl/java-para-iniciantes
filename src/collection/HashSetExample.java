package collection;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("Maçã");
        set.add("Banana");
        set.add("Laranja");
        set.add("Maçã"); // Duplicata, não será adicionada
        set.add("Laranja");
        System.out.println(set); // Ordem não garantida
    }
}
