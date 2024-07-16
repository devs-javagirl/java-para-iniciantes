package cap3;

public class ExemploIfElse {
    public static void main(String[] args) {
        int i = 10, j = 1, k = 1;
        int a, b = 2, c = 3, d = 4;

        if(i == 10) {
            if(j < 20) a = b;
            if(k > 100) c = d;
            else a = c; // esse else é referente a if(k > 100)
        }
        else a = d; // esse else é referente a if(i == 10)
    }
}
