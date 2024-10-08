package cap7;

abstract class  Livro {
    private String nome;
    private String autor;

    public Livro(String nome, String autor) {
        this.nome = nome;
        this.autor = autor;
    }

    public String getNome() {
        return nome;
    }

    public String getAutor() {
        return autor;
    }

    abstract String apresentarLivro();
}

class Biografia extends Livro{
    private String deQuem;

    public Biografia(String nome, String autor, String deQuem) {
        super(nome, autor);
        this.deQuem = deQuem;
    }

    String apresentarLivro() {
        return "O livro " + getNome() + ". Autor(a) : " + getAutor() + ". Fala sobre a vida de " + deQuem;
    }
}

class Ficcao extends Livro{
    private String resumo;

    public Ficcao(String nome, String autor, String resumo) {
        super(nome, autor);
        this.resumo = resumo;
    }

    String apresentarLivro() {
        return "O livro " + getNome() + ". Autor(a) : " + getAutor() + ". Fala sobre  " + resumo;
    }
}

public class Exercicio7 {
    public static void main(String[] args) {
        //Livro livro = new Livro();
        Livro biografia = new Biografia("Biografia 1", "autor 1", "Fulano");
        Ficcao ficcao = new Ficcao("Ficcao 1", "autor 2", "resumo do livro de ficcao 1");

        System.out.println(biografia.apresentarLivro());
        System.out.println(ficcao.apresentarLivro());



    }
}


