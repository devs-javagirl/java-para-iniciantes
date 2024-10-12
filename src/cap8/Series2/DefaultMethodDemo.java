package cap8.Series2;

interface MyIF {
    // Esta e uma declaração "comum" de método de uma interface.
    // Ela NÃO define uma implementação padrão.
    int getUserID();

    // Este é um metodo padrão. Observe que ele fornece
    // uma implementação padrão.
    default int getAdminID() {
        return 1;
    }

    // Este é um método de interface estático.
    static int getUniversalID() {
        return 0;
    }
}

class MyIFImp implements MyIF {
    // Só o método getUserID() definido por MyIF precisa ser implementado.
    // a versão padrão de getAdminID() pode ser usada.
    public int getUserID() {
        return 100;
    }
}


public class DefaultMethodDemo {
    public static void main(String args[]) {
        MyIFImp obj = new MyIFImp();
        // Pode chamar o método getUserID(), porque ele é
        // implementado explicitamente por MyIFImp:
        System.out.println("User ID is " + obj.getUserID());
        // Também pode chamar getAdminID(), por causa da
        // implementação padrão:
        System.out.println("Administrator ID is " + obj.getAdminID());
        //Chamada do metodo estatico
        int uID = MyIF.getUniversalID();
        System.out.println("Universal ID is " + uID);

    }
}
