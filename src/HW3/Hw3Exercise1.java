package HW3;
import java.util.Scanner;
/*
1.	Read from keyboard a number, and check if it is odd or even.
 */
public class Hw3Exercise1 {
    public static void exercise1 () {
        Scanner inputFromUser = new Scanner(System.in);

        //number from user
        System.out.println("Please a number:");
        int n = inputFromUser.nextInt();
        if (n == 0) System.out.println("The number is zero");
        else if(n%2 == 0)
            System.out.println("The number is even");
        else
            System.out.println("The number is odd");


    }

}
