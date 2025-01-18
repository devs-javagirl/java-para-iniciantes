package cap14;

// Demonstra uma referência de constructor.
// MyFuncConstructorRef é uma interface funcional cujo método retorna
// uma referência MyClass.
interface MyFuncConstructorRef {
    MyClass func(String s);
}

class MyClass {
    private String str;

    // Este construtor recebe um argumento.
    MyClass(String s) {
        str = s;
    }

    // Este é o construtor padrão.
    MyClass() {
        str = "";
    }
    // ...
    String getStr() {
        return str;
    }
}

class ConstructorRefDemo {
    public static void main(String args[]) {
        // Cria uma referência ao construtor de MyClass.
        // Já que o método func() de MyFuncConstructorRef recebe um argumento,
        // new referencia o construtor parametrizado de MyClass
        // e não o construtor padrão.
        MyFuncConstructorRef myClassCons = MyClass::new; //Uma referência de construtor

        // Cria uma instância de MyClass usando essa referência de construtor.
        MyClass mc = myClassCons.func("Testing");

        // Usa a instância de MyClass recém criada.
        System.out.println("str in mc is " + mc.getStr( ));
    }
}