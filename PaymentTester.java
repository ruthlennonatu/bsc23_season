//A tester class for testing Payment.java

public class PaymentTester {
    public static void main(String[] args) {
        // Create a new Payment instance
        Payment payment = new Payment(100.0, "USD", "Credit Card");
        
        // Call the process method to simulate payment processing
        payment.process();
        
        // Print confirmation message
        System.out.println("Payment processing successful!");
    }
}