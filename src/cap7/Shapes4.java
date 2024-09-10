package cap7;

class TwoDShape4 {
    private double width;
    private double height;
    // Construtor parametrizado.
    TwoDShape4(double w, double h) {
        width = w;
        height = h;
    }

    // Métodos acessadores para width e heigth.
    double getWidth() { return width; }
    double getHeight() { return height; }
    void setWidth(double w) { width = w; }
    void setHeight(double h) { height = h; }
    void showDim() {
        System.out.println("Width and height are " +
                width + " and " + height);
    }
}

class Triangle4 extends TwoDShape4 {
    private String style;

    Triangle4(String s, double w, double h) {
        super(w, h); // chama construtor da superclasse
        style = s;
    }

    double area() {
        return getWidth() * getHeight() / 2;
    }

    void showStyle() {
        //Usa super() para executar o construtor de TwoDShape.
        System.out.println("Triangle is " + style);
    }
}

public class Shapes4 {
    public static void main(String args[]) {
        Triangle4 t1 = new Triangle4("filled", 4.0, 4.0);
        Triangle4 t2 = new Triangle4("outlined", 8.0, 12.0);

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
