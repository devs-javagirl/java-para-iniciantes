package cap7;

public class Exercicio3a12 {
    /*
3 Como impedir que uma subclasse tenha acesso a um membro de uma super classe?
Resposta: Colocando o membro da super classe como private
Exemplo: Exercicio2.java


4 Descreva a finalidade e a aplica��o das duas vers�es de super mostradas neste cap�tulo.
Resposta: foram usadas as formas:
super(lista-par�m)
super.membr
Exemplo: Exercicio4.java


5 Dada a hierarquia a seguir:
class Alpha { ...
class Beta extends Alpha { ...
Class Gamma extends Beta { ...
Em que ordem os construtores dessas classes concluem sua execu��o quando um objeto Gamma � instanciado?

Resposta:  ordem � Alpha, Beta, Gamma. � instanciada priemiro sempre a superclasse e a subclasse.
Exemplo: OrderOfConstruction.java


6 Uma refer�ncia da superclasse pode referenciar um objeto da subclasse.
Explique por que isso � importante no �mbito da sobreposi��o de m�todos.
Resposta: Isto est� relacionado ao conceito de polimorfismo em Java,
que permite que uma refer�ncia de superclasse aponte para objetos de subclasses.
O ponto chave � que, mesmo que voc� tenha uma refer�ncia de superclasse,
o m�todo executado ser� o da subclasse, caso o m�todo tenha sido sobreposto (overridden).
Exemplo: Exercicio6.java


7 O que � uma classe abstrata?
� uma classe base que n�o pode ser instanciada, permitindo que as subclasses forne�am implementa��es espec�ficas.
Cont�m pelo menos um m�todo abstrato.
Exemplo: Exercicio7


8 Como impedir que um m�todo seja sobreposto? E que uma classe seja herdada?
Resposta: Para impedir que um m�todo seja sobreposto, declare-o como final. Para impedir que
uma classe seja herdada, declare-a tamb�m como final.
Exemplo: Exercicio8.java


9 Explique como a heran�a, a sobreposi��o de m�todos e as classes abstratas s�o usadas para dar suporte ao polimorfismo.
 A heran�a, a sobreposi��o de m�todos e as classes abstratas d�o suporte ao polimorfismo
 permitindo a cria��o de uma estrutura de classes generalizada que possa ser implementada por v�rias classes.


10 Que classe � superclasse de todas as outras classes?
A classe Object


11 Uma classe que cont�m pelo menos um m�todo abstrato deve ser declarada como abstrata. Verdadeiro ou falso?
Verdadeiro


12 Que palavra-chave � usada para criar uma constante nomeada?
Resposta: final
 O valor de uma vari�vel final n�o pode ser alterado ap�s sua atribui��o inicial.

*/
}
