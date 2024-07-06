package cap2;

    //b * b resulta em int, então é necessária coerção para atribuir a b.
class PromDemo {
    public static void main(String args[]) {
        byte b;
        char c;
        int i, j;
        b = 10;
        i = b * b; // Não é necessária coerção, resultado é int
        b = 10;
        b = (byte) (b * b); // Coerção necessária para atribuir int a byte
        c = 'A';
        j = (char) (c * c); // Coerção necessária para atribuir int a char
        System.out.println("i and b and c: " + i + " " + b + " " + j);
    }
}

