package cap3;

public class Exercicio3IfElse {
    public static void main(String[] args) {
        int x = 1, y = 0, z = 0;
        boolean done = true;

        if(x < 10)
            if(y > 100) {
                if(!done) x = z;
                else y = z;
            }
            else System.out.println("error"); // qual if
    }
}
