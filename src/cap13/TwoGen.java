package cap13;

class TwoGen<T, V> {
    T ob1;
    V ob2;

    // Construtor que recebe objetos de tipos T e V
    TwoGen(T o1, V o2) {
        ob1 = o1;
        ob2 = o2;
    }

    // Exibe os tipos de T e V
    void showTypes() {
        System.out.println("Type of T is " + ob1.getClass().getName());
        System.out.println("Type of V is " + ob2.getClass().getName());
    }

    T getob1() { return ob1; }
    V getob2() { return ob2; }
}
