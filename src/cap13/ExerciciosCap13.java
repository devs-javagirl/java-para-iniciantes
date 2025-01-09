package cap13;

public class ExerciciosCap13 {

    /*
    1 Os genéricos são importantes para Java porque permitem a criação de código
        A. Com segurança de tipos
        B. Reutilizável
        C. Confiável
        D. Todas as alternativas acima

       Resposta: D
       Os genéricos são importantes em Java porque permitem criar código que é seguro, reutilizável e confiável.
       Eles possibilitam a criação de classes, interfaces e métodos parametrizados,
       eliminando discrepâncias de tipo ao tornar conversões automáticas e seguras.
       Assim, promovem a reutilização de algoritmos para diferentes tipos de dados,
       garantindo segurança de tipos e confiabilidade no código.


     2 Um tipo primitivo pode ser usado como argumento de tipo?
       Não, os argumentos de tipo devem ser tipos de objeto.

     3  Mostre como declarar uma classe chamada FlightSched que use dois parâmetros genéricos.
        class FlightSched<T,V> {
        ...
        }

     4  Usando a resposta à Questão 3, altere o segundo parâmetro de tipo de FlightSched para que seja preciso estender Thread.
        class FlightSched<T, V extends Thread> {
        ...
        }
        V pode ser Thread ou uma classe que seja filha de Thread.
'
        Lembrete: Quando você define os genéricos no início da classe, eles estão disponíveis para todos os membros da classe:
                  atributos, métodos, construtores e tipos de retorno. Isso permite que o mesmo tipo seja consistente
                  em toda a classe.

     5 Agora, altere FlightSched para que seu segundo parâmetro de tipo seja subclasse do primeiro parâmetro de tipo.
        class FlightSched<T, V extends T> {
        ...
        }

     6 No que diz respeito aos genéricos, o que é o símbolo ? e o que ele faz?
        O símbolo ? é o argumento curinga. Ele equivale a qualquer tipo válido.

     7 O argumento curinga pode ser limitado?
       Sim, um argumento curinga pode ter um limite superior ou inferior
       Exemplo limite superior: WildcardSuper.java
       Exemplo limite inferior: WildcardDemo.java

     8 Um método genérico chamado MyGen( ) tem um parâmetro de tipo.
        Além disso, MyGen( ) tem um parâmetro cujo tipo é o do parâmetro de tipo.
        Ele também retorna um objeto desse parâmetro de tipo. Mostre como declarar MyGen( ).

        Reescrevendo o enunciado para melhor entendimento:
        Um método genérico chamado MyGen( ) tem um parâmetro de tipo.
        MyGen( ) tem um parâmetro cujo tipo é o do parâmetro de tipo.
        Retorna um objeto desse parâmetro de tipo.

         public <T> T MyGen(T param) { ...}

         <T> antes do tipo de retorno: Isso define que o método é genérico e o tipo T será usado como um parâmetro de tipo.
         T como tipo de retorno: O método retorna um objeto do mesmo tipo genérico T.
         T param como parâmetro: O método recebe um argumento do tipo genérico T.

      9 Dada esta interface genérica
            interface IGenIF<T, V extends T> { // ...
        mostre a declaração de uma classe chamada MyClass que implemente IGenIF.

        class MyClass<T, V extends T> implements IGenIF<T, V> { // ...

      10 Dada uma classe genérica chamada Counter<T>, mostre como criar um objeto de seu tipo bruto.

         Counter x = new Counter;

         Exemplo: RawDemo.java
         Lembrete: Antes da introdução de genéricos no Java 5, todas as classes eram "não genéricas"
                    e aceitavam qualquer tipo de objeto. Com a introdução de genéricos, o uso de
                    tipos brutos ainda é permitido por razões de compatibilidade retroativa,
                    mas geralmente deve ser evitado.

      11 Existem parâmetros de tipo no tempo de execução?
         Não. Todos os parâmetros de tipo são apagados durante a compilação e as conversões
         apropriadas são feitas. Esse processo se chama erasure.

      12  Converta a solução dada à Questão 10 do Teste do Capítulo 9 para que seja genérica.
          No processo, crie uma interface de pilha chamada IGenStack que defina genericamente as operações push( ) e pop( ).
          Exemplo: Exercicio12.java

      13 O que é <>?
         O operador losango, também conhecido como colchete ou diamante.

      14 Como a linha a seguir pode ser simplificada?
        MyClass<Double,String> obj = new MyClass<Double,String>(1.1," Hi");

        MyClass<Double,String> obj = new MyClass<>(1.1,"Hi");

        Essa simplificação é possível pelo recurso de  inferência de tipo com operador diamante (<>).
        Quando você declara uma variável como MyClass<Double, String> obj,
        o compilador já sabe que os parâmetros de tipo devem ser Double e String.
     */
}
