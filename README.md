UNIVERSIDADE FEDERAL DA PARAÍBA-UFPB

SISTEMA DE VENDAS PARA LOJAS


Alunos: Pedro Henrique de Araújo Lima,
 Mateus Fonseca Ferreira e Silva,
Alexandre Junior Lelis Rodrigues.


Local do Projeto: https://github.com/Pedr0Henriq/ProjetoLP1.git



1.	INTRODUÇÃO

Ainda hoje em dia, muitos estabelecimentos comerciais, principalmente os de menor expressão, não utilizam de ferramentas práticas oferecidas por tecnologia para administrar seus negócios, como exemplo um sistema de vendas, utilizando meios ultrapassados de gerenciar seu estabelecimento, como caderno de anotações e outros meios. Com isso, viemos com a proposta de entregar um programa prático para esses comércios, afim de auxiliar as tarefas diárias de cada um, realizado na disciplina de Linguagem de Programação I.

2.	MODELAGEM DO PROBLEMA

Pessoa: 
- Classe Abstrata;
- Relacionamento: É a classe mãe das classes Cliente, Funcionario;

Cliente:
- Relacionamento: A classe herda da superclasse Pessoa, e as classes Gerente, Funcionario e Agregação com a classe Loja;

Gerente: 
- Contém polimorfismo dinâmico e estático;
- Relacionamento: A classe herda da superclasse Funcionario, Agregação com as classes Loja e Carrinho;

Funcionario:
- Relacionamentos: A classe herda da superclasse Pessoa, é a superclasse da classe Gerente e Agregação com a classe Loja; 

Produto:
- Relacionamentos: Agregação com as classes Carrinho e Gerente;

Carrinho:
- Relacionamento: Agregação com as classes Produto e Loja;

IPagamento:
- Interface;
- Relacionamentos: As classes Dinheiro, CartaoCredito e Pix implementam a interface;

CartaoCredito:
- Relacionamentos: A classe implementa a interface IPagamento;

Dinheiro: 
- Relacionamentos: A classe implementa a interface IPagamento;

Pix:
-Relacionamentos: A classe implementa a interface IPagamento;

Loja:
- Relacionamentos: A classe tem Agregação com as classes Gerente, Funcionario, Cliente e Carrinho;

3.	FERRAMENTAS UTILIZADAS

Nesse projeto foram utilizadas as IDEs Visual Studio Code e Intellij IDEA, para programar o código, e o Github e Github Desktop para a comunicação dos códigos em equipe. A nossa estrutura de pacote foi a criação da pasta Projeto LP1, para colocarmos os nossos arquivos .java e deixar mais organizado.

4.	RESULTADOS E CONSIDERAÇÕES FINAIS

Bem, ao final do projeto vimos que os nossos resultados foram dentro do esperado e planejado pela equipe. Criamos um programa prático e eficaz que pode auxiliar muitos empreendimentos. No código em si, foram utilizadas técnicas difíceis de programação que é a Programação Orientada a Objetos (POO), basicamente tudo o que foi pedido de POO nós conseguimos aplicar e ficamos bastante satisfeitos com o resultado. 

Em relação as dificuldades encontradas, foram muitas, desde os bugs mais simples na linguagem Java como os da biblioteca java.util.Scanner, como também alguns muito complexos em relação aos ArrayList, como exemplo o erro ConcurrentModificationException nos blocos de código para remover produtos do carrinho e do estoque, que para ser resolvidos tivemos que trabalhar com Iterator da biblioteca java.util.Iterator.

Por fim, adquirimos bastante conhecimento na POO a partir deste projeto e em relação a essa forma de programar, gostamos bastante e achamos mais robusta que a Programação Estruturada. Na disciplina de Linguagem de Programação I não temos o que reclamar, a dinâmica da professora foi ótima durante todo período e a ementa foi muito boa, o feedback que passamos é que a disciplina continue assim para os próximos períodos.


