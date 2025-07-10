public class ContaPoupanca extends Conta{
    @Override
    public void imprimirExtrato() {
        System.out.print("\n=== Extrato Conta Poupança\n\n");
        System.out.printf("Agencia: %d\n", this.agencia);
        System.out.printf("Numero: %d\n", this.numeroConta);
        System.out.printf("Saldo: %.2f\n", this.saldo);
    }
}
