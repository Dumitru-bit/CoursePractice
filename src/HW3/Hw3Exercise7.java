package HW3;

import java.util.Scanner;

/*
7.	Define a year variable and check if it’s a leap year using an if statement:
	A year is a leap year if it's divisible by 4 but not by 100, unless it’s also divisible by 400.
	Print "Leap Year" or "Not a Leap Year".

*/

public class Hw3Exercise7 {
    public static void exercise7() {
        Scanner inputFromUser = new Scanner(System.in);

        //read the year
        System.out.println("Please enter the year:");
        int year = inputFromUser.nextInt();
        boolean isLeapYear;

        //decide whether it is a leap year or not
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) isLeapYear = true;   // divisible by 400 → leap year
                else isLeapYear =  false;                 // divisible by 100 but not 400 → not leap

            } else isLeapYear = true;                     // divisible by 4 but not 100 → leap year

        } else isLeapYear = false;                        // not divisible by 4 → not leap

        // print the decision
        if (isLeapYear) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }

        inputFromUser.close();
    }

}


