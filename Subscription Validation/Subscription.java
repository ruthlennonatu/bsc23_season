/*
   Author: Rommel Tuliao
   Date: 24/10/2023
   function:
   checks if subscription data is valid

*/

public class Subscription {

   //declare variables
   private int subscriptionId;
   private String name;
   private int price;

   public Subscription(int subscriptionId, String name, int price) {
      validateSubscriptionId(subscriptionId);
      validateName(name);
      validatePrice(price);
   
      this.subscriptionId = subscriptionId;
      this.name = name;
      this.price = price;
   }
   
   //validate input and if invalid display error message
   private void validateSubscriptionId(int subscriptionId) {
      if (subscriptionId <= 0) {
         throw new IllegalArgumentException("Subscription ID must be a positive integer.");
      }
   }

   private void validateName(String name) {
      if (name == null || name.trim().isEmpty()) {
         throw new IllegalArgumentException("Name cannot be empty or null.");
      }
   }

   private void validatePrice(int price) {
      if (price < 0) {
         throw new IllegalArgumentException("Price must be a non-negative integer.");
      }
   }

    //Still have to add method where it saves subscription data to DB
}
