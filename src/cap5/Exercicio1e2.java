package cap5;

public class Exercicio1e2 {
    //1 Mostre duas maneiras de declarar um array unidimensional de 12 doubles.
    //2 Mostre como inicializar um array unidimensional de inteiros com os valores de 1 a 5.

    public static void main(String[] args) {
        double[] numeros = new double[12];
        for(int i =0; i < 12; i++){
            numeros[i] = i+10;
            System.out.printf("numeros[%d] = %.2f", i, numeros[i]);
            System.out.println();
        }

        System.out.println();

        double[] numeros2 = new double[] {12, 8, 19, 54, 55, 7, 8, 4, 2, 7, 9 , 11};
        for(int i =0; i < 12; i++){
            System.out.printf("numeros2[%d] = %.2f", i, numeros2[i]);
            System.out.println();
        }
    }
}


/*
double x[] = new double[12];
double[] x = new double[12];

 */