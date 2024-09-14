package cap7;

class TwoDShape2ok {
    private double width; // agora esses
    private double height; // membros são privados
    // Métodos acessadores para width e height.

    double getWidth() { return width; }
    double getHeight() { return height; }

    void setWidth(double w) { width = w; }
    void setHeight(double h) { height = h; }

    void showDim() {
        System.out.println("Width and height are " +
                width + " and " + height);
    }
}

class Triangle2ok extends TwoDShape2ok {
    String style;
    double area() {
        return getWidth() * getHeight() / 2;
    }
    void showStyle() {
        //Usa metodos acessadores fornecidos pela superclasse.
                System.out.println("Triangle is " + style);
    }
}

public class Shapes2ok {
    public static void main(String args[]) {
        Triangle2ok t1 = new Triangle2ok();
        Triangle2ok t2 = new Triangle2ok();
        t1.setWidth(4.0);
        t1.setHeight(4.0);
        t1.style = "filled";
        t2.setWidth(8.0);
        t2.setHeight(12.0);
        t2.style = "outlined";
        System.out.println("Info for t1: ");
        t1.showStyle();
        t1.showDim();
        System.out.println("Area is " + t1.area());
        System.out.println();
        System.out.println("Info for t2: ");
        t2.showStyle();
        t2.showDim();
        System.out.println("Area is " + t2.area());
    }
}
