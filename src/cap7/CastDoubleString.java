package cap7;

public class CastDoubleString {
    public static void main(String[] args) {
        double d = 3.0;
        String st = Double.toString(d);
        System.out.println(st);

        st = "3.0";
        double dd = Double.parseDouble(st);

        System.out.println("double: " +d);
    }
}
