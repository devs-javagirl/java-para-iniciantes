package cap4;

class Flower {
    // Atributos da classe Flower
    String name;
    String color;
    double price;

    // Construtor da classe Flower
    Flower(String nome, String cor, double preco) {
        name = nome;
        color = cor;
        price = preco;
    }

    Flower(){
        super();
    }

    // Método para exibir informações da flor
    void displayInfo() {
        System.out.printf("Flower Name: %s, color: %s and price: $ %.2f", name, color, price);
    }
}


