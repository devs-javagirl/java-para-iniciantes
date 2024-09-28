package cap8.bookpack;
// Agora a classe Book � p�blica para ser acessada de fora do pacote.
public class Book {
    private String title;
    private String author;
    private int pubDate;

    // Construtor p�blico
    public Book(String t, String a, int d) {
        title = t;
        author = a;
        pubDate = d;
    }

    // M�todo p�blico para exibir os detalhes do livro
    public void show() {
        System.out.println(title);
        System.out.println(author);
        System.out.println(pubDate);
        System.out.println();
    }
}
