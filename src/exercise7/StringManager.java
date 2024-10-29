package exercise7;

import java.util.Scanner;

public class StringManager {

    public static void main(String[] args) {

        /*String myString = "some text";

        if (myString.equals("some text")) {
            System.out.println("Det stämmer!");

            if (myString.length() == 9) {
                System.out.println("Texten innehåller 9 tecken!");

                System.out.println(myString.charAt(3));

                System.out.println(myString.charAt(myString.length()-1)); // sista bokstaven -1 eftersom char börjar på 0
            }
        }*/

        Scanner scan = new Scanner(System.in);

        String myString = scan.nextLine();

        for (int i = 0; i < myString.length(); i++) {
            System.out.print(myString.charAt(i) + " ");
        }

        System.out.println();

        if (myString.equals("ägg")) {
            System.out.println("Ägg är knasigt");

        }


    }
}
