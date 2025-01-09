package cap14;

public class ClasseAnonima {
    public static void main(String[] args) {
        // Criando uma interface funcional com um único método
        interface Saudacao {
            void dizerOla(String nome);
        }

        // Usando uma classe anônima para implementar a interface Saudacao
        Saudacao saudacao = new Saudacao() {
            @Override
            public void dizerOla(String nome) {
                System.out.println("Olá, " + nome + "!");
            }
        };

        // Chamando o método da interface
        saudacao.dizerOla("João");
    }
}