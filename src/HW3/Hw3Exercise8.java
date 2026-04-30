package HW3;
import java.util.Scanner;

/*
8.	Define a variable for exam score (0-100). Print the corresponding grade:
•	90+ → "A"
•	80-89 → "B"
•	70-79 → "C"
•	60-69 → "D"
•	Below 60 → "F"

*/

public class Hw3Exercise8 {
    public static void exercise8 () {
        Scanner inputFromUser = new Scanner(System.in);

        //read the user's age
        System.out.println("Please enter exam score:");
        int score = inputFromUser.nextInt();

        //calculate the grade

        if (score >= 90) System.out.println("Your score is A");
        else if (score >= 80 && score < 90) System.out.println("Your score is B");
        else if (score >= 70 && score < 80) System.out.println("Your score is C");
        else if (score >= 60 && score < 70) System.out.println("Your score is D");
        else System.out.println("Your score is F");

        inputFromUser.close();
    }

}
