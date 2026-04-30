package HW4;
import java.util.Scanner;
/*
3.	Determinarea sezonului în funcție de lună
    Descriere: Scrie un program care citește numărul unei luni (de la 1 la 12)
    și folosește un switch pentru a determina în ce sezon se află luna respectivă:
•	Luni: 12, 1, 2 sunt pentru Iarnă.
•	Luni: 3, 4, 5 sunt pentru Primăvară.
•	Luni: 6, 7, 8 sunt pentru Vară.
•	Luni: 9, 10, 11 sunt pentru Toamnă.
 */

public class Hw4Exercise3 {
    public static void exercise3 (){
        Scanner inputFromUser = new Scanner(System.in);
        System.out.println("Introduceti luna in forma de numar (1-12): ");
        int monthNumber = inputFromUser.nextInt();
        inputFromUser.nextLine();
/*
        switch (monthNumber){
            case 1:
            case 2:
            case 12: System.out.println("Iarna");break;
            case 3:
            case 4:
            case 5: System.out.println("Primavara");break;
            case 6:
            case 7:
            case 8: System.out.println("Vara");break;
            case 9:
            case 10:
            case 11: System.out.println("Toamna");break;
            default: System.out.println("Wrong input!");
        };
*/
        String monthLetters = switch (monthNumber){
            case 1,2,12  -> "Iarna";
            case 3,4,5   -> "Primavara";
            case 6,7,8   -> "Vara";
            case 9,10,11 -> "Toamna";
            default -> "Wrong input!";
        };

        System.out.println(monthLetters);

        inputFromUser.close();

    }
}
