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
- Atributos: protected String nome, genero, cpf;
- Métodos: public String getNome(), public String getGenero(), public String getCpf(), public void setNome(), public void setGenero(), public void setCpf();
- Relacionamento: É a classe mãe das classes Cliente, Funcionario;

Cliente:
- Atributos: private String cep, private int numeroCasa, codigoCliente;
- Métodos: public Cliente(), public String getCep(), public String getNumeroCasa(), public String getCodigoCliente(), public void setCep(), public void setNumeroCasa(), public void setCodigoCliente();
- Relacionamento: A classe herda da superclasse Pessoa, e as classes Gerente, Funcionario e Agregação com a classe Loja;

Gerente: 
- Métodos: public static void exibirInformacoes(), public void adcionaPEstoque(), public void removePEstoque(), public void editaPEstoque(), public int efetuaVenda(), public void gerarRecibo();
- Relacionamento: A classe herda da superclasse Funcionario, Agregação com as classes Loja e Carrinho;

Funcionario:
- Atributos: private String cargo;
- Métodos: public String getCargo(), public void setCargo(), public int efetuaVenda(), public void gerarRecibo();
- Relacionamentos: A classe herda da superclasse Pessoa, é a superclasse da classe Gerente e Agregação com a classe Loja; 

Produto:
- Atributos: private String modelo, private String cor, private String tamanho, private double preco, private int estoque;
- Métodos: public Produto(), public String getModelo(), public void setModelo(), public String getCor(), public void setCor(), public String getTamanho(), public void setTamanho(), public double getPreco(), public void setPreco(), public int getEstoque(), public void setEstoque();
- Relacionamentos: Agregação com as classes Carrinho e Gerente;

Carrinho:
- Métodos: public Carrinho(), public void adicionarProduto(), public void removerProduto(), public double calcularTotal(), public void efetuarCompra(), public void exibirCarrinho();
- Relacionamento: Agregação com as classes Produto e Loja;

IPagamento:
- Interface;
- Relacionamentos: As classes Dinheiro, CartaoCredito e Pix implementam a interface;

CartaoCredito:
- Relacionamentos: A classe implementa a interface IPagamento;

Dinheiro: 
- Relacionamentos: A classe implementa a interface IPagamento;

Pix:
- Relacionamentos: A classe implementa a interface IPagamento;

Loja:
- Métodos: public static void main(String[] args), private static void menu(), private static void cliente(), private static void gerente();
- Relacionamentos: A classe tem Agregação com as classes Gerente, Funcionario, Cliente e Carrinho;

3.	FERRAMENTAS UTILIZADAS

Nesse projeto foram utilizadas as IDEs Visual Studio Code e Intellij IDEA, para programar o código, e o Github e Github Desktop para a comunicação dos códigos em equipe. A nossa estrutura de pacote foi a criação da pasta Projeto LP1, para colocarmos os nossos arquivos .java e deixar mais organizado.

4.	RESULTADOS E CONSIDERAÇÕES FINAIS

Bem, ao final do projeto vimos que os nossos resultados foram dentro do esperado e planejado pela equipe. Criamos um programa prático e eficaz que pode auxiliar muitos empreendimentos. No código em si, foram utilizadas técnicas difíceis de programação que é a Programação Orientada a Objetos (POO), basicamente tudo o que foi pedido de POO nós conseguimos aplicar e ficamos bastante satisfeitos com o resultado. 

Em relação as dificuldades encontradas, foram muitas, desde os bugs mais simples na linguagem Java como os da biblioteca java.util.Scanner, como também alguns muito complexos em relação aos ArrayList, como exemplo o erro ConcurrentModificationException nos blocos de código para remover produtos do carrinho e do estoque, que para ser resolvidos tivemos que trabalhar com Iterator da biblioteca java.util.Iterator.

Por fim, adquirimos bastante conhecimento na POO a partir deste projeto e em relação a essa forma de programar, gostamos bastante e achamos mais robusta que a Programação Estruturada. Na disciplina de Linguagem de Programação I não temos o que reclamar, a dinâmica da professora foi ótima durante todo período e a ementa foi muito boa, o feedback que passamos é que a disciplina continue assim para os próximos períodos.


