package HW5;
import java.util.Scanner;
/*
1. Reverse a number
Write a program that prompts the user to enter a positive integer and prints its reverse.
Example:
Enter a positive integer: 12345
The reverse is: 54321
*/

public class Hw5Exercise1 {
    public static void exercise1 () {
        Scanner inputFromUser = new Scanner(System.in);
        System.out.println("Enter a positive integer: ");
        String integerFromUser = inputFromUser.nextLine();


        for (int i = integerFromUser.length() - 1 ; i >= 0 ; i--){
            char c = integerFromUser.charAt(i);
            System.out.print(c);
        }
    }

}

