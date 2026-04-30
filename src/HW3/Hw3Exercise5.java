package HW3;

import java.util.Scanner;

/*
5.	Define a variable for the total purchase amount.
    If the amount is greater than 100, apply a 10% discount; otherwise, no discount.
    Print the final price.
    ✔ Bonus: Use a ternary operator for the discount logic.
    comment: Also ask from the user the price per item
*/

public class Hw3Exercise5 {
    public static void exercise5 () {
        Scanner inputFromUser = new Scanner(System.in);

        //read the purchase amount and the price per item
        System.out.println("Please enter the amount:");
        int amount = inputFromUser.nextInt();

        System.out.println("Please enter the price per item:");
        double price = inputFromUser.nextDouble();
        double priceDisc = price - price * 0.1;

        //print the message using if else

        //if (amount > 100) System.out.println("Total price is: " + (double) amount * priceDisc + " including 10% discount");
        //else System.out.println("Total price is: " + (double) amount * price);

        //print the message using ternary operator
        double totalPrice = (amount > 100) ? ((double) amount * priceDisc) : ((double) amount * price);
        System.out.println("Total price is: " + totalPrice);
        inputFromUser.close();
    }

}
