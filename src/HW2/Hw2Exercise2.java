package HW2;

import java.util.Scanner;

// Exercise 2: Simple calculator
/*
Create a program that:
1. asks the user for two integers
2. calculates:
   - sum
   - difference
   - product
   - division
Example:
Enter first number: 10
Enter second number: 5

Sum: 15
Difference: 5
Product: 50
Division: 2

 */
public class Hw2Exercise2 {
    public static void exercise2 (){
        Scanner inputFromUser = new Scanner(System.in);

        // ask for 2 integers
        System.out.println("Enter first number:");
        int int1 = inputFromUser.nextInt();
        System.out.println("Enter second number:");
        int int2 = inputFromUser.nextInt();

        // print the sum
        System.out.println("Sum: " + (int1 + int2));

        // print the difference
        System.out.println("Difference: " + (int1 - int2));

        // print the product
        System.out.println("Product: " + (int1 * int2));

        // print the division
        System.out.println("Division: " + (int1 / int2));

        inputFromUser.close();
    }
}
