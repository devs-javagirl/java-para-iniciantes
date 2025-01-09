package cap14;

interface MyValueSemLambda1 {
    double getValue();  // Método abstrato
}

class MyValueImpl implements MyValueSemLambda1{
    private double value;

    // Construtor para inicializar o atributo value
    public MyValueImpl(double value) {
        this.value = value;
    }

    // Implementação do método getValue
    @Override
    public double getValue() {
        return this.value;
    }
}

public class MyValueSemLambda {
    public static void main(String[] args) {
        MyValueSemLambda1 myVal = new MyValueImpl(98.6);  // Atribuindo valor ao atributo
        System.out.println("Value: " + myVal.getValue());  // Imprime 98.6
    }
}
