import java.lang.Override;
import java.util.Scanner;
import java.util.Objects;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
public class Gerente extends Funcionario {
    static List<Produto> produt0s=new ArrayList<>();
    Scanner sc=new Scanner(System.in);
    public static void exibirInformacoes() {
        System.out.println("Produtos disponiveis: ");
        for(Produto produto:produt0s){
        if(produto.getEstoque()>0){
        System.out.println();
        System.out.println("Modelo: " + produto.getModelo());
        System.out.println("Cor: " + produto.getCor());
        System.out.println("Tamanho: " + produto.getTamanho());
        System.out.println("Preço: " + produto.getPreco());
        System.out.println("Estoque: " + produto.getEstoque());
        System.out.println();}
        else{
            System.out.println("Produtos Indisponiveis: ");
            System.out.println();
            System.out.println("Modelo: " + produto.getModelo());
            System.out.println("Cor: " + produto.getCor());
            System.out.println("Tamanho: " + produto.getTamanho());
            System.out.println("Preço: " + produto.getPreco());
            System.out.println("Estoque: " + produto.getEstoque());
            System.out.println();
        }}
    }
    public void adicionaPEstoque(){
        String modelo, cor, tamanho;
        double preco;
        int estoque,k=0;
                System.out.println("Diga o modelo: ");
                modelo=sc.next();
                for(Produto p: produt0s){
                    if(Objects.equals(p.getModelo(), modelo)){
                        System.out.println("O Produto ja existe!");
                        k++;
                        break;
                    }
                }
                if(k==0){
                System.out.println("Digite a cor: ");
                cor=sc.next();
                System.out.println("Digite o tamanho:");
                tamanho=sc.next();
                System.out.println("Digite o valor: ");
                preco=sc.nextDouble();
                System.out.println("Digite a quantidade: ");
                estoque=sc.nextInt();
                Produto produto = new Produto(modelo, cor, tamanho, preco, estoque);
                produt0s.add(produto);}
                
        }
    public void removePEstoque(){
        String _modelo;
        int k=0;
        System.out.println("Digite o nome do produto: ");
        _modelo=sc.next();
        Iterator<Produto> iterator = produt0s.iterator();
        while (iterator.hasNext()) {
            Produto p = iterator.next();
            if (Objects.equals(_modelo, p.getModelo())) {
                iterator.remove();
                k++;
                System.out.println("Produto removido!");
            }}
        if(k==0){
            System.out.println("Produto nao existe!");
        }
    }
    public void editaPEstoque(){
        String _modelo;
        System.out.println("Digite o nome do produto: ");
        _modelo=sc.next();
        for(Produto produto: produt0s){
            if(Objects.equals(produto.getModelo(), _modelo)){
                int escolha;
                System.out.println("Digite o que deseja alterar no produto: 0-modelo 1-cor 2-tamanho 3-preco 4-quantidade em estoque");
                escolha=sc.nextInt();
                switch(escolha){
                case 0:
                    System.out.println("Digite o novo modelo do produto: ");
                    _modelo=sc.next();
                    produto.setModelo(_modelo);
                    System.out.println("Produto ajustado com sucesso!");
                    break;
                case 1:
                    System.out.println("Digite a nova cor do produto: ");
                    produto.setCor(sc.next());
                    System.out.println("Cor do produto ajustada com sucesso!");
                    break;
                case 2:
                    System.out.println("Digite o novo tamanho do produto: ");
                    produto.setTamanho(sc.next());
                    System.out.println("Tamanho do produto ajustado com sucesso!");
                    break;
                case 3:
                    System.out.println("Digite o novo precoo do produto: ");
                    produto.setPreco(sc.nextDouble());
                    System.out.println("Preco do produto ajustado com sucesso!");
                    break;
                case 4:
                    System.out.println("Digite a nova quantidade do produto: ");
                    produto.setEstoque(sc.nextInt());
                    System.out.println("Quantidade do produto ajustada com sucesso!");
                    break;
                default:
                    System.out.println("Digite algum parametro valido!");
                    break;
                }
            }
        }
    }
    @Override
    public int efetuaVenda(Carrinho c1){
        int form_pg;
        System.out.println("O gerente ira dar algum desconto ao cliente: S-sim N-nao ");
        if(Objects.equals("S", sc.next())){
        System.out.println("Valor Total da Compra: R$"+(c1.calcularTotal()-0.1*c1.calcularTotal()));
        System.out.println("Digite a sua forma de pagamento: 0- Cartao de Credito  1-PIX  2-Dinheiro");
        form_pg=sc.nextInt();
        return form_pg;}
        else{
        System.out.println("Valor Total da Compra: R$"+c1.calcularTotal());
        System.out.println("Digite a sua forma de pagamento: 0- Cartao de Credito  1-PIX  2-Dinheiro");
        form_pg=sc.nextInt();
        return form_pg;
        }
    }

    @Override
    public void gerarRecibo(Carrinho c1, CartaoCredito cc,Funcionario f1,Cliente cl){
        System.out.println("GERANDO RECIBO!!");
        System.out.println();
        System.out.println("Detalhes da Venda: ");
        c1.exibirCarrinho();
        System.out.println("Desconto de 10%, Valor Total da comprar: R$"+(c1.calcularTotal()-0.1*c1.calcularTotal()));
        System.out.println("Quantidade de parcelas: "+cc.formapagamento(c1));
        System.out.println("Gerente: "+f1.nome+", CPF: "+f1.cpf);
        System.out.println("Cliente: "+cl.nome+", CPF: "+cl.cpf+", Codigo: "+cl.getCodigoCliente()+", CEP: "+cl.getCep()+", Numero da casa: "+cl.getNumeroCasa());
        System.out.println("Recibo gerado, agradecemos a preferencia!");
        c1.efetuarCompra();

    }
    @Override
    public void gerarRecibo(Carrinho c1,Pix px,Funcionario f1,Cliente cl){
        System.out.println("GERANDO RECIBO!!");
        System.out.println();
        System.out.println("Detalhes da Venda: ");
        c1.exibirCarrinho();
        System.out.println("Desconto de 10%, Valor Total da comprar: R$"+(c1.calcularTotal()-0.1*c1.calcularTotal()));
        System.out.println("Forma de Pagamento: Pix");
        System.out.println("Funcionario: "+f1.nome+", CPF: "+f1.cpf);
        System.out.println("Cliente: "+cl.nome+", CPF: "+cl.cpf+", Codigo: "+cl.getCodigoCliente()+", CEP: "+cl.getCep()+", Numero da casa: "+cl.getNumeroCasa());
        System.out.println("Recibo gerado, agradecemos a preferencia!");
        c1.efetuarCompra();
    }
    @Override
    public void gerarRecibo(Carrinho c1,Dinheiro di,Funcionario f1,Cliente cl){
        System.out.println("GERANDO RECIBO!!");
        System.out.println();
        System.out.println("Detalhes da Venda: ");
        c1.exibirCarrinho();
        System.out.println("Desconto de 10%, Valor Total da comprar: R$"+(c1.calcularTotal()-0.1*c1.calcularTotal()));
        System.out.println("Forma de Pagamento: Dinheiro");
        System.out.println("Funcionario: "+f1.nome+", CPF: "+f1.cpf);
        System.out.println("Cliente: "+cl.nome+", CPF: "+cl.cpf+", Codigo: "+cl.getCodigoCliente()+", CEP: "+cl.getCep()+", Numero da casa: "+cl.getNumeroCasa());
        System.out.println("Recibo gerado, agradecemos a preferencia!");
        c1.efetuarCompra();
    }
}
