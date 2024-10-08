package cap7;

public class Exercicio3a12 {
    /*
3 Como impedir que uma subclasse tenha acesso a um membro de uma super classe?
Resposta: Colocando o membro da super classe como private
Exemplo: Exercicio2.java


4 Descreva a finalidade e a aplicação das duas versões de super mostradas neste capítulo.
Resposta: foram usadas as formas:
super(lista-parâm)
super.membr
Exemplo: Exercicio4.java


5 Dada a hierarquia a seguir:
class Alpha { ...
class Beta extends Alpha { ...
Class Gamma extends Beta { ...
Em que ordem os construtores dessas classes concluem sua execução quando um objeto Gamma é instanciado?

Resposta:  ordem é Alpha, Beta, Gamma. É instanciada priemiro sempre a superclasse e a subclasse.
Exemplo: OrderOfConstruction.java


6 Uma referência da superclasse pode referenciar um objeto da subclasse.
Explique por que isso é importante no âmbito da sobreposição de métodos.
Resposta: Isto está relacionado ao conceito de polimorfismo em Java,
que permite que uma referência de superclasse aponte para objetos de subclasses.
O ponto chave é que, mesmo que você tenha uma referência de superclasse,
o método executado será o da subclasse, caso o método tenha sido sobreposto (overridden).
Exemplo: Exercicio6.java


7 O que é uma classe abstrata?
É uma classe base que não pode ser instanciada, permitindo que as subclasses forneçam implementações específicas.
Contém pelo menos um método abstrato.
Exemplo: Exercicio7


8 Como impedir que um método seja sobreposto? E que uma classe seja herdada?
Resposta: Para impedir que um método seja sobreposto, declare-o como final. Para impedir que
uma classe seja herdada, declare-a também como final.
Exemplo: Exercicio8.java


9 Explique como a herança, a sobreposição de métodos e as classes abstratas são usadas para dar suporte ao polimorfismo.
 A herança, a sobreposição de métodos e as classes abstratas dão suporte ao polimorfismo
 permitindo a criação de uma estrutura de classes generalizada que possa ser implementada por várias classes.


10 Que classe é superclasse de todas as outras classes?
A classe Object


11 Uma classe que contém pelo menos um método abstrato deve ser declarada como abstrata. Verdadeiro ou falso?
Verdadeiro


12 Que palavra-chave é usada para criar uma constante nomeada?
Resposta: final
 O valor de uma variável final não pode ser alterado após sua atribuição inicial.

*/
}
