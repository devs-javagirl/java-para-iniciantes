package cap12;

public class TwoGenDemo {
    public static void main(String[] args) {
        TwoGen<Integer, String> tgObj = new TwoGen<>(88, "Generics");
        tgObj.showTypes(); // Exibe os tipos de T e V

        int v = tgObj.getob1();
        System.out.println("value: " + v);

        String str = tgObj.getob2();
        System.out.println("value: " + str);

        TwoGen<String, String> tgObjeto = new TwoGen<>("88", "Generics");
        //tgObj = tgObjeto; // Erro de compilação

    }
}
