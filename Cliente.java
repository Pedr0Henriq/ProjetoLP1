import java.util.Random;

public class Cliente extends Pessoa {
    private String cep;
    private int numeroCasa;
    private int codigoCliente;

    public Cliente() {
        
        Random random = new Random();
        codigoCliente = random.nextInt(89) + 11;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public int getNumeroCasa() {
        return numeroCasa;
    }

    public void setNumeroCasa(int numeroCasa) {
        this.numeroCasa = numeroCasa;
    }

    public int getCodigoCliente() {
        return codigoCliente;
    }

    public void setCodigoCliente(int codigoCliente) {
        this.codigoCliente = codigoCliente;
    }
}
