package cap5;

//javac Phone.java -> cria o Phone.class
//java Phone Tom
public class Phone {
    public static void main(String[] args) {
        String[] args1 = {"Mary"};

        String numbers[][] = {
                { "Tom", "555-3322" },
                { "Mary", "555-8976" },
                { "Jon", "555-1037" },
                { "Rachel", "555-1400" }
        };
        int i;
        //Para o programa ser usado, um argumento
        //de linha de comando deve estar presente.
        if(args1.length != 1)
            System.out.println("Usage: java Phone <name>");
        else {
            for(i=0; i<numbers.length; i++) {
                if(numbers[i][0].equals(args1[0])) {
                    System.out.println(numbers[i][0] + ": " +
                            numbers[i][1]);
                    break;
                }
            }
            if(i == numbers.length)
                System.out.println("Name not found.");
        }
    }
}
