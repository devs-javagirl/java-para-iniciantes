package cap8.Series2;

interface Alpha {
    // Metodo padrao reset() em Alpha
    default void reset() {
        System.out.println("Reset from Alpha");
    }
}

interface Beta {
    // Metodo padrao reset() em Beta
    default void reset() {
        System.out.println("Reset from Beta");
    }
}

public class MyClass implements Alpha, Beta {
    // Conflito de heranca multipla: precisa resolver qual reset() usar
    @Override
    public void reset() {
//        System.out.println("Reset de MyClass");
        // Podemos escolher explicitamente qual vers�o de reset() usar
        Alpha.super.reset(); // Usa o reset() da interface Alpha
        // ou
        //Beta.super.reset(); // Usa o reset() da interface Beta
    }

    public void metodoMyClass(){
        System.out.println("metodoMyClass");
}

    public static void main(String[] args) {
        MyClass obj = new MyClass();
        obj.reset(); // Aqui chamar� o reset() conforme a escolha no m�todo acima
    }
}


