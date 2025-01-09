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
        MyValue myVal; // declara uma refer�ncia de interface

        // Aqui, a express�o lambda � simplesmente uma express�o de constante.
        // Quando ela � atribu�da a myVal, � constru�da a inst�ncia
        // de uma classe em que a express�o lambda implementa o
        // m�todo getValue() de MyValue.
        myVal = () -> 98.6; // Uma express�o lambda simples

        // Chama getValue(), que � fornecido pela
        // express�o lambda atribu�da anteriormente.
        System.out.println("A constant value: " + myVal.getValue());

        // Agora, cria uma express�o lambda parametrizada e a atribui
        // a uma refer�ncia de MyParamValue. Essa express�o lambda retorna
        // o rec�proco de seu argumento.
        MyParamValue myPval = (n) -> 1.0 / n; // Uma express�o lambda que tem um par�metro

        // Chama getValue() por interm�dio da refer�ncia de myPval.
        System.out.println("Reciprocal of 4 is " + myPval.getValue(4.0));
        System.out.println("Reciprocal of 8 is " + myPval.getValue(8.0));

        // Uma express�o lambda deve ser compat�vel com o m�todo definido
        // pela interface funcional. Logo, essas instru��es n�o funcionar�o:
        // myVal = () -> "three"; // Erro! String n�o � compat�vel com double!
        // myPval = () -> Math.random(); // Erro! O par�metro � necess�rio!
    }
}
