package HW5;
/*
3. First common multiple
Write a program that finds the first positive integer greater than 100 that is divisible by both 7 and 9.

*/

public class Hw5Exercise3 {
    public static void exercise3 () {
        boolean numberFound = false;
        int i = 0;

        while (!numberFound){
            if ((i > 100) && (i % 7 == 0) && (i % 9 == 0)){
                numberFound = true;
                break;
            } else i++;
        }
        System.out.println("The first number > 100 and divisible by both 7 and 9: " + i);
    }

}

