package inlamningsuppgift;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TextAnalyzerTest {

    @Test
    void testCharacterCount() { // Testar om antalet tecken räknas korrekt (exklusive mellanslag)
        TextAnalyzer textAnalyzer = new TextAnalyzer(); // Skapar ett TextAnalyzer-objekt
        textAnalyzer.analyzingText("Hej jag heter Maria"); // Analyserar en rad med text genom att anropa metoden textAnalyzer
        assertEquals(16,textAnalyzer.getCharacterCount()); // Verifierar att teckenräkningen är korrekt (jämför det förväntade resultatet med det faktiska resultatet från programmet)
    }

    @Test
    void testLineCount() { // Testar om antalet rader räknas korrekt
        TextAnalyzer textAnalyzer = new TextAnalyzer(); // Skapar ett TextAnalyzer-objekt
        textAnalyzer.analyzingText("Första raden"); // Analyserar första rader
        textAnalyzer.analyzingText("Andra raden"); // Analyserar andra raden
        textAnalyzer.analyzingText("Tredje raden"); // Analyserar tredje raden
        assertEquals(3, textAnalyzer.getLineCount()); // Verifierar att antalet rader räknas korrekt
    }

    @Test
    void testEmptyString() { // Testar om programmet hanterar en tom inmatning på korrekt sätt
        TextAnalyzer textAnalyzer = new TextAnalyzer(); // Skapar ett TextAnalyzer-objekt
        textAnalyzer.analyzingText(""); // Analyserar tom sträng
        assertEquals(0, textAnalyzer.getCharacterCount()); // Verifierar att antalet tecken är 0
        assertEquals(1, textAnalyzer.getLineCount()); // Verifierar att en tom sträng räknas som en rad
    }

    @Test
    void testWordCount() { // Testar om antalet ord räknas korrekt
        TextAnalyzer textAnalyzer = new TextAnalyzer(); // Skapar ett TextAnalyzer-objekt
        textAnalyzer.analyzingText("Det är soligt idag"); // Analyserar en rad med fyra ord
        assertEquals(4, textAnalyzer.getWordCount()); // Verifierar att antalet ord räknas korrekt
    }

    @Test
    void testLongestWord() { // Testar om programmet kan identifiera det längsta ordet korrekt
        TextAnalyzer textAnalyzer = new TextAnalyzer(); // Skapar ett TextAnalyzer-objekt
        textAnalyzer.analyzingText("Hej mitt vinterland"); // Analyserar en rad text
        assertEquals("vinterland", textAnalyzer.getLongestWord()); // Verifierar att "vinterland" identifieras som det längsta ordet
    }
}