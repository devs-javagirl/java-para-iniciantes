package cap6;

// Classe Block que armazena as dimens�es de um bloco tridimensional
class Block {
    private int height, width, length; // Dimens�es do bloco
    private int volume;  // Volume do bloco

    // Construtor para inicializar as dimens�es e calcular o volume
    Block(int height, int width, int length) {
        height = height;
        width = width;
        length = length;
        volume = height * width * length;
    }

    // M�todo para comparar as dimens�es de dois blocos
    boolean sameBlock(Block ob) {
        return (ob.height == height) && (ob.width == width) && (ob.length == length);
    }

    // M�todo para comparar os volumes de dois blocos
    boolean sameVolume(Block ob) {
        return ob.volume == volume;
    }
}

// Classe principal que testa a classe Block
class PassObj {
    /*
    Este exemplo demonstra como objetos podem ser passados para m�todos,
    como os m�todos podem comparar atributos desses objetos, e como essa pr�tica permite
    uma verifica��o precisa e flex�vel em aplica��es orientadas a objetos.
    */

    public static void main(String[] args) {
        // Cria tr�s blocos com dimens�es diferentes
        Block block1 = new Block(10, 2, 5);
        Block block2 = new Block(10, 2, 5);
        Block block3 = new Block(4, 5, 5);

        // Compara as dimens�es dos blocos
        System.out.println("block1 same dimensions as block2: " + block1.sameBlock(block2));
        System.out.println("block1 same dimensions as block3: " + block1.sameBlock(block3));

        // Compara os volumes dos blocos
        System.out.println("block1 same volume as block3: " + block1.sameVolume(block3));
    }
}

