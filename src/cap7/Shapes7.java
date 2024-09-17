package cap7;

class TwoDShape7 {
    private double width;
    private double height;
    // Um construtor padrao.
    TwoDShape7() {
        width = height = 0.0;
    }
    // Construtor parametrizado.
    TwoDShape7(double w, double h) {
        width = w;
        height = h;
    }
    // Constroi um objeto com largura e altura iguais.
    TwoDShape7(double x) {
        width = height = x;
    }
    // Constroi um objeto a partir de outro.
    TwoDShape7(TwoDShape7 ob) {
        width = ob.width;
        height = ob.height;
    }
    // Metodos acessadores para width e heigth.
    double getWidth() { return width; }
    double getHeight() { return height; }
    void setWidth(double w) { width = w; }
    void setHeight(double h) { height = h; }

    void showDim() {
        System.out.println("Width and height are " +
                width + " and " + height);
    }
}

// Subclasse de TwoDShape para triangulos.
class Triangle7 extends TwoDShape7 {
    private String style;

    // Construtor padrao.
    Triangle7() {
        super();
        style = "none";
    }
    // Construtor para Triangle.
    Triangle7(String s, double w, double h) {
        super(w, h); // chama construtor da superclasse
        style = s;
    }
    // Construtor com um argumento.
    Triangle7(double x) {
        super(x); // chama construtor da superclasse
        style = "filled";
    }
    // Constroi um objeto a partir de outro.
    Triangle7(Triangle7 ob) {
        super(ob); // passa o objeto para o construtor de TwoDShape
        style = ob.style;
    }
    double area() {
        return getWidth() * getHeight() / 2;
    }
    void showStyle() {
        System.out.println("Triangle is " + style);
    }
}

public class Shapes7 {
    public static void main(String args[]) {
        Triangle7 t1 = new Triangle7("outlined", 8.0, 12.0);
        // faz uma copia de t1
        Triangle7 t2 = new Triangle7(t1);

        System.out.println("Info for t1: ");
        t1.showStyle();
        t1.showDim();
        System.out.println("Area is " + t1.area());
        System.out.println();

        System.out.println("Info for t2: ");
        t2.showStyle();
        t2.showDim();
        System.out.println("Area is " + t2.area());

        //a alteracao de um campo na t1 nao muda o valor na t2
        t1.setHeight(4);
        t1.showDim();

        System.out.println("Info for t1 after: ");
        t1.showStyle();
        t1.showDim();
        System.out.println("Area is " + t1.area());


        Triangle7 t3 = new Triangle7(t1);
        System.out.println("Info for t3: ");
        t3.showStyle();
        t3.showDim();
        System.out.println("Area is " + t3.area());

    }
}
