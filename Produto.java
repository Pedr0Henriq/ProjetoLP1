import java.util.ArrayList;
import java.util.List;

public class Produto {
    private String modelo;
    private String cor;
    private String tamanho;
    private double preco;
    private int estoque;
    List<Produto> pr0dutos=new ArrayList<>();;
    public Produto(String modelo, String cor, String tamanho, double preco, int estoque) {
        this.modelo = modelo;
        this.cor = cor;
        this.tamanho = tamanho;
        this.preco = preco;
        this.estoque = estoque;
    }

    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }
    public String getTamanho() {
        return tamanho;
    }
    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }
    public double getPreco() {
        return preco;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }
    public int getEstoque() {
        return estoque;
    }
    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }

    public void exibirInformacoes() {
        System.out.println("Produtos disponiveis: ");
        for(Produto produto:pr0dutos){
        System.out.println();
        System.out.println("Modelo: " + produto.getModelo());
        System.out.println("Cor: " + produto.getCor());
        System.out.println("Tamanho: " + produto.getTamanho());
        System.out.println("Preço: " + produto.getPreco());
        System.out.println("Estoque: " + produto.getEstoque());
        System.out.println();}
    }
}
