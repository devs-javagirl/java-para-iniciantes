package cap6;

// Adiciona f(byte).
class Overload3 {
    //Esta versão especifica um parâmetro byte.
    void f(byte x) {
        System.out.println("Inside f(byte): " + x);
    }

    void f(int x) {
        System.out.println("Inside f(int): " + x);
    }
    void f(double x) {
        System.out.println("Inside f(double): " + x);
    }
}

class TypeConv3 {
    public static void main(String args[]) {
        Overload3 ob = new Overload3();
        int i = 10;
        double d = 10.1;
        byte b = 99;
        short s = 10;
        float f = 11.5F;
        ob.f(i); // chama ob.f(int)
        ob.f(d); // chama ob.f(double)
        ob.f(b); // chama ob.f(byte) – agora, sem conversão de tipo
        ob.f(s); // chama ob.f(int) - conversão de tipo
        ob.f(f); // chama ob.f(double) – conversão de tipo
    }
}