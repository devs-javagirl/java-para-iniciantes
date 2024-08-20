package cap5;

public class ShowBitsDemo {
    public static void main(String args[]) {
        ShowBits b = new ShowBits(8);
        ShowBits i = new ShowBits(32);
        ShowBits li = new ShowBits(64);
        System.out.println("123 in binary: ");
        b.show(123);
        System.out.println("\n87987 in binary: ");
        i.show(87987);
        System.out.println("\n237658768 in binary: ");
        li.show(237658768);
        // você também pode exibir os bits de ordem inferior de qualquer inteiro
        System.out.println("\nLow order 8 bits of 87987 in binary: ");
        b.show(87987);
    }
}
