package HW8;
/*
Task 1: Parking Charges
Description
A parking garage charges the following rates:
•	A minimum fee of $2.00 for the first 3 hours of parking.
•	An additional fee of $0.50 for each extra hour over 3 hours.
•	A maximum charge of $10.00 for 24 hours.
•	No car can be parked for more than 24 hours.
Requirements
1.	Write a program that reads the number of hours parked for each customer from the previous day.
2.	The program must calculate the parking fee for each customer using a method named calculateCharges().
3.	The program should display the fee for each customer and maintain a running total of all parking fees collected during the day.

 */

import java.util.Scanner;

public class HW8_Task1 {
    static double totalFees = 0.0;
    static double hoursParked = 0.0;
    static double parkingFee = 0.0;
    public static void main(String[] args) {
        Scanner inputFromUser = new Scanner(System.in);


        do {

            System.out.println("\nEnter how many hours you have been parked: ('end' to exit)");
            String input = inputFromUser.nextLine();
            boolean inputApproved = false;

            if (input.equals("end")) break;
            else{
                hoursParked = Double.parseDouble(input);
                if (hoursParked <= 0) System.out.println("Hours must be > 0");
                else inputApproved = true;
            }
            if (inputApproved){
                parkingFee = calculateCharges(hoursParked);
                totalFees += parkingFee;

                System.out.println("The cost of parking: " + parkingFee + " $");
                if (hoursParked > 24) System.out.println("The car cannot be parked for more than 24 hours, please take your car");

                System.out.println("Total fee of parking per day: " + totalFees + " $");
            }
        }while (true);
    }
    static double calculateCharges (double hoursParked){

        if (hoursParked <= 3) return 2;                                                                                 // A minimum fee of $2.00 for the first 3 hours of parking
        else if (hoursParked > 3 && (hoursParked -3) * 0.5 + 2 <= 10)  return 2 + (hoursParked - 3) * 0.5 ;             // 10$ - 2$ = 8$ by 0.5$ hour is 16 hours (total of 19 hours)
            else if (((hoursParked -3) * 0.5 + 2 > 10) && hoursParked <= 24) return 10;                                 // 19 < hours < 24
            else if (hoursParked > 24) return 10;
    return 0;
    }

}
