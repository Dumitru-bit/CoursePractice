package HW2;
import java.util.Scanner;

// Exercise 4: Salary Calculator
/*
Ask the user for:
- name
- hourly rate
- hours worked

Calculate the total salary.

Example:
Enter name: John
Enter hourly rate: 10
Enter hours worked: 40

Anna's salary is: 400

 */
public class Hw2Exercise4 {
    public static void exercise4() {
        Scanner inputFromUser = new Scanner(System.in);

        //ask for the name, hourly rate and hours worked
        System.out.println("Enter name:");
        String name = inputFromUser.nextLine();

        System.out.println("Enter hourly rate:");
        int rate = inputFromUser.nextInt();

        System.out.println("Enter hours worked:");
        int hours = inputFromUser.nextInt();

        // print the salary
        System.out.println(name + "'s salary is: " + rate * hours);

        inputFromUser.close();
    }
}