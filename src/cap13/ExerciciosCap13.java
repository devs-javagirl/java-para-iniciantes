package cap13;

public class ExerciciosCap13 {

    /*
    1 Os gen�ricos s�o importantes para Java porque permitem a cria��o de c�digo
        A. Com seguran�a de tipos
        B. Reutiliz�vel
        C. Confi�vel
        D. Todas as alternativas acima

       Resposta: D
       Os gen�ricos s�o importantes em Java porque permitem criar c�digo que � seguro, reutiliz�vel e confi�vel.
       Eles possibilitam a cria��o de classes, interfaces e m�todos parametrizados,
       eliminando discrep�ncias de tipo ao tornar convers�es autom�ticas e seguras.
       Assim, promovem a reutiliza��o de algoritmos para diferentes tipos de dados,
       garantindo seguran�a de tipos e confiabilidade no c�digo.


     2 Um tipo primitivo pode ser usado como argumento de tipo?
       N�o, os argumentos de tipo devem ser tipos de objeto.

     3  Mostre como declarar uma classe chamada FlightSched que use dois par�metros gen�ricos.
        class FlightSched<T,V> {
        ...
        }

     4  Usando a resposta � Quest�o 3, altere o segundo par�metro de tipo de FlightSched para que seja preciso estender Thread.
        class FlightSched<T, V extends Thread> {
        ...
        }
        V pode ser Thread ou uma classe que seja filha de Thread.
'
        Lembrete: Quando voc� define os gen�ricos no in�cio da classe, eles est�o dispon�veis para todos os membros da classe:
                  atributos, m�todos, construtores e tipos de retorno. Isso permite que o mesmo tipo seja consistente
                  em toda a classe.

     5 Agora, altere FlightSched para que seu segundo par�metro de tipo seja subclasse do primeiro par�metro de tipo.
        class FlightSched<T, V extends T> {
        ...
        }

     6 No que diz respeito aos gen�ricos, o que � o s�mbolo ? e o que ele faz?
        O s�mbolo ? � o argumento curinga. Ele equivale a qualquer tipo v�lido.

     7 O argumento curinga pode ser limitado?
       Sim, um argumento curinga pode ter um limite superior ou inferior
       Exemplo limite superior: WildcardSuper.java
       Exemplo limite inferior: WildcardDemo.java

     8 Um m�todo gen�rico chamado MyGen( ) tem um par�metro de tipo.
        Al�m disso, MyGen( ) tem um par�metro cujo tipo � o do par�metro de tipo.
        Ele tamb�m retorna um objeto desse par�metro de tipo. Mostre como declarar MyGen( ).

        Reescrevendo o enunciado para melhor entendimento:
        Um m�todo gen�rico chamado MyGen( ) tem um par�metro de tipo.
        MyGen( ) tem um par�metro cujo tipo � o do par�metro de tipo.
        Retorna um objeto desse par�metro de tipo.

         public <T> T MyGen(T param) { ...}

         <T> antes do tipo de retorno: Isso define que o m�todo � gen�rico e o tipo T ser� usado como um par�metro de tipo.
         T como tipo de retorno: O m�todo retorna um objeto do mesmo tipo gen�rico T.
         T param como par�metro: O m�todo recebe um argumento do tipo gen�rico T.

      9 Dada esta interface gen�rica
            interface IGenIF<T, V extends T> { // ...
        mostre a declara��o de uma classe chamada MyClass que implemente IGenIF.

        class MyClass<T, V extends T> implements IGenIF<T, V> { // ...

      10 Dada uma classe gen�rica chamada Counter<T>, mostre como criar um objeto de seu tipo bruto.

         Counter x = new Counter;

         Exemplo: RawDemo.java
         Lembrete: Antes da introdu��o de gen�ricos no Java 5, todas as classes eram "n�o gen�ricas"
                    e aceitavam qualquer tipo de objeto. Com a introdu��o de gen�ricos, o uso de
                    tipos brutos ainda � permitido por raz�es de compatibilidade retroativa,
                    mas geralmente deve ser evitado.

      11 Existem par�metros de tipo no tempo de execu��o?
         N�o. Todos os par�metros de tipo s�o apagados durante a compila��o e as convers�es
         apropriadas s�o feitas. Esse processo se chama erasure.

      12  Converta a solu��o dada � Quest�o 10 do Teste do Cap�tulo 9 para que seja gen�rica.
          No processo, crie uma interface de pilha chamada IGenStack que defina genericamente as opera��es push( ) e pop( ).
          Exemplo: Exercicio12.java

      13 O que � <>?
         O operador losango, tamb�m conhecido como colchete ou diamante.

      14 Como a linha a seguir pode ser simplificada?
        MyClass<Double,String> obj = new MyClass<Double,String>(1.1," Hi");

        MyClass<Double,String> obj = new MyClass<>(1.1,"Hi");

        Essa simplifica��o � poss�vel pelo recurso de  infer�ncia de tipo com operador diamante (<>).
        Quando voc� declara uma vari�vel como MyClass<Double, String> obj,
        o compilador j� sabe que os par�metros de tipo devem ser Double e String.
     */
}
