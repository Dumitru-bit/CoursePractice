package HW6;
import java.util.Scanner;

/*
5.	Sort an array
Write a program that reads an array of integers and sorts it in ascending order.
Print the sorted array.
Example:
Input:
5 2 9 1 3
Output:
1 2 3 5 9

 */
public class Hw6Exercise5 {
    public static void exercise5 () {
        int size = 0;
        int array [];
        Scanner inputFromUser = new Scanner(System.in);

        do {
            System.out.println("Enter the size of the array: (>1)");
            size = inputFromUser.nextInt();
            inputFromUser.nextLine();
            if (size <= 1) System.out.println("Wrong size, should be minimum 2");
        }while (size <= 1);

        array = new int [size];

        for(int i = 0 ; i < size ; i++){
            System.out.println("Please enter the element with index: " + i );
                array[i] = inputFromUser.nextInt();
            }

        int index = 0;
        while (index <= size - 2){
            int current = array[index];
            int next = array[index +1];

            // if next item < current item - swap current with next and restart the index from zero
            if (next < current) {
                array[index] = next;
                array[index + 1] = current;
                index = 0;
            } else index ++;
        }

        System.out.println("Sorted array:");

        for (int item : array){
            System.out.print(item + " ");
        }

    }
}
