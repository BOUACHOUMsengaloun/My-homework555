package Pizza_QB;

public class PizzaClient {
    public void run() {
        IShape circleShape = new Circle(10);
        Pizza largePizza = new Pizza(15.99, circleShape);

        IShape rectangleShape = new Rectangle(15, 8);
        Pizza mediumPizza = new Pizza(10.99, rectangleShape);

        PizzaDeal deal = new PizzaDeal();

        System.out.println("Large pizza price: $" + largePizza.getPrice());
        System.out.println("Large pizza area: " + largePizza.getArea());
        System.out.println("Medium pizza price: $" + mediumPizza.getPrice());
        System.out.println("Medium pizza area: " + mediumPizza.getArea());

        if (deal.betterDeal(largePizza, mediumPizza)) {
            System.out.println("Large pizza is a better deal.");
        } else {
            System.out.println("Medium pizza is a better deal.");
        }
    }

    public static void main(String[] args) {
        PizzaClient client = new PizzaClient();
        client.run();
    }
}

