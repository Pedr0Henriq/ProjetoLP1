import java.util.Scanner;
import java.util.Objects;
public class Dinheiro {
    public int formapagamento(Carrinho c1){
        Scanner sc;
        System.out.println("Valor da Compra: R$"+c1.calcularTotal());
        System.out.println("Ja fez o pagamento: S-sim N-nao");
        sc=new Scanner(System.in);
        while(!Objects.equals("S", sc.next())){
            System.out.println("Ja fez o pagamento: S-sim N-nao");
        }
        return 1;

    }
}
