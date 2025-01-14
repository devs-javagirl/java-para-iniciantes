package cap14;

// Demonstra uma refer�ncia de constructor.
// MyFuncConstructorRef � uma interface funcional cujo m�todo retorna
// uma refer�ncia MyClass.
interface MyFuncConstructorRef {
    MyClass func(String s);
}

class MyClass {
    private String str;

    // Este construtor recebe um argumento.
    MyClass(String s) {
        str = s;
    }

    // Este � o construtor padr�o.
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
        // Cria uma refer�ncia ao construtor de MyClass.
        // J� que o m�todo func() de MyFuncConstructorRef recebe um argumento,
        // new referencia o construtor parametrizado de MyClass
        // e n�o o construtor padr�o.
        MyFuncConstructorRef myClassCons = MyClass::new; //Uma refer�ncia de construtor

        // Cria uma inst�ncia de MyClass usando essa refer�ncia de construtor.
        MyClass mc = myClassCons.func("Testing");

        // Usa a inst�ncia de MyClass rec�m criada.
        System.out.println("str in mc is " + mc.getStr( ));
    }
}