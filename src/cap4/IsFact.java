package cap4;

public class IsFact {
    public static void main(String args[]) {
        Factor factor = new Factor();
        if(factor.isFactor(2, 20)) System.out.println("2 is factor");
        if(factor.isFactor(3, 20)) System.out.println("this won't be displayed");
    }
}
