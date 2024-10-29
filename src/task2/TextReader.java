package task2;

import java.util.Scanner;

public class TextReader {

    public static void main(String[] args) {
        TextReader textReader = new TextReader();
        textReader.readText();
    }

    private TextCounter textCounter = new TextCounter();

    public void readText() {
        Scanner scan = new Scanner(System.in);
        String text;

        System.out.println("Skriv in din text rad för rad. Skriv ordet 'stop' för att avsluta.");

        boolean continueTyping = true;

        while (continueTyping) {
            text = scan.nextLine();

            continueTyping = textCounter.textAnalyzer(text);
        }
        textCounter.printResults();
    }
}


