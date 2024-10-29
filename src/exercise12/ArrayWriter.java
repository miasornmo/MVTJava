package exercise12;

import java.util.Scanner;

public class ArrayWriter {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String[] nameList = new String[5];

        for (int i = 0; i < nameList.length; i++) {
            System.out.println("Skriv in namn nr: " + (i+1));
            nameList[i] = scan.nextLine();
        }

        System.out.println(nameList[0]);
        System.out.println(nameList[nameList.length-1]);
    }
}
