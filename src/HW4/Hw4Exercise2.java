package HW4;
import java.util.Scanner;
/*
2.	Determinarea statutului unei persoane în funcție de vârstă și stare civilă
    Descriere: Scrie un program care citește vârsta unei persoane și starea civilă (căsătorit, necăsătorit) și
    folosește un operator ternar imbricat pentru a decide dacă persoana este eligibilă pentru anumite reduceri:
•	Dacă persoana are sub 18 ani și este necăsătorită, nu este eligibilă pentru reduceri.
•	Dacă persoana are sub 18 ani și este căsătorită, poate beneficia de reduceri.
•	Dacă persoana este adultă (peste 18 ani) și este necăsătorită, nu este eligibilă pentru reduceri.
•	Dacă persoana este adultă și este căsătorită, beneficiază de reduceri.

comentariu: daca persoana este casatorita, virsta nu are importanta - oricum va avea reducere
 */

public class Hw4Exercise2 {
    public static void exercise2 (){
        Scanner inputFromUser = new Scanner(System.in);
        System.out.println("Introduceti virsta: ");
        int age = inputFromUser.nextInt();
        inputFromUser.nextLine();
        System.out.println("Introduceti starea civila: (C:casatorit / N:necasatorit)");
        String status = inputFromUser.nextLine();

        Boolean discount = (age < 18 && status.equals("N"))?
                            false:
                                (age < 18 && status.equals("C"))?
                                    true:
                                        (age >= 18 && status.equals("N"))?
                                            false:
                                                true;

        if (discount) System.out.println("Felicitari! puteti beneficia de reduceri");
        else System.out.println("Ne pare rau! Nu puteti beneficia de reduceri");

        inputFromUser.close();

    }
}
