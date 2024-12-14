package cap12;

import static java.lang.Integer.parseInt;

public class Exercicio8 {
    public static void main(String[] args) {
        String numero1 = "42";
        String numero2 = "58";

        int soma = parseInt(numero1) + parseInt(numero2); // Chamando parseInt diretamente
        System.out.println("A soma é: " + soma);

        //com a importacao completa de
        //java.lang.Integer.parseInt;
        //é necesario escrever Integer.MAX_VALUE
        //se estivesse importado somente java.lang.Integer.*
        // poderíamos escrever somente MAX_VALUE
        System.out.println("Maior valor de Integer: " + Integer.MAX_VALUE);
        System.out.println("Menor valor de Integer: " + Integer.MIN_VALUE);
    }
}
