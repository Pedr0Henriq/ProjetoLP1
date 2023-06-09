import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private List<Produto> produtos;

    public CarrinhoDeCompras() {
        produtos = new ArrayList<>();
    }

    public void adicionarProduto(Produto produto, int quantidade) {
        if(quantidade<=produto.getEstoque()){
            for(int i=0; i < quantidade;i++){
                produtos.add(produto);
            }
        }
        else
            System.out.println("Não há essa quantidade desse produto, o estoque desse produto é " + produto.getEstoque());
        
    }

    public void removerProduto(Produto produto) {
        produtos.remove(produto);
    }

    public double calcularTotal() {
        double total = 0.0;
        for (Produto produto : produtos) {
            total += produto.getPreco();
        }
        return total;
    }

    public void efetuarCompra() {
        
        for (Produto produto : produtos) {
            int estoqueAtual = produto.getEstoque();
            produto.setEstoque(estoqueAtual - 1);
            
        }
        System.out.println("Compra efetuada com sucesso!");
        produtos.clear();
    }

    public void exibirCarrinho() {
        System.out.println("Carrinho de Compras:");
        for (Produto produto : produtos) {
            System.out.println(produto.getModelo() + " - R$" + produto.getPreco());
        }
        System.out.println("Total: R$" + calcularTotal());
    }
}
