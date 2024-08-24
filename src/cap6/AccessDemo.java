package cap6;

class AccessDemo {
    public static void main(String args[]) {
        MyClass myClass = new MyClass();

        // Acesso ao membro privado alpha por m�todos acessadores
        myClass.setAlpha(-99);
        System.out.println("myClass.alpha is " + myClass.getAlpha());

        // Acesso permitido a membros p�blicos e de acesso padr�o
        myClass.beta = 88;
        myClass.gamma = 99;

        // Acesso direto ao membro privado alpha (n�o permitido)
        //myClass.alpha = 10; // Esta linha causaria erro de compila��o
    }
}

