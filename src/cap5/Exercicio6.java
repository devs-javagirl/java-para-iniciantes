package cap5;

public class Exercicio6 {
    //Já que todos os strings são objetos de tipo String,
    // mostre como chamar os métodos length( ) e charAt( ) neste literal de string: ?I like Java?.

    public static void main(String[] args) {
        String teste = "I like Java";

        System.out.println("length = " + teste.length());
        System.out.println("charAt = " + teste.charAt(3));
    }
}
