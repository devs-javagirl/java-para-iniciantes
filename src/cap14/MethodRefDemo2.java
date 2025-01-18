package cap14;

// Usa uma referência a um método de instância.
// Interface funcional para predicados numéricos que opera com
// valores inteiros.
interface IntPredicate2 {
    boolean test(int n);
}

// Esta classe armazena um valor int e define o método de
// instância isFactor(), que retorna true quando seu argumento
// é fator do valor armazenado.
class MyIntNum {
    private int value;

    MyIntNum(int x) {
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

class MethodRefDemo2 {
    public static void main(String args[])
    {
        boolean result;
        MyIntNum myNum = new MyIntNum(12);
        MyIntNum myNum2 = new MyIntNum(16);

        // Aqui, uma referência ao método isFactor é criada em myNum.
        //Cria uma referência ao método de instância isFactor da classe MyIntNum.
        //O Java "associa" esse método de instância à variável ip (do tipo IntPredicate2).
        IntPredicate2 ip = myNum::isFactor;

        // Agora, ela é usada para chamar isFactor() via test().
        result = ip.test(3);

        if(result)
            System.out.println("3 is a factor of " + myNum.getNum());

        // Desta vez, uma referência ao método isFactor é criada em myNum2.
        // e usada para chamar isFactor() via test().
        ip = myNum2::isFactor;

        result = ip.test(3);

        if(!result)
            System.out.println("3 is not a factor of " + myNum2.getNum());
    }
}
