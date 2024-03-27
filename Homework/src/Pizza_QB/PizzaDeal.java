package Pizza_QB;

public class PizzaDeal {
    public double deal(Pizza p) {
        return p.getPrice() * 0.9; // 10% discount
    }

    public boolean betterDeal(Pizza p1, Pizza p2) {
        return deal(p1) < deal(p2);
    }
}

