public class IngressoFamilia extends Ingresso {
    protected int quantidadePessoas;
    protected double valorComDesconto;

    public IngressoFamilia(
            double price,
            String name,
            boolean isDublade,
            int quantidadePessoas,
            double valorComDesconto) {
        super(price, name, isDublade);
        this.quantidadePessoas = quantidadePessoas;
        this.valorComDesconto = valorComDesconto;
    }
    //constructor default
    public IngressoFamilia(){}

    public int getQuantidadePessoas() {
        return quantidadePessoas;
    }

    public void setQuantidadePessoas(int quantidadePessoas) {
        this.quantidadePessoas = quantidadePessoas;
    }

    public double getValorComDesconto() {
        if (getQuantidadePessoas()> 3){
            return (getPrice()*getQuantidadePessoas())*0.95;
        }
        return valorComDesconto;
    }

    public void setValorComDesconto(double valorComDesconto) {
        this.valorComDesconto = valorComDesconto;
    }
}
