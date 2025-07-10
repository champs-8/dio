import lombok.Data;

@Data
public class Conta implements IConta{
    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;

    protected int agencia;
    protected int numeroConta;
    protected double saldo = 0;

    //constructor
    public Conta(){
        this.agencia = AGENCIA_PADRAO;
        this.numeroConta = SEQUENCIAL++;
    }

    @Override
    public void sacar(double valor) {
        this.saldo -= valor;
        System.out.printf("Seu saldo é de R$%.2f", this.saldo);
    }

    @Override
    public void transferir(double valor, Conta conta) {
        this.sacar(valor);
        conta.depositar(valor);
    }

    @Override
    public void depositar(double valor) {
        this.saldo += valor;
    }

    @Override
    public void imprimirExtrato() {

    }

    public void imprimirInfosComuns() {
        System.out.printf("Agencia: %d", this.agencia);
        System.out.printf("Numero: %d", this.numeroConta);
        System.out.printf("Saldo: %.2f", this.saldo);
    }
}
