package HW2;

// Exercise 6: Operator challenge
/*
Predict the output of the following code BEFORE running it:

int a = 10;
int b = 5;

a += b; // a=a+b deci a=15
b++;    // increment b: b=6
a = a * b;  // a = 15 * 6 = 90

System.out.println(a); // 90
System.out.println(b); // 6

Tasks:
1. Write what you think the output will be.
2. Run the program.
3. Explain why the output is correct.

 */
public class Hw2Exercise6 {
    public static void exercise6() {

        int a = 10;
        int b = 5;

        a += b;
        b++;
        a = a * b;

        //print the result
        System.out.println(a);
        System.out.println(b);
    }
}