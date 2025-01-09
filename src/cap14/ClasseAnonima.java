package cap14;

public class ClasseAnonima {
    public static void main(String[] args) {
        // Criando uma interface funcional com um �nico m�todo
        interface Saudacao {
            void dizerOla(String nome);
        }

        // Usando uma classe an�nima para implementar a interface Saudacao
        Saudacao saudacao = new Saudacao() {
            @Override
            public void dizerOla(String nome) {
                System.out.println("Ol�, " + nome + "!");
            }
        };

        // Chamando o m�todo da interface
        saudacao.dizerOla("Jo�o");
    }
}