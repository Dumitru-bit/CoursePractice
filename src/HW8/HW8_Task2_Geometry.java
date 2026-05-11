package HW8;
/*
Task 2: Area of Geometric Shapes
Description
Write a program that calculates the area of different geometric shapes.
        Requirements
1.	Define a class named Geometry that contains methods to calculate the area of:
        •	Square → receives one parameter (side length).
        •	Rectangle → receives two parameters (length and width).
        •	Circle → receives one parameter (radius) and uses π = 3.14159.
        2.	Write a program that reads the dimensions of the shapes from the user, calls the appropriate method, and displays the result.
*/

import java.util.Scanner;

public class HW8_Task2_Geometry {
    private final double area;
    final double pi = 3.14159;

    HW8_Task2_Geometry(int length){
        area = length * length;
    }

    HW8_Task2_Geometry(int length, int width){
        area = length * width;
    }

    HW8_Task2_Geometry(double radius){
        area = pi * radius * radius;
    }

    double getArea (){
        return area;
    }

    public static void main(String[] args) {
        Scanner inputFromUser = new Scanner(System.in);
        System.out.println("What geometry you want to calculate the area for?");
        System.out.println("1: Square");
        System.out.println("2: Rectangle");
        System.out.println("3: Circle");
        int choice = inputFromUser.nextInt();

        switch (choice){
            case 1 -> {
                System.out.println("Enter the side length:");
                int length = inputFromUser.nextInt();
                HW8_Task2_Geometry HW8Task2Geometry = new HW8_Task2_Geometry(length);
                System.out.println("Area of the square is: " + HW8Task2Geometry.getArea());
            }
            case 2 -> {
                System.out.println("Enter the length:");
                int length = inputFromUser.nextInt();
                System.out.println("Enter the width:");
                int width = inputFromUser.nextInt();

                HW8_Task2_Geometry HW8Task2Geometry = new HW8_Task2_Geometry(length,width);
                System.out.println("Area of the square is: " + HW8Task2Geometry.getArea());
            }
            case 3 -> {
                System.out.println("Enter the radius:");
                double radius = inputFromUser.nextDouble();

                HW8_Task2_Geometry HW8Task2Geometry = new HW8_Task2_Geometry(radius);
                System.out.println("Area of the circle is: " + HW8Task2Geometry.getArea());
            }
            default -> System.out.println("Wrong input! Try again");
        }
    }
}
