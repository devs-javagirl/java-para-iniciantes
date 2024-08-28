package cap7;

/* Conversões de tipo automáticas podem afetar
  a definição do método sobrecarregado.
*/
class Overload2 {
    void f(int x) {
        System.out.println("Inside f(int): " + x);
    }
    void f(double x) {
        System.out.println("Inside f(double): " + x);
    }
}

class TypeConv {
    public static void main(String args[]) {
        Overload2 ob = new Overload2();
        int i = 10;
        double d = 10.1;
        byte b = 99;
        short s = 10;
        float f = 11.5F;

        ob.f(i); // chama ob.f(int)
        ob.f(d); // chama ob.f(double)
        ob.f(b); // chama ob.f(int) - conversão de tipo
        ob.f(s); // chama ob.f(int) - conversão de tipo
        ob.f(f); // chama ob.f(double) – conversão de tipo
    }
}
