package cap4;

class ConsDemo {
    public static void main(String args[]) {
        MyClass1 t1 = new MyClass1(); // Cria uma inst�ncia de MyClass
        MyClass1 t2 = new MyClass1(); // Cria outra inst�ncia de MyClass

        // Exibe os valores de x para ambas as inst�ncias
        System.out.println(t1.x + " " + t2.x);
    }
}
