package HW6;
import java.util.Scanner;

/*
4.	Sum of the main diagonal
Write a program that calculates the sum of the elements on the main diagonal of a square matrix N x N.
Example:
Input:
1 2 3
4 5 6
7 8 9
Output:
Sum of the main diagonal: 15

 */
public class Hw6Exercise4 {
    public static void exercise4 () {
        int size = 0;
        int array [][];

        Scanner inputFromUser = new Scanner(System.in);
        do {
            System.out.println("Enter the size of the square matrix: ");
            size = inputFromUser.nextInt();
            inputFromUser.nextLine();
            if (size < 1) System.out.println("Wrong input: size > 1");
        }while (size <= 0);

        array = new int [size][size];

        for(int i = 0 ; i < size ; i++){
            for (int j = 0; j < size ; j++){
                System.out.println("Please enter the element with coordinates M: " + i + " and N: " + j);
                array[i][j] = inputFromUser.nextInt();
            }
        }

        int sumDiagonal = 0;
        for(int i = 0 ; i < size ; i++){
            for (int j = 0; j < size ; j++) {
                if (i == j) sumDiagonal += array[i][j];
            }
        }
        System.out.println("Sum of main diagonal: " + sumDiagonal);

    }
}
