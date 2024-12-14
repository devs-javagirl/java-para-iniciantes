package cap12;

class Gen<T> {
    T ob; // Objeto do tipo T

    // Construtor recebe um objeto do tipo T
    Gen(T o) {
        ob = o;
    }

    // Retorna o objeto
    T getob() {
        return ob;
    }

    // Mostra o tipo do objeto armazenado
    void showType() {
        System.out.println("Type of T is " + ob.getClass().getName());
    }
}

