package cap13;



// Demonstração de tipos brutos
class RawDemo {
    @SuppressWarnings("removal")
    public static void main(String[] args) {
        // Usando genéricos corretamente
        Gen<Integer> iOb = new Gen<>(88);
        Gen<String> strOb = new Gen<>("Generics Test");

        // Criando um tipo bruto
        Gen raw = new Gen(new Double(98.6));
        double d = (Double) raw.getob(); // Funciona, mas perde segurança de tipos
        System.out.println("value: " + d);

        // Erros de tempo de execução com tipos brutos
        //int i = (Integer) raw.getob(); // Erro de tempo de execução!

        // Atribuição de tipo bruto para genérico
        strOb = raw; // Correto, mas perigoso
        //String str = strOb.getob(); // Erro de tempo de execução!

        // Atribuição de genérico para tipo bruto
        raw = iOb; // Correto, mas perigoso
        d = (Double) raw.getob(); // Erro de tempo de execução!

        //Gen<?> gens[] = new Gen<?>[10]; // Correto.
        Gen<?> gens[] = new Gen<?>[10]; // Correto.
    }
}
