package cap9;

public class ExerciciosCap9 {

    /*
    1
    Todas as classes de exceções derivam da classe Throwable
    https://dev.to/devsjavagirls/tratamento-de-excecoes-nlg

    2
    As instruções try e catch funcionam em conjunto. As instruções do programa que você
    quiser monitorar em busca de exceções ficarão dentro de um bloco try. Uma exceção é
    capturada com o uso de catch.

    3
    Não há um bloco try antes da instrução catch

    4
    O programa é encerrado.

    5
    Como B é uma subclasse de A, o bloco catch (A exc) captura exceções tanto de A quanto de B.
    Quando a exceção B é lançada, ela é capturada pelo primeiro bloco catch, que é catch (A exc).
    Assim, o segundo bloco catch (B exc) nunca será executado.

    6
    Sim, uma exceção pode ser relançada.
    Exemplo: RethrowDemo.java

    7
    Falso. O bloco finally é o código executado quando um bloco try termina.

    8
    Todas as exceções, exceto as de tipo RuntimeException e Error, devem ser declaradas em uma cláusula throws.

    9
    A classe MyClass é uma classe comum e não estende Throwable, então ela não pode ser lançada com throw.
    Isso resulta em um erro de compilação, pois o Java não reconhece MyClass como uma classe de exceção.
    Para corrigir isso, você precisaria fazer MyClass estender Throwable ou uma de suas subclasses

    10
    Exercicio10.java

    11
    Uma exceção pode ser gerada por um erro na JVM (erro de memoria),
    por um erro no programa (divisao por zero)  ou
    explicitamente via uma instrução throw (execeções criadas como a fila vazia do ex10).

    12
    Error e Exception

    13
    O recurso multi-catch permite que uma cláusula catch capture duas ou mais exceções.

    14
    Não, pois os Error são projetados para sinalizar situações fora do controle da aplicação,
    muitas vezes indicando que o ambiente de execução está em um estado instável ou crítico.
    Capturá-los pode ser perigoso, pois a aplicação pode estar em um estado inconsistente,
    o que aumenta o risco de perda de dados, corrupção de memória ou comportamento imprevisível.
    Error representa condições sérias de erro no nível da JVM (Java Virtual Machine),
    como OutOfMemoryError ou StackOverflowError. Esses erros indicam problemas de sistema que,
    geralmente, o programa não pode (ou não deve tentar) corrigir. Eles são diferentes das exceções
    (Exception), que representam problemas que o programa pode prever e tratar,
    como IOException ou NullPointerException.



     */
}
