package cap13;

// Uma interface gen�rica que lida com armazenamento.
// Esta interface requer que a classe usu�ria
// tenha um ou mais valores.

interface Containment<T> { // Interface gen�rica.
    // O m�todo contains() verifica se um item
    // especificado est� contido dentro de um
    // objeto que implementa Containment.
    boolean contains(T o);
}


// Implementa Containment usando um array
// para armazenar os valores.
//Toda classe que implemente uma interface gen�rica tamb�m deve ser gen�rica.
class MyClass<T> implements Containment<T> { //
    T[] arrayRef;

    MyClass(T[] o) {
        arrayRef = o;
    }

    // Implementa contains()
    public boolean contains(T o) {
        for(T x : arrayRef)
            if(x.equals(o))
                return true;
        return false;
    }
}
class GenIFDemo {
    public static void main(String args[]) {
        Integer x[] = { 1, 2, 3 };

        MyClass<Integer> ob = new MyClass<Integer>(x);

        if(ob.contains(2))
            System.out.println("2 is in ob");
        else
            System.out.println("2 is NOT in ob");

        if(ob.contains(5))
            System.out.println("5 is in ob");
        else
            System.out.println("5 is NOT in ob");

        // A parte a seguir n�o � v�lida porque ob
        // � um objeto Containment de tipo Integer e
        // 9.25 � um valor Double.
        // if(ob.contains(9.25)) // Inv�lido!
        //    System.out.println("9.25 is in ob");
    }
}
