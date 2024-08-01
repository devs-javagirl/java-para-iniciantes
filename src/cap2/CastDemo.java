package cap2;

// Demonstra a coerção.
class CastDemo {
    public static void main(String args[]) {
        double x, y;
        byte b;
        int i;
        char ch;
        x = 10.0;
        y = 3.0;
        i = (int) (x / y); // converte double em int
        System.out.println("Integer outcome of x / y: " + i);
        i = 100;
        b = (byte) i;
        System.out.println("1 Value of b: " + b);
        i = 257;
        b = (byte) i;
        System.out.println("2 Value of b: " + b);
        b = 88; // ASCII para X
        ch = (char) b;
        System.out.println("ch: " + ch);
    }
}

