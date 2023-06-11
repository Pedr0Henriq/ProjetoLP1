import java.util.Objects;
import java.util.Scanner;
public class Loja {
    public static void main(String[] args) {
        menu();
    }

    private static void menu() {
        Scanner sc = new Scanner(System.in);
        System.out.println("==============MENU===============");
        System.out.println("1- Acessar perfil Cliente.");
        System.out.println("2- Acessar perfil Gerente.");
        System.out.println("3- Sair.");
        System.out.println("=================================");
        int escolha = sc.nextInt();
        switch (escolha) {
            case 1 -> cliente();
            case 2 -> {
                long cpf=0;
                System.out.println("Informe o cpf:");
                cpf= sc.nextLong();
                if(cpf == 14381307401l) {
                    gerente();
                }
                else {
                    System.out.println("ERRO, O CPF NAO E O DO GERENTE!");
                    menu();
                }
            }
            case 3 ->{ System.out.println("Encerrando...");
            sc.close();             
            System.exit(0);}
            default -> {
                System.out.println("Comando inválido.");
                menu();
            }
        }
    }

    private static void cliente() {
        Scanner sc = new Scanner(System.in);
        Carrinho c1= new Carrinho();
        String _modelo;
        System.out.println("=============CLIENTE==============");
        System.out.println("1- Visualizar produtos.");
        System.out.println("2- Adicionar produto no carrinho.");
        System.out.println("3- Remover produto do carrinho.");
        System.out.println("4- Finalizar compra.");
        System.out.println("5- Voltar ao menu.");
        System.out.println("==================================");
        int escolha = sc.nextInt();
        switch (escolha) {
            case 1:
                Gerente.exibirInformacoes();
                cliente();
                break;
            case 2:
                int k=0;
                System.out.println("Digite o modelo do produto: ");
                _modelo=sc.next();
                for(Produto p: Gerente.produt0s){
                    if(Objects.equals(p.getModelo(), _modelo)){
                        System.out.println("Adicionando produto no carrinho!");
                        c1.adicionarProduto(p);
                        k++;
                        c1.exibirCarrinho();
                    }
                }
                if(k==0){
                    System.out.println("Produto nao existe");
                }
                cliente();
                break;
            case 3:
                int n=0;
                System.out.println("Digite o modelo do produto: ");
                _modelo=sc.next();
                for(Produto p: c1.produtos){
                    if(Objects.equals(p.getModelo(), _modelo)){
                        System.out.println("Removendo produto do carrinho!");
                        c1.removerProduto(p);
                        n++;
                        c1.exibirCarrinho();
                    }
                }
                if(n==0){
                    System.out.println("Produto nao existe");
                }
                cliente();
                break;
            case 4:
                Cliente cl=new Cliente();
                Gerente g=new Gerente();
                Funcionario f=new Funcionario();
                System.out.println("Vamos pegar os dados do cliente!");
                System.out.println("Digite o nome: ");
                cl.setNome(sc.next());
                System.out.println("Digite o genero: ");
                cl.setGenero(sc.next());
                System.out.println("Digite o cpf: ");
                cl.setCpf(sc.next());
                System.out.println("Digite o cep: ");
                cl.setCep(sc.next());
                System.out.println("Digite o numero da casa: ");
                cl.setNumeroCasa(sc.nextInt());
                System.out.println();
                System.out.println("O seu vendendor é: G-gerente F-funcionario");
                if(Objects.equals("G", sc.next())){
                    System.out.println("Vamos pegar os dados do gerente!");
                    System.out.println("Digite o nome: ");
                    g.setNome(sc.next());
                    System.out.println("Digite o genero: ");
                    g.setGenero(sc.next());
                    g.setCpf("14381307401");
                    g.setCargo("Gerente");
                    int fp=g.efetuaVenda(c1);
                    if(fp==0){
                        CartaoCredito cc=new CartaoCredito();
                        g.gerarRecibo(c1, cc, g, cl);
                    }
                    else if(fp==1){
                        Pix px=new Pix();
                        g.gerarRecibo(c1, px, g, cl);
                    }
                    else{
                        Dinheiro di=new Dinheiro();
                        g.gerarRecibo(c1, di, g, cl);
                    }
                }
                if(Objects.equals("F", sc.next())){
                    System.out.println("Vamos pegar os dados do funcionario!");
                    System.out.println("Digite o nome: ");
                    f.setNome(sc.next());
                    System.out.println("Digite o genero: ");
                    f.setGenero(sc.next());
                    System.out.println("Digite o cpf: ");
                    f.setCpf(sc.next());
                    f.setCargo("Funcionario");
                    int fp=f.efetuaVenda(c1);
                    if(fp==0){
                        CartaoCredito cc=new CartaoCredito();
                        f.gerarRecibo(c1, cc, g, cl);
                    }
                    else if(fp==1){
                        Pix px=new Pix();
                        f.gerarRecibo(c1, px, g, cl);
                    }
                    else{
                        Dinheiro di=new Dinheiro();
                        f.gerarRecibo(c1, di, g, cl);
                    }
                }
                cliente();
                break;
            case 5:
                menu();
                break;
            default:
                System.out.println("Comando inválido.");
                cliente();
        }
    }

    private static void gerente() {
        Scanner sc = new Scanner(System.in);
        Gerente g1=new Gerente();
        System.out.println("=============GERENTE==============");
        System.out.println("1- Adicionar novo produto.");
        System.out.println("2- Remover um produto.");
        System.out.println("3- Editar produto");
        System.out.println("4- Voltar ao menu.");
        System.out.println("==================================");
        int escolha = sc.nextInt();
        switch (escolha) {
            case 1:
                g1.adicionaPEstoque();
                gerente();
                break;
            case 2:
                g1.removePEstoque();
                gerente();
                break;
            case 3:
                g1.editaPEstoque();
                gerente();
                break;
            case 4:
                menu();
                break;
            default:
                System.out.println("Comando inválido.");
                gerente();
                break;
        }
    }
}
