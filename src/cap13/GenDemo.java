package cap13;

class GenDemo {
    public static void main(String args[]) {
        // Gen com Integer
        Gen<Integer> iOb = new Gen<>(88);
        iOb.showType(); // Mostra o tipo: Integer
        System.out.println("value: " + iOb.getob());

        // Gen com String
        Gen<String> strOb = new Gen<>("Generics Test");
        strOb.showType(); // Mostra o tipo: String
        System.out.println("value: " + strOb.getob());
    }
}
