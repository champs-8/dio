public class Ingresso {
    protected double price;
    protected String name;
    protected boolean isDublade;

    public Ingresso(double price, String name, boolean isDublade) {
        this.price = price;
        this.name = name;
        this.isDublade = isDublade;
    }
    //constructor default
    public Ingresso() {}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isDublade() {
        return isDublade;
    }

    public void setDublade(boolean dublade) {
        isDublade = dublade;
    }
}
