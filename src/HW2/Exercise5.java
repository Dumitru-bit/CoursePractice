package HW2;
import java.util.Scanner;

// Exercise 5: Age in future
/*
Write a program that:
1. asks the user for their current age
2. asks how many years in the future
3. prints the future age.

Example:
Enter your age: 24
Enter number of years: 10

In 10 years you will be 34 years old.

 */
public class Exercise5 {
    public static void exercise5() {
        Scanner inputFromUser = new Scanner(System.in);

        //ask for the current age, how many years in future
        System.out.println("Enter your age:");
        int age = inputFromUser.nextInt();

        System.out.println("Enter number of years:");
        int years = inputFromUser.nextInt();

        //print the result
        System.out.println("In " + years + " years you will be " + (age + years) + " years old.");
    }
}