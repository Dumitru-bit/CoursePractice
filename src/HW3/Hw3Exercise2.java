package HW3;
import java.util.Scanner;

/*
2.	Write a Java program that prompts the user to enter the width and the length for a rectangle,
    then to enter the width and the length for a second rectangle,
    and finally it displays a message stating which rectangle (the first or the second) has greater area.
    (Note: there are three cases)
 */
public class Hw3Exercise2 {
    public static void exercise2 () {
        Scanner inputFromUser = new Scanner(System.in);

        //Rectangle 1 width and length
        System.out.println("Please enter the width of rectangle 1:");
        int w1 = inputFromUser.nextInt();
        System.out.println("Please enter the length of rectangle 1:");
        int l1 = inputFromUser.nextInt();

        //Rectangle 2 width and length
        System.out.println("Please enter the width of rectangle 2:");
        int w2 = inputFromUser.nextInt();
        System.out.println("Please enter the length of rectangle 2:");
        int l2 = inputFromUser.nextInt();

        //Calculate the areas
        int s1 = w1 * l1;
        int s2 = w2 * l2;

        //print the comparison
        if (s1 == s2) System.out.println("Area of rectangle 1 = Area of rectangle 2 (" + s1 + ")");
        else if (s1 > s2) System.out.println("Area of rectangle 1 (" + s1 + ")" +" > Area of rectangle 2 (" + s2 + ")");
        else System.out.println("Area of rectangle 1 (" + s1 + ")" +" < Area of rectangle 2 (" + s2 + ")");

    }

}
