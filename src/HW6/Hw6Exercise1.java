package HW6;
import java.util.Scanner;
/*
1.	Find the maximum element and its position
Write a program that reads an array of integers and prints the maximum value together with its index.
If the maximum value appears more than once, print the index of its first occurrence.

 */
public class Hw6Exercise1 {
    public static void exercise1 () {
        int intArray[];


        Scanner inputFromUser = new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        int numOfElements = inputFromUser.nextInt();
        inputFromUser.nextLine();
        intArray = new int [numOfElements];

        for (int i= 0; i < intArray.length; i++){
            System.out.println("Enter the element with index: " + i);
            intArray[i] = inputFromUser.nextInt();
        };
        int maxNumber = intArray[0];
        int maxNumberIndex = 0;

        for (int i= 0; i < intArray.length; i++){
            if(intArray[i] > maxNumber) {
                maxNumber = intArray[i];
                maxNumberIndex = i;
            }
        };
        System.out.println("Max number is: " + maxNumber + " with index: " + maxNumberIndex);

    }
}
