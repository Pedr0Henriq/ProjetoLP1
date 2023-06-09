import java.util.Scanner;
public class Loja {
    public static void main(String[] args){
    Carrinho c1=new Carrinho();
    Scanner sc=new Scanner(System.in);
    int escolha;
        System.out.println("Qual Area voce quer acessar: 0-Cliente 1-Gerente");
        escolha=sc.nextInt();
        while(escolha>=0&&escolha<2){
        switch (escolha) {
            case 0:
                System.out.println("O que voce deseja fazer: 0-Adicionar produto no carrinho  1-Remover produto no carrinho  2-Visualizar Produtos  3-Finalizar Compra");
                escolha=sc.nextInt();
                while(escolha>=0&&escolha<4){
                    switch(escolha){
                        case 0:
                            /*String _modelo;
                            System.out.println("Digite o produto: ");
                            _modelo=sc.next();
                            for()*/
                            break;
                        case 1:

                            break;
                        case 2:
                            Gerente.exibirInformacoes();
                            break;
                        case 3:
                            break;
                        default:
                        break;
                    }
                }
                break;
            case 1:
                Gerente g1= new Gerente();
                //System.out.println("Digite seu cpf: ");
                System.out.println("O que voce  deseja fazer: 0-Adicionar novo produto  1-Remover um produto  2-Editar produto");
                escolha=sc.nextInt();
                while(escolha>=0&&escolha<3){
                    switch(escolha){
                    case 0:
                        g1.adicionaPEstoque();
                        System.out.println("Lista de Produtos Atualizadas!");
                        Gerente.exibirInformacoes();
                        System.out.println("O que voce  deseja fazer: 0-Adicionar novo produto  1-Remover um produto  2-Editar produto");
                        escolha=sc.nextInt();
                        break;
                    case 1:
                        g1.removePEstoque();
                        System.out.println("Lista de Produtos Atualizadas!");
                        Gerente.exibirInformacoes();
                        System.out.println("O que voce  deseja fazer: 0-Adicionar novo produto  1-Remover um produto  2-Editar produto");
                        escolha=sc.nextInt();
                        break;
                    case 2:
                        g1.editaPEstoque();
                        System.out.println("O que voce  deseja fazer: 0-Adicionar novo produto  1-Remover um produto  2-Editar produto");
                        escolha=sc.nextInt();
                        break;
                    default:
                        break;
                }}
                break;
        
            default:
                break;}
            System.out.println("Sistema Finalizado!");
            sc.close();
        }
    }
}
