package HW6;
import java.util.Scanner;

/*
2.	Count even and odd elements
Write a program that reads an array of integers and
prints how many elements are even and how many are odd.

 */
public class Hw6Exercise2 {
    public static void exercise2 () {
        int intArray[];
        int evenArray[];
        int numOfEvenElements = 0;
        int oddArray[];
        int numOfOddElements = 0;


        Scanner inputFromUser = new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        int numOfElements = inputFromUser.nextInt();
        inputFromUser.nextLine();
        intArray = new int [numOfElements];


        for (int i= 0; i < intArray.length; i++){
            System.out.println("Enter the element with index: " + i);
            intArray[i] = inputFromUser.nextInt();
        };

        for (int i : intArray){
            if(i % 2 == 0) {
                ++numOfEvenElements;

            }else {
                ++numOfOddElements;

            }
        };
        System.out.println("Quantity of even numbers: " + numOfEvenElements);

        System.out.println("Quantity of odd numbers: " + numOfOddElements);

    }
}
