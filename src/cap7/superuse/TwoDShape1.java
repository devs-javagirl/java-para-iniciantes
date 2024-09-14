package cap7.superuse;

// Adiciona construtores a TwoDShape.
class TwoDShape1 {
    private double width;
    private double height;

    // Construtor parametrizado.
    TwoDShape1(double w, double h) {
        width = w;
        height = h;
    }

    // Métodos acessadores para width e height.
    double getWidth() { return width; }
    double getHeight() { return height; }
    void setWidth(double w) { width = w; }
    void setHeight(double h) { height = h; }
    void showDim() {
        System.out.println("Width and height are " + width + " and " + height);
    }
}

// Subclasse de TwoDShape para triângulos.
class Triangle1 extends TwoDShape1 {
    private String style;

    // Construtor da subclasse
    Triangle1(String s, double w, double h) {
        super(w, h); // chama construtor da superclasse
        style = s;
    }

    double area() {
        return getWidth() * getHeight() / 2;
    }

    void showStyle() {
        System.out.println("Triangle is " + style);
    }
}

class Shapes5 {
    public static void main(String args[]) {
        Triangle1 t1 = new Triangle1("filled", 4.0, 4.0);
        Triangle1 t2 = new Triangle1("outlined", 8.0, 12.0);

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

