package cap3.tests;

public class Test7 {
    public static void main(String[] args) {

        int i, x = 0, y = 0;
        boolean running=true;

        for(i = 0; i < 10; i++) {
            while(running) {
                if(x<y) break;
            }
            System.out.println("after while");
        }
        System.out.println("After for");
    }
}
