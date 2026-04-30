package HW2;
import java.util.Scanner;

// Exercise 3: Temperature converter
/*
Write a program that asks the user to enter a temperature in Celsius.
Convert it to Fahrenheit using the formula:
F = C * 9 / 5 + 32

Example:
Enter temperature in Celsius: 20
Temperature in Fahrenheit: 68.0

 */
public class Hw2Exercise3 {
    public static void exercise3() {
        Scanner inputFromUser = new Scanner(System.in);

        //ask for the temperature in Celsius
        System.out.println("Enter the temperature in Celsius:");
        double tempC = inputFromUser.nextDouble();

        //print the temperature in Fahrenheit
        System.out.println("Temperature in Fahrenheit: " + (tempC * 9 / 5 + 32));

        inputFromUser.close();
    }
}