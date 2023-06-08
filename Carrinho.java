import java.util.ArrayList;
import java.util.List;

public class Carrinho {
    private List<Produto> produtos;

    public Carrinho() {
        produtos = new ArrayList<>();
    }

    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
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

    public void exibirCarrinho() {
        System.out.println("Carrinho de Compras:");
        for (Produto produto : produtos) {
            System.out.println(produto.getModelo() + " - R$" + produto.getPreco());
        }
        System.out.println("Total: R$" + calcularTotal());
    }
}
