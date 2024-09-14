package cap7;

class TwoDShape2 {
    private double width; // agora esses
    private double height; // membros são privados.
    void showDim() {
        System.out.println("Width and height are " +
                width + " and " + height);
    }

}

class Triangle2 extends TwoDShape2 {
    String style;
    //Nao pode acessar o membro private de uma superclasse.
    double area() {
     //   return width * height / 2; // Erro! não pode acessar
        return  0;  ///comentar essa linha para testar e descomentar a linha de cima 17
    }
    void showStyle() {
        System.out.println("Triangle is " + style);
    }

}

public class Shapes2 {
    public static void main(String args[]) {
        Triangle2 t1 = new Triangle2();
        Triangle2 t2 = new Triangle2();

       // t1.width = 4.0;
       // t1.height = 4.0;
        t1.style = "filled";
       // t2.width = 8.0;
       // t2.height = 12.0;
        t2.style = "outlined";
        System.out.println("Info for t1: ");
        t1.showStyle();
        t1.showDim();
        t1.area();
        System.out.println("Area is " + t1.area());
        System.out.println();
        System.out.println("Info for t2: ");
        t2.showStyle();
        t2.showDim();
        t2.area();
        System.out.println("Area is " + t2.area());
    }
}
