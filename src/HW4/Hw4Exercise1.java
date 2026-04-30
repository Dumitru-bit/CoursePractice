package HW4;
import java.util.Scanner;
/*
1.	Determinarea unei categorii de vârstă (minor, tânăr, adult, senior)
    Descriere: Scrie un program care citește vârsta unei persoane și folosește o construcție ternară imbricată pentru a determina categoria de vârstă:
•	Minor: sub 18 ani
•	Tânăr: între 18 și 29 de ani
•	Adult: între 30 și 64 de ani
•	Senior: 65 de ani sau mai mult
    Programul va folosi operatori ternari imbricați pentru a evalua și atribui categoria corectă.
    Afișează mesajul corespunzător categoriei de vârstă
 */

public class Hw4Exercise1 {
    public static void exercise1 (){
        Scanner inputFromUser = new Scanner(System.in);
        System.out.println("Introduceti virsta: ");
        int age = inputFromUser.nextInt();

        String category = (age < 18)?
                            "Minor" :
                                (age >= 18 && age < 30)?
                                    "Tanar":
                                        (age >= 30 && age < 65)?
                                            "Adult":
                                                "Senior";

        System.out.println("Sunteti in categoria: " + category);

        inputFromUser.close();

    }
}
