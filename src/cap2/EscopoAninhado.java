package cap2;

public class EscopoAninhado {

    public static void main(String[] args) {
        exemplo1();
        exemplo2();
        exemplo3();
    }

    private static void exemplo3() {
        // Este programa não será compilado
        //int count;
        for(int count = 0; count < 10; count++) {
            //int count1;  // inválido
            for(int count1 = 0; count1 < 2; count1++)
                System.out.println(count +"."+count1+" This program is in error!");
        }
    }

    private static void exemplo2() {
        int y = 0;
        for(int x = 0; x < 3; x++) {
            System.out.println("y is: " + y++);
            System.out.println("x is: " + x);
        }
    }

    private static void exemplo1() {
        int x = 10;
        if(x == 10) {
            int y = 20;
            System.out.println("x and y: " + x + " " + y);
            x = y * 2;
        }
        System.out.println("x is " + x);
    }
}
