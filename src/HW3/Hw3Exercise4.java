package HW3;

import java.util.Scanner;

/*
4.	Define a temperature variable (in Celsius). Use an if statement to print:
•	"Wear a jacket!" if the temperature is below 10°C.
•	"It's a nice day!" if it's between 10°C and 25°C.
•	"It's very hot, stay hydrated!" if it's above 25°C.
*/

public class Hw3Exercise4 {
    public static void exercise4 () {
        Scanner inputFromUser = new Scanner(System.in);

        //read the temperature from the user
        System.out.println("Please enter the temperature:");
        double t = inputFromUser.nextDouble();

        //print the message
        if (t < 10) System.out.println("Wear a jacket!");
        else if (t >= 10 && t <= 25) System.out.println("It's a nice day!");
        else if (t > 25) System.out.println("It's very hot, stay hydrated!");

        inputFromUser.close();
    }

}
