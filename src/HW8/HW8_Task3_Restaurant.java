package HW8;

import java.util.Scanner;

/*
Task 3: Restaurant System
Description
Write a program that manages a restaurant menu where customers can order different products.
Requirements
1.	Define functionality for:
•	Displaying the menu.
•	Taking the customer order (reading the selected product and quantity).
•	Calculating the total order price.
•	Displaying the final receipt with the total amount.

 */
public class HW8_Task3_Restaurant {
    private String dish = "";
    private int price = 0;
    static int quantity = 0;

    HW8_Task3_Restaurant(String food, int price){
        this.dish = food;
        this.price = price;
    }
    int getTotalPrice(){
        return this.price * quantity;
    }

    public static void main(String[] args) {

        Scanner inputFromUser = new Scanner(System.in);

        HW8_Task3_Restaurant dish1 = new HW8_Task3_Restaurant("Bors",10);
        HW8_Task3_Restaurant dish2 = new HW8_Task3_Restaurant("Salata" , 5);
        HW8_Task3_Restaurant dish3 = new HW8_Task3_Restaurant( "Goroh cu cotlete", 15);

        System.out.println("Below you can find the menu for today: (choose the corresponding number)");
        System.out.println("1: Bors");
        System.out.println("2: Salata");
        System.out.println("3 Goroh cu cotlete");

        boolean input1Approved = false;
        boolean input2Approved = false;
        int choice = 0;
        int quantity = 0;

        do {

            choice = inputFromUser.nextInt();

            if (choice == 1 || choice == 2 || choice == 3) input1Approved = true;
            else System.out.println("Wrong input, try again");

        }while (!input1Approved);

        do {
            System.out.println("Please enter the quantity:");
             quantity= inputFromUser.nextInt();
            if (quantity > 0) input2Approved = true;
            else System.out.println("Quantity should be > 0");
        }while (!input2Approved);

        HW8_Task3_Restaurant.quantity = quantity;

        System.out.println("Your order is:");

        switch (choice) {
            case 1 -> {
                System.out.println("Dish: " + dish1.dish);
                System.out.println("Price: " + dish1.price);
                System.out.println("Quantity: " + HW8_Task3_Restaurant.quantity);
                System.out.println("Total price: " + dish1.getTotalPrice());

            }
            case 2 -> {
                System.out.println("Dish: " + dish2.dish);
                System.out.println("Price: " + dish2.price);
                System.out.println("Quantity: " + HW8_Task3_Restaurant.quantity);
                System.out.println("Total price: " + dish2.getTotalPrice());

            }
            case 3 -> {
                System.out.println("Dish: " + dish3.dish);
                System.out.println("Price: " + dish3.price);
                System.out.println("Quantity: " + HW8_Task3_Restaurant.quantity);
                System.out.println("Total price: " + dish3.getTotalPrice());
            }
        }

    }
}
