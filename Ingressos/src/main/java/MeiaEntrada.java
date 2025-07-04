public class MeiaEntrada extends Ingresso{
    protected double valorMetade;

    //construtor
    public MeiaEntrada(double price,
                    String name,
                    boolean isDublade,
                    double valorMetade) {
        super(price, name, isDublade);
        this.valorMetade = valorMetade;
    }

    public MeiaEntrada() {
        super();
    }

    public double getValorMetade() {
        return price/2;
    }
}
