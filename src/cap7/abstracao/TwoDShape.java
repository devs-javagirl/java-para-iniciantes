package cap7.abstracao;

// Cria uma classe abstrata TwoDShape
abstract class TwoDShape {
    private double width;
    private double height;
    private String name;

    // Construtor padrão
    TwoDShape() {
        width = height = 0.0;
        name = "none";
    }

    // Construtor parametrizado
    TwoDShape(double w, double h, String n) {
        width = w;
        height = h;
        name = n;
    }

    // Constrói objeto com largura e altura iguais
    TwoDShape(double x, String n) {
        width = height = x;
        name = n;
    }

    // Constrói um objeto a partir de outro
    TwoDShape(TwoDShape ob) {
        width = ob.width;
        height = ob.height;
        name = ob.name;
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

// Subclasse de TwoDShape para triângulos
class Triangle extends TwoDShape {
    private String style;

    // Construtor padrão
    Triangle() {
        super();
        style = "none";
    }

    // Construtor parametrizado
    Triangle(String s, double w, double h) {
        super(w, h, "triangle");
        style = s;
    }

    // Construtor com um argumento
    Triangle(double x) {
        super(x, "triangle");
        style = "filled";
    }

    // Constrói um objeto a partir de outro
    Triangle(Triangle ob) {
        super(ob); // chama construtor da superclasse
        style = ob.style;
    }

    // Implementa o método area() para triângulos
    double area() {
        return getWidth() * getHeight() / 2;
    }

    // Mostra o estilo do triângulo
    void showStyle() {
        System.out.println("Triangle is " + style);
    }
}

// Subclasse de TwoDShape para retângulos
class Rectangle extends TwoDShape {

    // Construtor padrão
    Rectangle() {
        super();
    }

    // Construtor parametrizado
    Rectangle(double w, double h) {
        super(w, h, "rectangle");
    }

    // Constrói um quadrado
    Rectangle(double x) {
        super(x, "rectangle");
    }

    // Constrói um objeto a partir de outro
    Rectangle(Rectangle ob) {
        super(ob);
    }

    // Verifica se é um quadrado
    boolean isSquare() {
        return getWidth() == getHeight();
    }

    // Implementa o método area() para retângulos
    double area() {
        return getWidth() * getHeight();
    }
}

// Classe principal que demonstra o uso de classes abstratas
class AbsShape {
    public static void main(String[] args) {
        // Array de referências para TwoDShape
        TwoDShape[] shapes = new TwoDShape[4];

        // Inicializa o array com objetos de subclasses
        shapes[0] = new Triangle("outlined", 8.0, 12.0);
        shapes[1] = new Rectangle(10);
        shapes[2] = new Rectangle(10, 4);
        shapes[3] = new Triangle(7.0);

        // Percorre o array e exibe informações sobre cada forma
        for (int i = 0; i < shapes.length; i++) {
            System.out.println("Object is " + shapes[i].getName());
            System.out.println("Area is " + shapes[i].area());
            System.out.println();
        }
    }
}
