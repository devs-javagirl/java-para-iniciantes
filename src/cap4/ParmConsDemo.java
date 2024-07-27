package cap4;

class ParmConsDemo {
    public static void main(String args[]) {

        MyClass2 t1 = new MyClass2(10); // Cria uma instância de MyClass com x = 10
        MyClass2 t2 = new MyClass2(88); // Cria outra instância de MyClass com x = 88
        MyClass2 t3 = new MyClass2();

        // Exibe os valores de x para ambas as instâncias
        System.out.println(t1.x + " " + t2.x + " " + t3.x);
    }
}
