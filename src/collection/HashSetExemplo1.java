package collection;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class HashSetExemplo1 {
    public static void main(String[] args) {
        // Criar um HashSet para armazenar os nomes
        Set<String> userNames = new HashSet<>();

        // Criar um Scanner para entrada do usuário
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite nomes de usuários (digite 'sair' para encerrar):");

        while (true) {
            // Ler o nome do usuário
            System.out.print("Digite um nome: ");
            String name = scanner.nextLine();

            // Encerrar o loop se o usuário digitar 'sair'
            if (name.equalsIgnoreCase("sair")) {
                break;
            }

            // Tentar adicionar o nome ao HashSet
            if (userNames.add(name)) {
                System.out.println("Nome adicionado com sucesso!");
            } else {
                System.out.println("O nome já existe no conjunto!");
            }
        }

        // Fechar o Scanner
        scanner.close();

        // Exibir os nomes únicos armazenados
        System.out.println("\nNomes de usuários armazenados:");
        userNames.forEach(System.out::println);
    }
}
