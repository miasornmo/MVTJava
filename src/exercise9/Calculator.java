package exercise9;

public class Calculator {

    private int first;
    private int second;
    public Calculator(int first, int second) {
        this.first = first; // this.first pekar på private int first och den andra first är den i konstruktorn Calculator
        this.second = second;
    }

    public int add() {
        return first + second;
    }
}
