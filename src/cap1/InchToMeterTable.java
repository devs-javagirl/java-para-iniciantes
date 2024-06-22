package cap1;

public class InchToMeterTable {
    /*
        Este programa exibe uma tabela de
        conversão de polegadas para metros.
        Chame-o de InchToMeterTable.java.
    */
    public static void main(String[] args) {
        double inches, meters;
        int counter;

        counter = 0;
        for (inches = 1; inches <= 144; inches++) {
            meters = inches / 39.37; // converte para metros
            System.out.println(inches + " inches is " + meters + " meters.");

            counter++;
            if (counter == 12) {
                System.out.println();
                counter = 0;
            }
        }
    }
}
