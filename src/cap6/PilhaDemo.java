package cap6;

public class PilhaDemo {

    public static void main(String[] args) {
        Pilha pilha1 = new Pilha(10);
        Pilha pilha2 = new Pilha(10);

        for (int i = 0; i < 10; i++) {
            pilha1.push((char) ('A' + i));
        }

        System.out.print("Conteúdo de pilha1: ");
        pilha1.print();
        System.out.println();

        char ch;

        for (int i = 0; i < 10; i++) {
            ch = pilha1.pop();
            pilha2.push(ch);
        }

        System.out.print("Conteúdo de pilha2: ");
        pilha2.print();
        System.out.println();
    }
}
