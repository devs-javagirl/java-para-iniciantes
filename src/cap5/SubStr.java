package cap5;

public class SubStr {
    public static void main(String[] args) {
        String orgstr = "Java makes the Web move."; //tamanho 23

        // constroi um substring
        // Essa linha cria um novo string contendo o substring desejado.
        String substr = orgstr.substring(5, 18);
        System.out.println("orgstr: " + orgstr);
        System.out.println("substr: " + substr);
    }
}
