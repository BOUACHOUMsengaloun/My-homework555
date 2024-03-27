package Pizza_QB;

public class Pizza {
    private double price;
    private IShape shape;

    public Pizza(double price, IShape shape) {
        this.price = price;
        this.shape = shape;
    }

    public double getPrice() {
        return price;
    }

    public IShape getShape() {
        return shape;
    }

    public double getArea() {
        return shape.getArea();
    }

    @Override
    public String toString() {
        return "Pizza{" + "price=" + price + ", shape=" + shape + '}';
    }
}
