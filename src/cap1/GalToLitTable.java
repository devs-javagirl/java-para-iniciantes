package cap1;

import java.util.ArrayList;
import java.util.List;

public class GalToLitTable {

    public static void main(String[] args) {
        double gallons, liters;
        int counter;

        counter = 0;
        for (gallons = 1; gallons <= 100; gallons++) {
            liters = gallons * 3.7854;
            System.out.println(gallons + " gallons is " + liters + " liters.");

            counter++;
            if (counter == 10) {
                System.out.println();
                counter = 0;
            }
        }

        List<String> lista = new ArrayList<>();
        lista.add("A");
        lista.add("B");
        lista.add("C");
        for (String s : lista) {
            System.out.println(s);
        }

    }

    void method() {
        //do nothing
    }
}
