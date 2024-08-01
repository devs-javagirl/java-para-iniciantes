package cap3;

public class Switch1 {
    public static void main(String[] args) {
        int i = 2;
        for(i=0; i<=5; i++) {
            switch(i) {
                case 1:
                case 2:
                case 3: System.out.println("i is 1, 2 or 3");
                    break;
                case 4: System.out.println("i is 4");
                    break;
            }
            System.out.println();
        }
    }
}
