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
        int M = 0;
        int N = 0;
        int initialArray [][];
        int transposeArray [][];

        Scanner inputFromUser = new Scanner(System.in);
        do {
            System.out.println("Enter the size of the MxN matrix: ");
            M = inputFromUser.nextInt();
            inputFromUser.nextLine();
            if (M <= 0) System.out.println("Wrong input: M > 0");
        }while (M <= 0);

        do {
            System.out.println("Enter N of a MxN matrix: ");
            N = inputFromUser.nextInt();
            inputFromUser.nextLine();
            if (N <= 0) System.out.println("Wrong input: N >= 0");
        }while (N <= 0);

        initialArray = new int [M][N];
        transposeArray = new int [N][M];

        for(int i = 0 ; i < M ; i++){
            for (int j = 0; j < N ; j++){
                System.out.println("Please enter the element with coordinates M: " + i + " and N: " + j);
                transposeArray[j][i] = inputFromUser.nextInt();
            }
        }
        System.out.println("Transposed Matrix is:");

        for(int i = 0 ; i < N ; i++){
            for (int j = 0; j < M ; j++) {
                System.out.print(transposeArray[i][j] + " ");
            }
            System.out.println();
        }

    }
}
