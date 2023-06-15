import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class Carrinho {
    List<Produto> produtos;

    public Carrinho() {
        produtos = new ArrayList<>();
    }

    public void adicionarProduto(Produto produto) {
    if(produto.getEstoque()>0){
      produtos.add(produto);
        produto.setEstoque(produto.getEstoque()-1);}
    else{
        System.out.println("Nao temos estoque do produto!");
    }
    }

    public void removerProduto(Produto produto) {
        int k=0;
        String _modelo;
        _modelo=produto.getModelo();
        Iterator<Produto> iterator2 = produtos.iterator();
        while (iterator2.hasNext()) {
            Produto pr = iterator2.next();
            if (_modelo.equals(pr.getModelo())) {
                iterator2.remove();  
                System.out.println("Produto removido do carrinho!");
                k++;
            }}
        if(k==0){
            System.out.println("Produto nao esta no carrinho!");}
        else{
            produto.setEstoque(produto.getEstoque()+1);
        }
        }

    public double calcularTotal() {
        double total = 0.0;
        for (Produto produto : produtos) {
            total += produto.getPreco();
        }
        return total;
    }

    public void efetuarCompra() {
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
