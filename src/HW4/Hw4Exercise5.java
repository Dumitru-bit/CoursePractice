package HW4;

import java.util.Scanner;
/*
5.	Rewrite the given code to use ternary if instead of switch

public class TernaryOperatorDemo5{
  public static void main(String[] args) {
        int colorCode = 101;
        String color = null;
        switch(colorCode) {
          case 100 :
            color = "Yellow";
            break;
          case 101 :
            color = "Green";
            break;
          case 102 :
            color = "Red";
            break;
           default :
            color = "Invalid";
        }
       System.out.println("Color --- "+color);
  }
}
 */

public class Hw4Exercise5 {
    public static void exercise5() {

        int colorCode = 101;

        String color = (colorCode == 100)?
                            "Yellow":
                            (colorCode == 101)?
                                    "Green":
                                    (colorCode == 102)?
                                        "Red":
                                        "Invalid";

        System.out.println("Color --- " + color);
    }
}
