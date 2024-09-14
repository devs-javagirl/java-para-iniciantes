package cap7.superuse;

// Adiciona mais construtores a TwoDShape.
class TwoDShape2 {
    private double width;
    private double height;

    // Construtor padrão.
    TwoDShape2() {
        width = height = 0.0;
    }

    // Construtor parametrizado.
    TwoDShape2(double w, double h) {
        width = w;
        height = h;
    }

    // Constrói o objeto com altura e largura iguais.
    TwoDShape2(double x) {
        width = height = x;
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
class Triangle extends TwoDShape2 {
    private String style;

    // Construtor padrão.
    Triangle() {
        super(); // chama construtor da superclasse
        style = "none";
    }

    // Construtor parametrizado.
    Triangle(String s, double w, double h) {
        super(w, h); // chama construtor da superclasse
        style = s;
    }

    // Construtor com um argumento.
    Triangle(double x) {
        super(x); // chama construtor da superclasse
        style = "filled";
    }

    double area() {
        return getWidth() * getHeight() / 2;
    }

    void showStyle() {
        System.out.println("Triangle is " + style);
    }
}

class Shapes6 {
    public static void main(String args[]) {
        Triangle t1 = new Triangle();
        Triangle t2 = new Triangle("outlined", 8.0, 12.0);
        Triangle t3 = new Triangle(4.0);

        System.out.println("Info for t1: ");
        t1.showStyle();
        t1.showDim();
        System.out.println("Area is " + t1.area());

        System.out.println();

        System.out.println("Info for t2: ");
        t2.showStyle();
        t2.showDim();
        System.out.println("Area is " + t2.area());

        System.out.println();

        System.out.println("Info for t3: ");
        t3.showStyle();
        t3.showDim();
        System.out.println("Area is " + t3.area());
    }
}

