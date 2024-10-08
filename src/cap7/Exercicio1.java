package cap7;

class Caderno {
    private int qtdFolhas;
    private String marca;

    public int getQtdFolhas() {
        return qtdFolhas;
    }

    public String getMarca() {
        return marca;
    }

    public Caderno(int qtdFolhas, String marca) {
        this.qtdFolhas = qtdFolhas;
        this.marca = marca;
    }
}

class CadernoDesenho extends  Caderno{
    private String modelo;

    public CadernoDesenho(int qtd, String marca, String modelo) {
        super(qtd, marca);
        this.modelo = modelo;
    }

    public String getModelo() {
        return modelo;
    }
}

public class Exercicio1 {
    public static void main(String[] args) {
        CadernoDesenho desenho = new CadernoDesenho(50, "marca1", "universitario");

        System.out.println("Quantidade de folhas: " + desenho.getQtdFolhas());

        Caderno caderno = new Caderno(15, "marca2");
        //caderno.getModelo();

    }
}
