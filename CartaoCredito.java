import java.util.Scanner;
public class CartaoCredito {
    public int formapagamento(Carrinho c1){
        Scanner sc;
        int parcelas;
        System.out.println("Valor da Compra: R$"+c1.calcularTotal());
        if(c1.calcularTotal()<=100.0){
            System.out.println("Podemos parcelar em ate 2 vezes, digite a quantidade de parcelas que voce deseja: ");
            sc=new Scanner(System.in);
            while(sc.nextInt()>2){
            System.out.println("Numero de parcelas invalido! Digite novamente: ");  }
            parcelas=sc.nextInt();}
        else{
            if(c1.calcularTotal()>100.0 && c1.calcularTotal()<=250.0){
            System.out.println("Podemos parcelar em ate 4 vezes, digite a quantidade de parcelas que voce deseja: ");
            sc=new Scanner(System.in);
            while(sc.nextInt()>4){
                System.out.println("Numero de parcelas invalido! Digite novamente: ");
            }
            parcelas=sc.nextInt();
            }
            else{
                System.out.println("Podemos parcelar em ate 6 vezes, digite a quantidade de parcelas que voce deseja: ");
            sc=new Scanner(System.in);
            while(sc.nextInt()>6){
                System.out.println("Numero de parcelas invalido! Digite novamente: ");
            }
            parcelas=sc.nextInt();
            }
        }
        return parcelas;
    }
}
