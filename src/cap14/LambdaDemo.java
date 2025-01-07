package cap14;

// Uma interface funcional.
interface MyValue {
    double getValue();
}

// Outra interface funcional.
interface MyParamValue {
    double getValue(double v);
}

class LambdaDemo {
    public static void main(String args[])
    {
        MyValue myVal; // declara uma referência de interface

        // Aqui, a expressão lambda é simplesmente uma expressão de constante.
        // Quando ela é atribuída a myVal, é construída a instância
        // de uma classe em que a expressão lambda implementa o
        // método getValue() de MyValue.
        myVal = () -> 98.6; // Uma expressão lambda simples

        // Chama getValue(), que é fornecido pela
        // expressão lambda atribuída anteriormente.
        System.out.println("A constant value: " + myVal.getValue());

        // Agora, cria uma expressão lambda parametrizada e a atribui
        // a uma referência de MyParamValue. Essa expressão lambda retorna
        // o recíproco de seu argumento.
        MyParamValue myPval = (n) -> 1.0 / n; // Uma expressão lambda que tem um parâmetro

        // Chama getValue() por intermédio da referência de myPval.
        System.out.println("Reciprocal of 4 is " + myPval.getValue(4.0));
        System.out.println("Reciprocal of 8 is " + myPval.getValue(8.0));

        // Uma expressão lambda deve ser compatível com o método definido
        // pela interface funcional. Logo, essas instruções não funcionarão:
        // myVal = () -> "three"; // Erro! String não é compatível com double!
        // myPval = () -> Math.random(); // Erro! O parâmetro é necessário!
    }
}
