package task2;

public class TextCounter {

    private int characterCount = 0;
    private int lineCount = 0;

    public boolean textAnalyzer(String text) {
        if (text.equalsIgnoreCase("stop")) {
            return false;
        }
        else {
            characterCount += text.length();
            lineCount++;
            return true;
        }
    }

    public void printResults() {
        System.out.println("Antalet tecken: " + characterCount);
        System.out.println("Antalet rader: " + lineCount);
    }
}
