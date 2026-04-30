package HW3;
import java.util.Scanner;

/*
9.	Define variables for age and isStudent (true or false).
    If the person is a student OR under 18, they get a "20% discount".
    Otherwise, no discount.

*/

public class Hw3Exercise9 {
    public static void exercise9 () {
        Scanner inputFromUser = new Scanner(System.in);
        boolean isStudent = false;

        //read the data from user
        System.out.println("Please enter your age: ");
        int age = inputFromUser.nextInt();
        inputFromUser.nextLine();

        System.out.println("Are you a student or not? (Y/N)");
        String response = inputFromUser.nextLine();

        if(response.equals("Y")) isStudent = true;

        if (isStudent || age < 18 ) System.out.println("You got a 20% discount!");
        else System.out.println("Sorry no discount for you");

        inputFromUser.close();
    }

}
