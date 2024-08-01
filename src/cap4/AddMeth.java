package cap4;

public class AddMeth {
    public static void main(String args[]) {
        VehicleMeth minivan = new VehicleMeth();
        VehicleMeth sportscar = new VehicleMeth();

        int range1, range2;

        // atribui valores a campos de minivan
        minivan.passengers = 7;
        minivan.fuelcap = 16;
        minivan.mpg = 21;

        // atribui valores a campos de sportscar
        sportscar.passengers = 2;
        sportscar.fuelcap = 14;
        sportscar.mpg = 12;

        System.out.print("Minivan can carry " + minivan.passengers +". ");
        int range = minivan.range(); // exibe a autonomia de minivan
        System.out.print("Range: " + range +". ");

        System.out.print("Sportscar can carry " + sportscar.passengers +". ");
        // exibe a autonomia de sportscar.
        System.out.println("Range: " + sportscar.range());

        if(minivan.range() > sportscar.range())
            System.out.println("minivan has greater range");
        else
            System.out.println("sportscar has greater range");
    }
}
