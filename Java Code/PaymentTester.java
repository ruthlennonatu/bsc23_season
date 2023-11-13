//Daniel Gallagher
//Tester for Payment.java

public class PaymentTester {
    public static void main(String[] args) {
        // Create a new Payment instance with specified amount, currency, and payment method
        Payment payment = new Payment(100.0, "USD", "Credit Card");
        
        // Call the process method to simulate payment processing
        // This method will handle validation, processing, and updating the payment status internally
        payment.process();
        
        // Since the process method internally prints out the status of the payment processing,
        // there's no need to print a separate confirmation message here.
        // In a real-world scenario, the process method could return a status or throw an exception
        // to indicate the success or failure of the payment processing,
        // which can then be handled here accordingly.
    }
}
