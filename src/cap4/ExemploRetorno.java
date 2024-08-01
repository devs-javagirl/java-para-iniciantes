package cap4;

public class ExemploRetorno {
    static void myMeth() {
        for(int i=0; i<10; i++) {
            if(i == 5)
                return; // para em 5

            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        myMeth();
    }
}
