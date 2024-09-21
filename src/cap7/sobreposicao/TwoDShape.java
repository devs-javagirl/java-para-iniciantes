package cap7.sobreposicao;

// Classe base TwoDShape
class TwoDShape {
    private double width;
    private double height;
    private String name;

    // Construtor padr�o
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

    // Constr�i objeto com largura e altura iguais
    TwoDShape(double x, String n) {
        width = height = x;
        name = n;
    }

    // Constr�i um objeto a partir de outro
    TwoDShape(TwoDShape ob) {
        width = ob.width;
        height = ob.height;
        name = ob.name;
    }

    // M�todos acessadores para width e height
    double getWidth() { return width; }
    double getHeight() { return height; }
    void setWidth(double w) { width = w; }
    void setHeight(double h) { height = h; }
    String getName() { return name; }

    // M�todo para mostrar as dimens�es
    void showDim() {
        System.out.println("Width and height are " + width + " and " + height);
    }

    // M�todo area() que ser� sobreposto
    double area() {
        System.out.println("area() must be overridden");
        return 0.0;
    }
}

// Subclasse para tri�ngulos
class Triangle extends TwoDShape {
    private String style;

    // Construtor padr�o
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

    // Constr�i um objeto a partir de outro
    Triangle(Triangle ob) {
        super(ob); // chama construtor da superclasse
        style = ob.style;
    }

    // Sobrep�e o m�todo area() para tri�ngulos
    double area() {
        return getWidth() * getHeight() / 2;
    }

    // Mostra o estilo do tri�ngulo
    void showStyle() {
        System.out.println("Triangle is " + style);
    }
}

// Subclasse para ret�ngulos
class Rectangle extends TwoDShape {

    // Construtor padr�o
    Rectangle() {
        super();
    }

    // Construtor parametrizado
    Rectangle(double w, double h) {
        super(w, h, "rectangle");
    }

    // Constr�i um quadrado
    Rectangle(double x) {
        super(x, "rectangle");
    }

    // Constr�i um objeto a partir de outro
    Rectangle(Rectangle ob) {
        super(ob);
    }

    // Verifica se � um quadrado
    boolean isSquare() {
        return getWidth() == getHeight();
    }

    // Sobrep�e o m�todo area() para ret�ngulos
    double area() {
        return getWidth() * getHeight();
    }
}

// Classe principal para demonstrar o polimorfismo
class DynShapes {
    public static void main(String args[]) {
        // Array de refer�ncias para TwoDShape
        TwoDShape shapes[] = new TwoDShape[5];

        // Inicializa o array com objetos de subclasses
        shapes[0] = new Triangle("outlined", 8.0, 12.0);
        shapes[1] = new Rectangle(10);
        shapes[2] = new Rectangle(10, 4);
        shapes[3] = new Triangle(7.0);
        shapes[4] = new TwoDShape(10, 20, "generic");

        // Percorre o array e exibe informa��es sobre cada forma
        for (int i = 0; i < shapes.length; i++) {
            System.out.println("Object is " + shapes[i].getName());
            System.out.println("Area is " + shapes[i].area());
            System.out.println();
        }
    }
}

