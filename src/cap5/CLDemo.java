package cap5;

public class CLDemo {
    public static void main(String[] args) {
        String[] args1 = {"one", "two", "three"};

        System.out.println("There are " + args1.length +
                " command-line arguments.");

        System.out.println("They are: ");
        for(int i=0; i<args1.length; i++)
            System.out.println("arg1[" + i + "]: " + args1[i]);
    }
}

//javac CLDemo.java  -> cria o class
//java CLDemo one two three
