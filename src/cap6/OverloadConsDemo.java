package cap6;

class MyClass1{
    int x;
    MyClass1() {
        System.out.println("Inside MyClass().");
        x = 0;
    }
    //Constroi objetos de várias maneiras
    MyClass1(int i) {
        System.out.println("Inside MyClass(int).");
        x = i;
    }
    MyClass1(double d) {
        System.out.println("Inside MyClass(double).");
        x = (int) d;
    }
    MyClass1(int i, int j) {
        System.out.println("Inside MyClass(int, int).");
        x = i * j;
    }
 }
class OverloadConsDemo {

    public static void main(String args[]) {
        MyClass1 t1 = new MyClass1();
        MyClass1 t2 = new MyClass1(88);
        MyClass1 t3 = new MyClass1(17.23);
        MyClass1 t4 = new MyClass1(2, 4);

        System.out.println("t1.x: " + t1.x);
        System.out.println("t2.x: " + t2.x);
        System.out.println("t3.x: " + t3.x);
        System.out.println("t4.x: " + t4.x);
    }
}