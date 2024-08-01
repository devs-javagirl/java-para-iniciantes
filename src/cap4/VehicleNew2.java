package cap4;

public class VehicleNew2 {
    public static void main(String[] args) {

        int x, y;
        x = 1;
        y = x;

        Vehicle minivan; // declara uma referência ao objeto

        Vehicle car1 = new Vehicle();
        Vehicle car2 = car1;

        car1.mpg = 26;
        System.out.println(car1.mpg);
        System.out.println(car2.mpg);

        car2.mpg = 30;
        System.out.println("--------");
        System.out.println(car1.mpg);
        System.out.println(car2.mpg);

        Vehicle car3 = new Vehicle();
        car2 = car3;

        car3.mpg = 50;
        System.out.println("--------");
        System.out.println(car1.mpg);
        System.out.println(car2.mpg);
        System.out.println(car3.mpg);
    }
}
