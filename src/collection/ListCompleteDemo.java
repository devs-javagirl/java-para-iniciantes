package collection;
import java.util.ArrayList;
import java.util.List;

public class ListCompleteDemo {

        public static void main(String[] args) {
            List<String> nomes = new ArrayList<>(List.of("Ana", "Carlos", "João", "Maria"));

            // Exemplo de forEach
            nomes.forEach(nome -> System.out.println("Nome: " + nome));

            // Exemplo de removeIf
            nomes.removeIf(nome -> nome.startsWith("C"));
            System.out.println("Após removeIf: " + nomes);

            // Exemplo de replaceAll
            nomes.replaceAll(nome -> nome.toUpperCase());
            System.out.println("Após replaceAll: " + nomes);

            // Exemplo de stream com filter e map
            List<String> nomesFiltrados = nomes.stream()
                    .filter(nome -> nome.length() > 3) // Filtra nomes com mais de 3 letras
                    .map(nome -> "Olá, " + nome) // Adiciona uma saudação
                    .toList();
            nomesFiltrados.forEach(System.out::println);
        }

}
