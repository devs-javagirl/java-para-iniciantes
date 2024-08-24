package cap6;

class AccessDemo {
    public static void main(String args[]) {
        MyClass myClass = new MyClass();

        // Acesso ao membro privado alpha por métodos acessadores
        myClass.setAlpha(-99);
        System.out.println("myClass.alpha is " + myClass.getAlpha());

        // Acesso permitido a membros públicos e de acesso padrão
        myClass.beta = 88;
        myClass.gamma = 99;

        // Acesso direto ao membro privado alpha (não permitido)
        //myClass.alpha = 10; // Esta linha causaria erro de compilação
    }
}

