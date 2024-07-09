package cap2;

public class CarriageReturnDemo {
    /*
    O retorno de carro move o cursor de volta ao início da linha.
    Isso permite que você sobrescreva o texto que já foi impresso.
     */
    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i <= 10; i++) {
            System.out.print("Contando: " + i + "\r");
            Thread.sleep(500); // Pausa de 500 milissegundos
        }
        System.out.println("Contagem completa!");
    }
}

