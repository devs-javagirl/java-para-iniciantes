package cap4;

class ConsDemo {
    public static void main(String args[]) {
        MyClass1 t1 = new MyClass1(); // Cria uma instância de MyClass
        MyClass1 t2 = new MyClass1(); // Cria outra instância de MyClass

        // Exibe os valores de x para ambas as instâncias
        System.out.println(t1.x + " " + t2.x);
    }
}
