public class Conta {

    //attributes
    Double saldo = 0.0;
    Double chequeEspecial = 0.0;
    Double chequeEspecialused = 0.0;
    Boolean chequeEspecialAtivo = false;

    //constructor
    public Conta(Double saldo, Double chequeEspecial, Boolean chequeEspecialAtivo) {
        this.saldo = saldo;
        this.chequeEspecial = chequeEspecial;
        this.chequeEspecialAtivo = chequeEspecialAtivo;
    }
    public Conta() {
        // Default constructor
    }

    // Getters
    public Double getSaldo() {
        return saldo;
    }

    public Double getChequeEspecial() {
        return chequeEspecial;
    }

    public Boolean getChequeEspecialAtivo() {
        return chequeEspecialAtivo;
    }
    // Setters
    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public void setChequeEspecial(Double chequeEspecial) {
        this.chequeEspecial = chequeEspecial;
        
    }

    public void setChequeEspecialAtivo(Boolean chequeEspecialAtivo) {
        this.chequeEspecialAtivo = chequeEspecialAtivo;
    }
    public Double getChequeEspecialused() {
        return chequeEspecialused;
    }
    public void setChequeEspecialused(Double chequeEspecialused) {
        this.chequeEspecialused = chequeEspecialused;
    }
}
