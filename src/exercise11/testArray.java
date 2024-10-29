package exercise11;

import java.util.Scanner;

public class testArray {

    public static void main(String[] args) {

        //String[] names = {"Charlie", "Ellen", "Grete", "Vilton", "Melvin"};

        //System.out.println(names[0] + " " + names[4]);

        String[] names = new String[5];

        names[0] = "Charlie";
        names[1] = "Ellen";
        names[2] = "Grete";
        names[3] = "Vilton";
        names[4] = "Melvin";

        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }

        String myString = "hej på dig";

        String[] stringArray = myString.split(" ");

        for (int i = 0; i < stringArray.length; i++) {
            System.out.println(stringArray[i]);
        }










    }

}
