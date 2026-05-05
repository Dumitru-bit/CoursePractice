package HW5;
/*
6. Interactive menu
Create an interactive menu that repeats until the user selects option 5.
Menu:
1. Addition of two numbers
2. Subtraction of two numbers
3. Multiplication of two numbers
4. Division of two numbers
5. Exit
For options 1–4, prompt the user to enter two numbers and display the result of the selected operation.

*/

import java.util.Scanner;

public class Hw5Exercise6 {
    public static void exercise6 () {

        double num1 = 0.0, num2 = 0.0;
        int userChoice = 0;
        Scanner inputFromUser = new Scanner(System.in);

        do{
            System.out.println("\nPlease enter the action you want: ");
            System.out.println("1: Addition ");
            System.out.println("2: Subtraction ");
            System.out.println("3: Multiplication ");
            System.out.println("4: Division ");
            System.out.println("5: Exit ");

            userChoice = inputFromUser.nextInt();
            inputFromUser.nextLine();

            if (userChoice != 5) {
                System.out.println("Please enter number 1: ");
                num1 = inputFromUser.nextDouble();
                inputFromUser.nextLine();
                System.out.println("Please enter number 2: ");
                num2 = inputFromUser.nextDouble();
                inputFromUser.nextLine();

                switch (userChoice) {
                    case 1 -> System.out.println("\nAddition of your 2 numbers is: " + (num1 + num2));
                    case 2 -> System.out.println("Subtraction of your 2 numbers is: " + (num1 - num2));
                    case 3 -> System.out.println("Multiplication of your 2 numbers is: " + (num1 * num2));
                    case 4 -> {
                        if (num2 == 0) System.out.println("Cannot devide by 0");
                        else System.out.println("Devision of your 2 nummbers is: " + (num1 / num2));
                    }
                    default -> System.out.println("Invalid option! Try again");
                }
            } else System.out.println("Goodbye!");

        }while (userChoice != 5);
    }

}

