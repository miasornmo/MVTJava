package task;

import java.util.Scanner;

public class TextReader {
    private TextCounter textCounter = new TextCounter(); // Skapar ett nytt objekt av klassen TextCounter
    public void readText() { // Metod som läser in text från användaren och skickar den till TextCounter

        Scanner scan = new Scanner(System.in); // Skapar scanner
        String text; // Skapar variabel för att kunna lagra den inmatade texten från användaren

        System.out.println("Skriv in din text rad för rad. Skriv ordet 'stop' för att avsluta"); // Ber användaren att börja skriva in sin text

        boolean continueTyping = true; // Skapar variabel för att kunna styra while-loopen

        while (continueTyping) { // While-loop som körs så länge continueTyping är true
            text = scan.nextLine(); // Läser in en rad text från användaren och sparar i variabeln 'text'

            continueTyping = textCounter.textAnalyzer(text); // Anropar metoden textAnalyzer och skickar den inmatade texten från användaren som argument och får antingen tillbaka true eller false vilket avgör om while-loopen ska fortsätta eller inte
        }
        textCounter.printResults(); // Anropar metoden printResults för att skriva ut resultaten
    }

    public static void main(String[] args) {
        TextReader textReader = new TextReader(); // Skapar ett TextReader-objekt
        textReader.readText(); // Anropar metoden readText för att starta inmatning av text från användaren
    }
}
