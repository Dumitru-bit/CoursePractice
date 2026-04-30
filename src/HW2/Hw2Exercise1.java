package HW2;

import java.util.Scanner;

// Exercise 1: Personal Information Program
/*
Write a Java program that asks the user to enter:
   - name
   - age
   - city
Then print the result in this format:
Hello John!
You are 24 years old.
You live in Chisinau.
Concepts practiced: Scanner, String, int, String concatenation.

 */
public class Hw2Exercise1 {
    public static void exercise1 () {
        Scanner inputFromUser = new Scanner(System.in);

        //name from user
        System.out.println("Please enter your name:");
        String name = inputFromUser.nextLine();

        //age from user
        System.out.println("Please enter your age:");
        int age = inputFromUser.nextInt();
        inputFromUser.nextLine();

        //city from user
        System.out.println("Please enter your city:");
        String city = inputFromUser.nextLine();

        //print to user
        System.out.println("Hello " + name + "!");
        System.out.println("You are " + age + " years old.");
        System.out.println("You live in " + city);

        inputFromUser.close();
    }
}
