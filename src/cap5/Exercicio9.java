package cap5;

public class Exercicio9 {
    //Mostre como a sequência a seguir pode ser reescrita com o uso do operador ?.
    public static void main(String[] args) {
        int x = -1, y;

        if(x < 0)
            y = 10;
        else
            y = 20;

        System.out.println("Y = " + y);

        y = x < 0 ? 10 : 20;

        System.out.println("Y = " + y);
    }
}
