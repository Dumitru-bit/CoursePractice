package HW5;
import java.util.Scanner;
/*
4. Password validation system
Create a program that allows the user to enter a password up to 3 times.
•	If the password is correct -> display: Authentication successful
•	If the password is incorrect 3 times -> display: Access blocked

*/

public class Hw5Exercise4 {
    public static void exercise4 () {
        Scanner inputFromUser = new Scanner(System.in);
        System.out.println("Please enter the password: ");
        String pass = inputFromUser.nextLine();
        String verify = "";
        boolean accessGranted = false;
        int i = 3;

        do {
            System.out.println("Please enter the password again: ");
            verify = inputFromUser.nextLine();
            if (verify.equals(pass)){
                System.out.println("Authentication successful");
                accessGranted = true;
                break;
            } else {
                --i;
                System.out.println("Wrong password, try again. Tries left: " + i);

            }
        } while (i > 0);

        if (!accessGranted) System.out.println("Access blocked");
    }

}

