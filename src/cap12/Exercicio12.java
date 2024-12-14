package cap12;

public class Exercicio12 {
    public static void main(String[] args) {
        MinhaClasse1 minhaClasse1 = new MinhaClasse1();
        minhaClasse1.toString();
    }
}

//em classes
@Deprecated
class MinhaClasse1 {
}

//em metodos
class MinhaClasse2 {
    @Override
    public String toString() {
        return "Exemplo";
    }
}

//em atributos
class MinhaClasse3 {
    @Deprecated
    public String nome;
}

//em parametros de metodos
class MinhaClasse4 {
    public void imprimir(@Deprecated String mensagem) {
        System.out.println(mensagem);
    }
}

//em construtores
class MinhaClasse {
    @Deprecated
    public MinhaClasse() {
        System.out.println("Construtor obsoleto.");
    }
}








