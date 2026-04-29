package HW2;

import java.util.Scanner;

// Exercise 7: Mini Profile Generator
/*
Ask the user for:
- name
- age
- favorite programming language
Print a message like: John is 24 years old and loves Java!
Extra challenge: add another sentence using String concatenation.
 */
public class Exercise7 {
    public static void exercise7() {

        Scanner inputFromUser = new Scanner(System.in);

        //ask for the name, age and favorite programming language
        System.out.println("Enter your name:");
        String name = inputFromUser.nextLine();

        System.out.println("Enter your age:");
        int age = inputFromUser.nextInt();
        inputFromUser.nextLine();

        System.out.println("Enter your favorite programming language:");
        String progLang = inputFromUser.nextLine();

        // print the result
        System.out.println(name + " is " + age + " years old and loves " + progLang + "!");
    }
}