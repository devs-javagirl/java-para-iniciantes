package collection;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("Ma��");
        set.add("Banana");
        set.add("Laranja");
        set.add("Ma��"); // Duplicata, n�o ser� adicionada
        set.add("Laranja");
        System.out.println(set); // Ordem n�o garantida
    }
}
