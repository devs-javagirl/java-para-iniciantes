package cap8.Series2;

interface MyIF {
    // Esta e uma declara��o "comum" de m�todo de uma interface.
    // Ela N�O define uma implementa��o padr�o.
    int getUserID();

    // Este � um metodo padr�o. Observe que ele fornece
    // uma implementa��o padr�o.
    default int getAdminID() {
        return 1;
    }

    // Este � um m�todo de interface est�tico.
    static int getUniversalID() {
        return 0;
    }
}

class MyIFImp implements MyIF {
    // S� o m�todo getUserID() definido por MyIF precisa ser implementado.
    // a vers�o padr�o de getAdminID() pode ser usada.
    public int getUserID() {
        return 100;
    }
}


public class DefaultMethodDemo {
    public static void main(String args[]) {
        MyIFImp obj = new MyIFImp();
        // Pode chamar o m�todo getUserID(), porque ele �
        // implementado explicitamente por MyIFImp:
        System.out.println("User ID is " + obj.getUserID());
        // Tamb�m pode chamar getAdminID(), por causa da
        // implementa��o padr�o:
        System.out.println("Administrator ID is " + obj.getAdminID());
        //Chamada do metodo estatico
        int uID = MyIF.getUniversalID();
        System.out.println("Universal ID is " + uID);

    }
}
