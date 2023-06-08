import java.util.Scanner;
import java.util.Objects;
public class Pix {
    public int formapagamento(Carrinho c1){
        Scanner sc;
        System.out.println("Valor da Compra: R$"+c1.calcularTotal());
        System.out.println("Nossa chave pix: 34.434.152/0001-14");
        System.out.println("Ja fez a transferencia: S-sim N-nao");
        sc=new Scanner(System.in);
        while(!Objects.equals("S", sc.next())){
            System.out.println("Ja fez a transferencia: S-sim N-nao");
        }
        return 1;

    }
}
