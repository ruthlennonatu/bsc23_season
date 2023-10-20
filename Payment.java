// Daniel Gallagher

// Payment.java
public class Payment {
    private double amount;
    private String currency;
    private String paymentMethod;
    
    public Payment(double amount, String currency, String paymentMethod) {
        this.amount = amount;
        this.currency = currency;
        this.paymentMethod = paymentMethod;
    }
    
    public void process() {
        // Logic to process payment using integrated payment gateway
    }
}