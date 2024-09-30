package cap8.bookpack;
// Demonstração breve dos pacotes.
class BookPack {
    private String title;
    private String author;
    private int pubDate;

    // Construtor
    BookPack(String t, String a, int d) {
        title = t;
        author = a;
        pubDate = d;
    }

    // Método para exibir os detalhes do livro
    void show() {
        System.out.println(title);
        System.out.println(author);
        System.out.println(pubDate);
        System.out.println();
    }
}

// Classe para demonstrar o uso de Book
class BookDemo {
    public static void main(String args[]) {
        BookPack books[] = new BookPack[5];  // Cria uma matriz de objetos Book

        // Preenche a matriz com diferentes livros
        books[0] = new BookPack("Java: A Beginner's Guide", "Schildt", 2014);
        books[1] = new BookPack("Java: The Complete Reference", "Schildt", 2014);
        books[2] = new BookPack("The Art of Java", "Schildt and Holmes", 2003);
        books[3] = new BookPack("Red Storm Rising", "Clancy", 1986);
        books[4] = new BookPack("On the Road", "Kerouac", 1955);

        // Exibe os detalhes de cada livro
        for (int i = 0; i < books.length; i++) {
            books[i].show();
        }
    }
}
