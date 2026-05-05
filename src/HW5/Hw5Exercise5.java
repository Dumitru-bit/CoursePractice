package HW5;
import java.util.Scanner;
/*
5. Celsius to Fahrenheit table
Write a program that prints a table of temperatures in Celsius
and their corresponding values in Fahrenheit for the interval [0, 100] with a step of 10.
Formula:
F = (C × 9 / 5) + 32

*/

public class Hw5Exercise5 {
    public static void exercise5 () {

        double tempF = 0.0;

        for (int tempC = 0 ; tempC <= 100 ; tempC += 10){
            System.out.println("Temperature in C: " + tempC + " Temperature in F: " + ((tempC * 9 / 5) + 32));
        }
    }

}

