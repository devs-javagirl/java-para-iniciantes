package cap14;

// Usa uma refer�ncia de m�todo de inst�ncia para referenciar
// qualquer inst�ncia.
// Interface funcional para predicados num�ricos que opera com um
// objeto de tipo MyIntNum e um valor inteiro.
interface MyIntNumPredicate {
    boolean test(MyIntNum3 mv, int n);
}

// Esta classe armazena um valor int e define o m�todo
// de inst�ncia isFactor(), que retorna true quando seu
// argumento � fator do valor armazenado.
class MyIntNum3 {
    private int value;

    MyIntNum3(int x) {
        value = x;
    }

    int getNum() {
        return value;
    }

    // Retorna true se n for fator de v.
    boolean isFactor(int n) {
        return (value % n) == 0;
    }
}
class MethodRefDemo3 {
    public static void main(String args[]) {
        boolean result;

        MyIntNum3 myNum = new MyIntNum3(12);
        MyIntNum3 myNum2 = new MyIntNum3(16);

        // Esta instru��o faz inp referenciar o m�todo de inst�ncia isFactor().
        // Refer�ncia de m�todo para qualquer objeto de tipo MyIntNum
        MyIntNumPredicate inp = MyIntNum3::isFactor;
        //A diferen�a entre o exemplo MethodRefDemo2 � que a interface recebe a referencia da instancia da classe especifica
        //j� nesse exemplo, a interface recebe a referencia de qualquer instancia da classe

        // A instru��o a seguir chama isFactor() em myNum.
        result = inp.test(myNum, 3);

        if(result)
            System.out.println("3 is a factor of " + myNum.getNum());

        // A pr�xima instru��o chama isFactor() em myNum2.
        result = inp.test(myNum2, 3);

        if(!result)
            System.out.println("3 is a not a factor of " + myNum2.getNum());
    }
}
