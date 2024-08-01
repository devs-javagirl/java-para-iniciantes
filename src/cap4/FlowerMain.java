package cap4;

// Classe principal para demonstrar a criação de objetos
public class FlowerMain {
    public static void main(String[] args) {
        // Usando o operador new para criar instâncias da classe Flower
        Flower flower1 = new Flower("Rose", "Red", 1.99);
        Flower flower2 = new Flower("Tulip", "Yellow", 2.49);

        Flower flower3 = new Flower();
        flower3.name = "margarida";
        flower3.color = "branca";
        flower3.price = 1.67;


        // Exibindo as informações das flores
        System.out.println("Details of Flower 1:");
        flower1.displayInfo();

        System.out.println("\nDetails of Flower 2:");
        flower2.displayInfo();

        System.out.println("\nDetails of Flower 3:");
        flower3.displayInfo();
    }
}
