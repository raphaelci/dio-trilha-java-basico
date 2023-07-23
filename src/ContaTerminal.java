
public class ContaTerminal {

    public int numero;
    public String agencia;
    public String nomeCliente;
    private double saldo = 0.0;

    public double getSaldo(){
        return saldo;
    }

    public void setSaldo(double novoSaldo){
        this.saldo += novoSaldo;
    }

}
