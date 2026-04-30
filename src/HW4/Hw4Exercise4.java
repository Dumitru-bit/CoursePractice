package HW4;
import java.util.Scanner;
/*
4.	Simplify the following sequence by nesting so that the effect is the same,
    but fewer comparisons are required. You may want to incorporate this code into a full program for testing purposes.
if (temperature > maxTemp)
{
 System.out.println("Porridge is too hot.");
}
if (temperature < minTemp)
{
 System.out.println("Porridge is too cold.");
}
if (temperature >= minTemp && temperature <= maxTemp)
{
 System.out.println("Porridge is just right.");
}
 */

public class Hw4Exercise4 {
    public static void exercise4 (){
        Scanner inputFromUser = new Scanner(System.in);
        System.out.println("Temperature: ");
        int temperature = inputFromUser.nextInt();
        inputFromUser.nextLine();

        int maxTemp = 100;
        int minTemp = 0;

        if (temperature < minTemp) System.out.println("Porridge is too cold.");
        else if (temperature >= minTemp && temperature <= maxTemp) System.out.println("Porridge is just right.");
        else System.out.println("Porridge is too hot.");

        inputFromUser.close();

    }
}
