package cap6;

class StaticDemo {
    int x; // vari�vel de inst�ncia comum
    static int y; // vari�vel est�tica compartilhada por todos os objetos

    int sum() {
        return x + y;
    }
}

class SDemo {
    public static void main(String args[]) {
        StaticDemo ob1 = new StaticDemo();
        StaticDemo ob2 = new StaticDemo();

        // Vari�veis de inst�ncia s�o independentes
        ob1.x = 10;
        ob2.x = 20;
        System.out.println("ob1.x: " + ob1.x);
        System.out.println("ob2.x: " + ob2.x);

        // Vari�vel est�tica � compartilhada
        StaticDemo.y = 19;
        System.out.println("ob1.y: " + ob1.y);
        System.out.println("ob2.y: " + ob2.y);

        System.out.println("ob1.sum(): " + ob1.sum());
        System.out.println("ob2.sum(): " + ob2.sum());

        StaticDemo.y = 100;
        System.out.println("ob1.y: " + ob1.y);
        System.out.println("ob2.y: " + ob2.y);

        System.out.println("ob1.sum(): " + ob1.sum());
        System.out.println("ob2.sum(): " + ob2.sum());
    }
}

