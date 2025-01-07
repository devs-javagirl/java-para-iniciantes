package cap14;

// Uma interface funcional que testa dois strings.
interface StringTest {
    boolean test(String aStr, String bStr);
}

class LambdaDemo3 {
    public static void main(String args[])
    {
        // Esta expressão lambda determina se um string faz parte de outro.
        StringTest isIn = (a, b) -> a.indexOf(b) != -1;

        String str = "This is a test";

        System.out.println("Testing string: " + str);

        if(isIn.test(str, "is a"))
            System.out.println("'is a' found.");
        else
            System.out.println("'is a' not found.");

        if(isIn.test(str, "xyz"))
            System.out.println("'xyz' Found");
        else
            System.out.println("'xyz' not found");

    }
}
