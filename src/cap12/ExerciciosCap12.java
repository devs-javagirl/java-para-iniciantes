package cap12;

public class ExerciciosCap12 {

    /*
    1 Diz-se que as constantes de enumera��o s�o autotipadas. O que isso significa?
    Cada constante de enum � automaticamente uma inst�ncia
    da pr�pria enum sem que voc� precise explicitamente criar essa inst�ncia.

    2 Que classe todas as enumera��es herdam automaticamente?
    A classe Enum � herdada automaticamente por todas as enumera��es.
    java.lang.enum

    3 Dada a enumera��o a seguir, escreva um programa que use values( )
    para exibir uma lista das constantes e seus valores ordinais.
    Exemplo: ShowEnum.java
    O m�todo values() retorna todas as instancias da enum em um array.

    4 Exercicio tente 12-1  do semaforo com o contrutor no enum.
     Exemplo: TrafficLightDemo2.java

    5 Defina boxing e unboxing. Como o autoboxing/unboxing afeta essas a��es?
    Boxing � o processo de armazenar um valor primitivo em um objeto encapsulador
    de tipo.
    Unboxing � o processo de recuperar o valor primitivo no encapsulador de tipo.
    O autoboxing encapsula automaticamente um valor primitivo sem ser
    preciso construir um objeto de maneira expl�cita.
    O autounboxing recupera automaticamente o valor primitivo
    em um encapsulador de tipo sem termos que chamar explicitamente um m�todo,
    como intValue( ).

    6 Altere o fragmento a seguir para que use o autoboxing:
        Short val = new Short(123);
     Short val = 123;

     7 Diga em suas pr�prias palavras o que faz a importa��o est�tica.
     Importa todos os membros est�ticos de uma classe ou interface e assim
     podemos us�-los sem escrever o nome da classe ou interface.

     8 O que a instru��o a seguir faz?
        import static java.lang.Integer.parseInt;
     Importa o m�todo parseInt e podemos usar sem escrever o nome.
    Exemplo: Exercicio8.java

    9 A importa��o est�tica foi projetada para situa��es especiais
    ou � boa pr�tica dar visibilidade a todos os membros est�ticos
    de todas as classes?
     A importa��o est�tica foi projetada para casos especiais.
     Dar visibilidade a muitos membros est�ticos levar�
     a colis�es de espa�o de nome e desestruturar� o c�digo.

     10 Uma anota��o � sintaticamente baseada em uma _______?
     Interface
       Uma anota��o � uma constru��o que voc� usa para adicionar
       metadados ao c�digo. Ela � definida com o s�mbolo @
       antes de seu nome, como em @Override, @Deprecated,
       ou anota��es personalizadas que voc� pode criar.
       Ao definir uma anota��o, voc� usa uma sintaxe
       semelhante � de uma interface.
       Internamente, as anota��es s�o representadas
       como interfaces especiais no bytecode.
       Uma anota��o � tratada como uma interface que automaticamente
       extende java.lang.annotation.Annotation.

       11 O  que � uma anota��o marcadora?
       Uma anota��o marcadora � aquela que n�o recebe argumentos.
       Ela � usada apenas para marcar ou indicar alguma caracter�stica no c�digo.
       Exemplo: Exercicio11.java

        12 Uma anota��o s� pode ser aplicada a m�todos. Verdadeiro ou falso?
         Falso. Qualquer tipo de declara��o pode ter uma anota��o.
         Exemplo: Exercicio12.java

     */
}
