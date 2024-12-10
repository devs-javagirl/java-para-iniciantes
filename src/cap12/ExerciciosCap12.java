package cap12;

public class ExerciciosCap12 {

    /*
    1 Diz-se que as constantes de enumeração são autotipadas. O que isso significa?
    Cada constante de enum é automaticamente uma instância
    da própria enum sem que você precise explicitamente criar essa instância.

    2 Que classe todas as enumerações herdam automaticamente?
    A classe Enum é herdada automaticamente por todas as enumerações.
    java.lang.enum

    3 Dada a enumeração a seguir, escreva um programa que use values( )
    para exibir uma lista das constantes e seus valores ordinais.
    Exemplo: ShowEnum.java
    O método values() retorna todas as instancias da enum em um array.

    4 Exercicio tente 12-1  do semaforo com o contrutor no enum.
     Exemplo: TrafficLightDemo2.java

    5 Defina boxing e unboxing. Como o autoboxing/unboxing afeta essas ações?
    Boxing é o processo de armazenar um valor primitivo em um objeto encapsulador
    de tipo.
    Unboxing é o processo de recuperar o valor primitivo no encapsulador de tipo.
    O autoboxing encapsula automaticamente um valor primitivo sem ser
    preciso construir um objeto de maneira explícita.
    O autounboxing recupera automaticamente o valor primitivo
    em um encapsulador de tipo sem termos que chamar explicitamente um método,
    como intValue( ).

    6 Altere o fragmento a seguir para que use o autoboxing:
        Short val = new Short(123);
     Short val = 123;

     7 Diga em suas próprias palavras o que faz a importação estática.
     Importa todos os membros estáticos de uma classe ou interface e assim
     podemos usá-los sem escrever o nome da classe ou interface.

     8 O que a instrução a seguir faz?
        import static java.lang.Integer.parseInt;
     Importa o método parseInt e podemos usar sem escrever o nome.
    Exemplo: Exercicio8.java

    9 A importação estática foi projetada para situações especiais
    ou é boa prática dar visibilidade a todos os membros estáticos
    de todas as classes?
     A importação estática foi projetada para casos especiais.
     Dar visibilidade a muitos membros estáticos levará
     a colisões de espaço de nome e desestruturará o código.

     10 Uma anotação é sintaticamente baseada em uma _______?
     Interface
       Uma anotação é uma construção que você usa para adicionar
       metadados ao código. Ela é definida com o símbolo @
       antes de seu nome, como em @Override, @Deprecated,
       ou anotações personalizadas que você pode criar.
       Ao definir uma anotação, você usa uma sintaxe
       semelhante à de uma interface.
       Internamente, as anotações são representadas
       como interfaces especiais no bytecode.
       Uma anotação é tratada como uma interface que automaticamente
       extende java.lang.annotation.Annotation.

       11 O  que é uma anotação marcadora?
       Uma anotação marcadora é aquela que não recebe argumentos.
       Ela é usada apenas para marcar ou indicar alguma característica no código.
       Exemplo: Exercicio11.java

        12 Uma anotação só pode ser aplicada a métodos. Verdadeiro ou falso?
         Falso. Qualquer tipo de declaração pode ter uma anotação.
         Exemplo: Exercicio12.java

     */
}
