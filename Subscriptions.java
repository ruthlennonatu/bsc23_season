//Damian Kos

public class Subscriptions {
    private int subscriptionId;
    private String name;
    private int price;

    public Subscription(int subscriptionId, String name, int price) {
        this.subscriptionId = subscriptionId;
        this.name = name;
        this.price = price;
    }

    
    public void create() {
        // Logic to store subscription data in a database
    }
}
