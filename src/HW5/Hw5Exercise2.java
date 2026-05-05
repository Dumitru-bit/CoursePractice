package HW5;
import java.util.Scanner;
/*
2. Sum of digits
Write a program that reads a positive integer from the user and calculates the sum of its digits.
Example:
Enter a positive integer: 12345
Sum of digits: 15

*/

public class Hw5Exercise2 {
    public static void exercise2 () {
        Scanner inputFromUser = new Scanner(System.in);
        System.out.println("Enter a positive integer: ");
        String integerFromUser = inputFromUser.nextLine();
        int sumOfDigits = 0;

        for (int i = 0 ; i <= integerFromUser.length() - 1 ; i++){
            sumOfDigits += Character.getNumericValue(integerFromUser.charAt(i));

        }
        System.out.println("Sum of digits: " + sumOfDigits);
    }

}

