package cap5;


public class Ragged { //irregular
    public static void main(String args[]) {
        int riders[][] = new int[7][];
        //Aqui as segundas dimensoes tem 10 elementos.
        riders[0] = new int[10];
        riders[1] = new int[10];
        riders[2] = new int[10];
        riders[3] = new int[10];
        riders[4] = new int[10];
        riders[5] = new int[2];  // Fim de semana, 2 viagens
        riders[6] = new int[2];

        // Populando os arrays com dados fictícios
        for (int i = 0; i < 5; i++) { // Dados para os dias da semana
            for (int j = 0; j < 10; j++) {
                riders[i][j] = i + j + 10;
            }
        }
        for (int i = 5; i < 7; i++) { // Dados para o fim de semana
            for (int j = 0; j < 2; j++) {
                riders[i][j] = i + j + 10;
            }
        }

        // Exibindo os dados de passageiros durante a semana
        System.out.println("Riders per trip during the week:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(riders[i][j] + " ");
            }
            System.out.println();
        }

        // Exibindo os dados de passageiros no fim de semana
        System.out.println("\nRiders per trip on the weekend:");
        for (int i = 5; i < 7; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(riders[i][j] + " ");
            }
            System.out.println();
        }
    }
}
