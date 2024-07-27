package cap4;

public class VehicleDemo {
    public static void main(String args[]) {
        Vehicle minivan = new Vehicle();
        int range;
        // atribui valores a campos de minivan
        minivan.passengers = 7;
        minivan.fuelcap = 16;
        minivan.mpg = 21;

        // calcula a autonomia presumindo um tanque cheio de gasolina
        //range = minivan.fuelcap * minivan.mpg;

        System.out.println("Minivan can carry " + minivan.passengers +
                " with a range of " + minivan.range() + " miles" + " and needs " + minivan.fuelneeded(252) + " gallons of fuel to cover 252 miles." );
    }
}
