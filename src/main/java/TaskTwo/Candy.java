package TaskTwo;

public class Candy extends AbstractSweet {
    private String taste;

    public Candy() {
    }

    public Candy(String name, double weight, double price, String taste) {
        super(name, weight, price);
        this.taste = taste;
    }

    @Override
    public String toString() {
        return super.toString() + ", taste='" + taste + "'";
    }
}
