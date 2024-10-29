package task;

public class TextCounter {

    private int characterCount = 0; // Variabel för att lagra antalet tecken användaren matat in
    private int lineCount = 0; // Variabel för att lagra antal rader

    public boolean textAnalyzer(String text) { // Metod som avgör om användaren skrivit ordet stop eller inte. Tar in texten som en String och returnerar en boolean (true eller false)
        if (text.equalsIgnoreCase("stop")) { // Kontrollerar om parametern text innehåller ordet 'stop' oavsett om det är skrivet med små eller stora bokstäver
            return false; // Om texten innehåller ordet 'stop' returneras 'false' vilket avbryter while-loopen i TextReader-klassen
        }
        else { // Om texten inte innehåller ordet 'stop'
            characterCount += text.length(); // Lägger till längden på den inmatade texten till variabeln characterCount
            lineCount++; // Ökar antalet rader med 1
            return true; // Returnerar true för att hålla while-loopen igång i TextReader-klassen
        }
    }

    public void printResults() { // Metod som ansvarar för att skriva ut resultaten
        System.out.println("Antalet tecken: " + characterCount); // Skriver ut antalet tecken användaren skrivit
        System.out.println("Antalet rader: " + lineCount); // Skriver ut antalet rader användaren matat in
    }
}
