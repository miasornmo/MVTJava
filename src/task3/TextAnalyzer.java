package task3;

public class TextAnalyzer {

    private int characterCount; // Attribut som håller koll på antalet tecken
    private int lineCount; // Attribut som håller koll på antalet rader
    private int wordCount; // Attribut som håller koll på antalet ord
    private String longestWord; // Attribut som håller koll på det längsta ordet

    public TextAnalyzer() { // Konstruktor, sätter startvärden
        characterCount = 0;
        lineCount = 0;
        wordCount = 0;
        longestWord = ""; // Initieras till en tom sträng istället för till null
    }

    public boolean analyzingText(String text) { // Metod som analyserar varje rad med text (räknar tecken, antal rader, antal ord och uppdaterar längsta ord samt styr while-loopen)
        if (text.equalsIgnoreCase("stop") || text.equalsIgnoreCase("stopp")) { // Kontrollerar om texten innehåller ordet "stop" eller "stopp" oavsett stora eller små bokstäver
            return false; // Om texten innehåller "stop" returneras "false" vilket avslutar loopen i main-klassen
        }
        else { // Om texten inte innehåller "stop"
            characterCount += text.replace(" ", "").length(); // Lägger till textens längd (minus mellanslag) till characterCount
            lineCount++; // Ökar antal rader med 1

            String[] wordArr = text.split(" "); // Delar upp texten i ord (vid varje mellanslag) och sparar i array

            for (int i = 0; i < wordArr.length; i++) { // Loopar igenom alla sparade ord i arrayen
                if (!wordArr[i].isEmpty()) { // Kontrollerar att ordet inte är tomt (består av bara mellanslag)
                    wordCount++; // Ökar antalet ord med 1
                    if (wordArr[i].length() > longestWord.length()) { // Kontrollerar om ordet är längre än det tidigare längsta ordet
                        longestWord = wordArr[i]; // Uppdaterar längsta ordet
                    }
                }
            }
            return true; // Returnerar true för att loopen ska fortsätta i main-klassen
        }
    }

    public int getCharacterCount() { // Metod som returnerar antalet tecken
        return characterCount;
    }

    public int getLineCount() { // Metod som returnerar antalet rader
        return lineCount;
    }

    public int getWordCount() { // Metod som returnerar antalet ord
        return wordCount;
    }

    public String getLongestWord() { // Metod som returnerar det längsta ordet
        return longestWord;
    }
}
