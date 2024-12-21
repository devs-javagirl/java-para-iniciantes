package cap13;



// Demonstra��o de tipos brutos
class RawDemo {
    @SuppressWarnings("removal")
    public static void main(String[] args) {
        // Usando gen�ricos corretamente
        Gen<Integer> iOb = new Gen<>(88);
        Gen<String> strOb = new Gen<>("Generics Test");

        // Criando um tipo bruto
        Gen raw = new Gen(new Double(98.6));
        double d = (Double) raw.getob(); // Funciona, mas perde seguran�a de tipos
        System.out.println("value: " + d);

        // Erros de tempo de execu��o com tipos brutos
        //int i = (Integer) raw.getob(); // Erro de tempo de execu��o!

        // Atribui��o de tipo bruto para gen�rico
        strOb = raw; // Correto, mas perigoso
        //String str = strOb.getob(); // Erro de tempo de execu��o!

        // Atribui��o de gen�rico para tipo bruto
        raw = iOb; // Correto, mas perigoso
        d = (Double) raw.getob(); // Erro de tempo de execu��o!

        //Gen<?> gens[] = new Gen<?>[10]; // Correto.
        Gen<?> gens[] = new Gen<?>[10]; // Correto.
    }
}
