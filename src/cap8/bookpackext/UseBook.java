package cap8.bookpackext;

// Usa a classe Book do pacote bookpack.
class UseBook {
    public static void main(String args[]) {
        // Qualifica a classe Book com seu pacote para utilizá-la.
        cap8.bookpack.Book books[] = new cap8.bookpack.Book[5];  // Cria uma matriz de objetos Book

        // Preenche a matriz de livros
        books[0] = new cap8.bookpack.Book("Java: A Beginner's Guide", "Schildt", 2014);
        books[1] = new cap8.bookpack.Book("Java: The Complete Reference", "Schildt", 2014);
        books[2] = new cap8.bookpack.Book("The Art of Java", "Schildt and Holmes", 2003);
        books[3] = new cap8.bookpack.Book("Red Storm Rising", "Clancy", 1986);
        books[4] = new cap8.bookpack.Book("On the Road", "Kerouac", 1955);

        // Exibe os detalhes de cada livro
        for (int i = 0; i < books.length; i++) {
            books[i].show();
        }
    }
}
