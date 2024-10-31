package inlamningsuppgift;

import java.util.Scanner;

public class TextAnalyzerMain {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        TextAnalyzer textAnalyzer = new TextAnalyzer(); // Skapar ett objekt av klassen TextAnalyzer

        System.out.println("Skriv in din text rad för rad. Skriv ordet 'stop' för att avsluta"); // Ber användaren att börja skriva in sin text

        boolean continueTyping = true; // Variabel som styr om while-loopen ska fortgå

        while (continueTyping) { // While-loop som tillåter användaren att fortsätta skriva in text tills användaren skriver ordet "stop"
            String text = scan.nextLine(); // Läser in en rad text från användaren

            continueTyping = textAnalyzer.analyzingText(text); // Anropar textAnalyzer-metoden för att analysera texten och kontrollera om loopen ska fortsätta
        }
        // Skriver ut resultatet efter att användaren avslutat loopen
        System.out.println("Antalet tecken: " + textAnalyzer.getCharacterCount()); // Anropar metod för antalet tecken och skriver ut resultatet
        System.out.println("Antalet rader: " + textAnalyzer.getLineCount()); // Anropar metod för antalet rader och skriver ut resultatet
        System.out.println("Antalet ord: " + textAnalyzer.getWordCount()); // Anropar metod för antalet ord och skriver ut resultatet
        System.out.println("Längsta ordet: " + textAnalyzer.getLongestWord()); // Anropar metod för det längsta ordet och skriver ut resultatet

        scan.close(); // Stänger scannern
    }
}
