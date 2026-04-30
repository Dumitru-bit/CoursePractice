package HW3;

import java.util.Scanner;

/*
6.	Based on a person's age, determine their movie ticket price:
•	Under 12 → "Ticket price: $5"
•	Between 12 and 60 → "Ticket price: $10"
•	Over 60 → "Ticket price: $7"

*/

public class Hw3Exercise6 {
    public static void exercise6 () {
        Scanner inputFromUser = new Scanner(System.in);

        //read the user's age
        System.out.println("Please enter your age:");
        int age = inputFromUser.nextInt();

        //calculate the ticket price based on the age
        int ticketPrice;
        if (age < 12) ticketPrice = 5;
        else if (age >= 12 && age <= 60) ticketPrice = 10;
        else ticketPrice = 7;

        System.out.println("Your ticket price is: " + ticketPrice + " $");

        inputFromUser.close();
    }

}
