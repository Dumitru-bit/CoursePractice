package HW4;
import java.util.Scanner;
/*
6.	Write a program that prompts the user to input a currency code (e.g., USD, EUR, GBP) and a value in USD.
    The program should convert that value into the corresponding currency.
    Assume a few conversion rates as follows:

•	USD to EUR = 0.85
•	USD to GBP = 0.75
•	USD to INR = 75.0
•	USD to AUD = 1.35
    If the user enters an unsupported currency code, print "Unsupported currency."

 */
public class Hw4Exercise6 {
    public static void exercise6 (){
        Scanner inputFromUser = new Scanner(System.in);
        System.out.println("Enter the currency: (USD/EUR/GBP/INR/AUD)");
        String currency = inputFromUser.nextLine();
        System.out.println("Enter the amount in USD: ");
        double amountUSD = inputFromUser.nextDouble();

        double coeff = switch (currency){
            case "USD" -> 1.0;
            case "EUR" -> 0.85;
            case "GBP" -> 0.75;
            case "INR" -> 75.0;
            case "AUD" -> 1.35;
            default -> 0;
        };

        if (coeff == 0) System.out.println("Unsupported currency.");
        else System.out.println("Converted amount in " + currency + " is " + amountUSD * coeff);


        inputFromUser.close();

    }
}
