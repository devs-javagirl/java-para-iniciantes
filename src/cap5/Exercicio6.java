package cap5;

public class Exercicio6 {
    //J� que todos os strings s�o objetos de tipo String,
    // mostre como chamar os m�todos length( ) e charAt( ) neste literal de string: ?I like Java?.

    public static void main(String[] args) {
        String teste = "I like Java";

        System.out.println("length = " + teste.length());
        System.out.println("charAt = " + teste.charAt(3));
    }
}
