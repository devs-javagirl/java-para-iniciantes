package cap5;

public class Exercicio5 {
    //5 Qual é a diferença entre os métodos indexOf( ) e lastIndexOf( ) de String?
    /*
    O metodo indexOf(i) mostra o primeiro index que tem o valor informado entre parenteses
    O metodo lastIndexOf() mostra o ultimo index que tem o valor informado entre parenteses
     */

    public static void main(String[] args) {
        String strs = "this is a test of a strings sort";

        System.out.println("Indexof = " + strs.indexOf("is"));

        System.out.println("lastIndexOf = " + strs.lastIndexOf("is"));
    }
}
