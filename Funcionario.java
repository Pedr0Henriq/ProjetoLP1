import java.util.Scanner;

public class Funcionario extends Pessoa {
    private String cargo;

    public String getCargo(){
        return this.cargo;
    }
    public void setCargo(String _cargo){
        this.cargo=_cargo;
    }

    public int efetuaVenda(Carrinho c1){
        Scanner sc;
        int form_pg;
        System.out.println("Valor Total da Compra: R$"+c1.calcularTotal());
        System.out.println("Digite a sua forma de pagamento: 0- Cartao de Credito  1-PIX  2-Dinheiro");
        sc=new Scanner(System.in);
        form_pg=sc.nextInt();
        return form_pg;
    }

    public void gerarRecibo(Carrinho c1, CartaoCredito cc,Funcionario f1,Cliente cl){
        System.out.println("GERANDO RECIBO!!");
        System.out.println();
        System.out.println("Detalhes da Venda: ");
        c1.exibirCarrinho();
        System.out.println("Quantidade de parcelas: "+cc.formapagamento(c1));
        System.out.println("Funcionario: "+f1.nome+", CPF: "+f1.cpf+", Cargo: "+f1.cargo);
        System.out.println("Cliente: "+cl.nome+", CPF: "+cl.cpf+", Codigo: "+cl.getCodigoCliente()+", CEP: "+cl.getCep()+", Numero da casa: "+cl.getNumeroCasa());
        System.out.println("Recibo gerado, agradecemos a preferencia!");
        c1.efetuarCompra();

    }
    public void gerarRecibo(Carrinho c1,Pix px,Funcionario f1,Cliente cl){
        System.out.println("GERANDO RECIBO!!");
        System.out.println();
        System.out.println("Detalhes da Venda: ");
        c1.exibirCarrinho();
        System.out.println("Forma de Pagamento: Pix");
        System.out.println("Funcionario: "+f1.nome+", CPF: "+f1.cpf+", Cargo: "+f1.cargo);
        System.out.println("Cliente: "+cl.nome+", CPF: "+cl.cpf+", Codigo: "+cl.getCodigoCliente()+", CEP: "+cl.getCep()+", Numero da casa: "+cl.getNumeroCasa());
        System.out.println("Recibo gerado, agradecemos a preferencia!");
        c1.efetuarCompra();
    }
    public void gerarRecibo(Carrinho c1,Dinheiro di,Funcionario f1,Cliente cl){
        System.out.println("GERANDO RECIBO!!");
        System.out.println();
        System.out.println("Detalhes da Venda: ");
        c1.exibirCarrinho();
        System.out.println("Forma de Pagamento: Dinheiro");
        System.out.println("Funcionario: "+f1.nome+", CPF: "+f1.cpf+", Cargo: "+f1.cargo);
        System.out.println("Cliente: "+cl.nome+", CPF: "+cl.cpf+", Codigo: "+cl.getCodigoCliente()+", CEP: "+cl.getCep()+", Numero da casa: "+cl.getNumeroCasa());
        System.out.println("Recibo gerado, agradecemos a preferencia!");
        c1.efetuarCompra();
    }
}
