package cap9;

public class ExerciciosCap9 {

    /*
    1
    Todas as classes de exce��es derivam da classe Throwable
    https://dev.to/devsjavagirls/tratamento-de-excecoes-nlg

    2
    As instru��es try e catch funcionam em conjunto. As instru��es do programa que voc�
    quiser monitorar em busca de exce��es ficar�o dentro de um bloco try. Uma exce��o �
    capturada com o uso de catch.

    3
    N�o h� um bloco try antes da instru��o catch

    4
    O programa � encerrado.

    5
    Como B � uma subclasse de A, o bloco catch (A exc) captura exce��es tanto de A quanto de B.
    Quando a exce��o B � lan�ada, ela � capturada pelo primeiro bloco catch, que � catch (A exc).
    Assim, o segundo bloco catch (B exc) nunca ser� executado.

    6
    Sim, uma exce��o pode ser relan�ada.
    Exemplo: RethrowDemo.java

    7
    Falso. O bloco finally � o c�digo executado quando um bloco try termina.

    8
    Todas as exce��es, exceto as de tipo RuntimeException e Error, devem ser declaradas em uma cl�usula throws.

    9
    A classe MyClass � uma classe comum e n�o estende Throwable, ent�o ela n�o pode ser lan�ada com throw.
    Isso resulta em um erro de compila��o, pois o Java n�o reconhece MyClass como uma classe de exce��o.
    Para corrigir isso, voc� precisaria fazer MyClass estender Throwable ou uma de suas subclasses

    10
    Exercicio10.java

    11
    Uma exce��o pode ser gerada por um erro na JVM (erro de memoria),
    por um erro no programa (divisao por zero)  ou
    explicitamente via uma instru��o throw (exece��es criadas como a fila vazia do ex10).

    12
    Error e Exception

    13
    O recurso multi-catch permite que uma cl�usula catch capture duas ou mais exce��es.

    14
    N�o, pois os Error s�o projetados para sinalizar situa��es fora do controle da aplica��o,
    muitas vezes indicando que o ambiente de execu��o est� em um estado inst�vel ou cr�tico.
    Captur�-los pode ser perigoso, pois a aplica��o pode estar em um estado inconsistente,
    o que aumenta o risco de perda de dados, corrup��o de mem�ria ou comportamento imprevis�vel.
    Error representa condi��es s�rias de erro no n�vel da JVM (Java Virtual Machine),
    como OutOfMemoryError ou StackOverflowError. Esses erros indicam problemas de sistema que,
    geralmente, o programa n�o pode (ou n�o deve tentar) corrigir. Eles s�o diferentes das exce��es
    (Exception), que representam problemas que o programa pode prever e tratar,
    como IOException ou NullPointerException.



     */
}
