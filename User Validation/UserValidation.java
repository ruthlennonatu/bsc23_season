/*
Author: Rommel Tuliao
Date: 24/10/2023
Function:
Fetch data from user input and create user if user input is valid.
*/

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.ArrayList;
import java.util.List;

public class UserValidation{
   public static void main(String[] args){
      Scanner scanner = new Scanner(System.in);
      //declare variable
      String firstName= null;
      String lastName = null;
      String Email = null;
      int Age = 0;
      String County = null;
      
      //List of Counties in Ireland, will help with user validation
      List<String> validCounties = new ArrayList<>();
      validCounties.add("Carlow"); validCounties.add("Cavan"); 
      validCounties.add("Cork"); validCounties.add("Donegal");
      validCounties.add("Dublin"); validCounties.add("Galway");
      validCounties.add("Kerry"); validCounties.add("Kildare");
      validCounties.add("Kilkenny"); validCounties.add("Laois");
      validCounties.add("Leitrim"); validCounties.add("Limerick");
      validCounties.add("Longford"); validCounties.add("Louth");
      validCounties.add("Mayo"); validCounties.add("Meath");
      validCounties.add("Monaghan"); validCounties.add("Offaly");
      validCounties.add("Roscommon"); validCounties.add("Sligo");
      validCounties.add("Tipperary"); validCounties.add("Waterford");
      validCounties.add("Westmeath"); validCounties.add("Wexford");
      validCounties.add("Wicklow"); validCounties.add("Clare");
      
      //Ask user for details and validate user inpu
      //if not valid display error message
      do {
         System.out.println("Enter first name: ");
         firstName = scanner.nextLine();
         if (firstName.length() < 1 || firstName.length() > 50) {
            System.out.println("Invalid input. Please enter a first name with a reasonable number of characters.");
         }
      } while (firstName.length() < 1 || firstName.length() > 50);
   
      do {
         System.out.println("Enter last name: ");
         lastName = scanner.nextLine();
         if (lastName.length() < 1 || lastName.length() > 50) {
            System.out.println("Invalid input. Please enter a last name with a reasonable number of characters.");
         }
      } while (lastName.length() < 1 || lastName.length() > 50);
   
      do {
         System.out.println("Enter Email: ");
         Email = scanner.nextLine();
         if (Email.length() < 1 || Email.length() > 50) {
            System.out.println("Invalid input. Please enter a valid email address.");
         }
      } while (!isValidEmail(Email));
   
      do {
         System.out.println("Enter Age: ");
         Age = scanner.nextInt();
         if (Age < 1 || Age > 90) {
            System.out.println("Invalid input. Please enter a valid age.");
         }
      } while (Age < 8 || Age >= 90);
   
      // Error: read next line as County and saves it as whitespace
      // Purpose: reads empty line and skips it
      scanner.nextLine();
   
      do {
         System.out.println("Enter county: ");
         County = scanner.nextLine();
         if (!validCounties.contains(County)) {
            System.out.println("Invalid input. Please enter a valid county.");
         }
      } while (!validCounties.contains(County));
      
      //display user details
      System.out.println("User Details: ");
      System.out.println("first Name: " + firstName);
      System.out.println("Last Name: " + lastName);
      System.out.println("Age: " + Age);
      System.out.println("Email: " + Email);
      System.out.println("County: " + County);
   
   
   
   
   
   
   
   }
   
   //Email validation
   public static boolean isValidEmail(String email) {
      String emailRegex = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,4}$";
      Pattern pattern = Pattern.compile(emailRegex);
      Matcher matcher = pattern.matcher(email);
      return matcher.matches();
   }
}