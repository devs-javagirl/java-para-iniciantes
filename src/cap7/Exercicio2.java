package cap7;

// Cria uma classe abstrata TwoDShape
abstract class TwoDShapeEx2 {
    private double width;
    private double height;
    private String name;

    // Construtor parametrizado
    TwoDShapeEx2(double w, double h, String n) {
        width = w;
        height = h;
        name = n;
    }

    TwoDShapeEx2(double w, String n) {
        width = w;
        name = n;
    }

    // Métodos acessadores para width e height
    double getWidth() { return width; }
    double getHeight() { return height; }
    void setWidth(double w) { width = w; }
    void setHeight(double h) { height = h; }
    String getName() { return name; }

    // Mostra as dimensões
    void showDim() {
        System.out.println("Width and height are " + width + " and " + height);
    }

    // Método abstrato que deve ser implementado pelas subclasses
    abstract double area();
}

// Subclasse de TwoDShape para círculos.
class Circle extends TwoDShapeEx2 {
     // Constrói Circle
    Circle(double width) {
        super(width, "circle"); // chama o construtor da superclasse
    }

    double area() {
        return (getWidth() / 2) * (getWidth() / 2) * 3.1416;
    }
}

public class Exercicio2 {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        System.out.println("Area: " + circle.area());
    }
}
