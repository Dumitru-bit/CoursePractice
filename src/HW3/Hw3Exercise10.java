package HW3;
import java.util.Scanner;

/*
10.	Define a password variable as a String.
•	If the password length is less than 6 characters, print "Weak password"
•	If it's between 6 and 12, print "Moderate password"
•	If it's 12 or more, print "Strong password"

*/

public class Hw3Exercise10 {
    public static void exercise10 () {
        Scanner inputFromUser = new Scanner(System.in);

        //read the data from user
        System.out.println("Please enter the password: ");
        String pass = inputFromUser.nextLine();

        if (pass.length() < 6) System.out.println("Weak password");
        else if (pass.length() >= 6 && pass.length() < 12 ) System.out.println("Moderate password");
        else if (pass.length() >= 12) System.out.println("Strong password");

        inputFromUser.close();
    }

}
