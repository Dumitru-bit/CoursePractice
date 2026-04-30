package HW3;
import java.util.Scanner;
import java.lang.Math;

/*
3.	Write a Java program that reads a floating-point number.
    If the number is zero it prints "zero", otherwise, print "positive" or "negative".
    Add "small" if the absolute value of the number is less than 1, or "large" if it exceeds 1,000,000.
 */
public class Hw3Exercise3 {
    public static void exercise3 () {
        Scanner inputFromUser = new Scanner(System.in);

        //read the number from the user
        System.out.println("Please enter a floating-point number:");
        double n = inputFromUser.nextDouble();

        //get the absolute value of the number
        double nAbs = Math.abs(n);

        //print the result
        if (n == 0) System.out.println("zero");
        else if (n > 0) System.out.println("positive");
        else System.out.println("negative");

        if (n != 0 && nAbs < 1.0) System.out.println("small");
        else if (n != 0 && nAbs > 1000000.0) System.out.println("large");
        inputFromUser.close();
    }
}
