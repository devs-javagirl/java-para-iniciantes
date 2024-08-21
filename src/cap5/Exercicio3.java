package cap5;

public class Exercicio3 {
    //3 Escreva um programa que use um array para encontrar a média de 10 valores double. Use os 10 valores que quiser.
    public static void main(String[] args) {
        double[] numeros = new double[10];

        double soma = 0;
        for(int i =0; i < 10; i++){
            numeros[i] = i+10;
            soma =+ numeros[i];
        }

        System.out.println("media = " + (soma/numeros.length));
    }
}
