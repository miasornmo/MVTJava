package exercise2;

public class ifStatements {

    public static void main(String[] args) {
        int number1 = 3;
        int number2 = 1;

        if(number1 > number2) {
            System.out.println("Första talet är störst!");
        }
        else if (number1 == number2) {
            System.out.println("Båda talen är lika stora!");
        }
        else {
            System.out.println("Andra talet är störst!");
        }

        int tal1 = 25;
        int tal2 = 5;

        if (tal1 % tal2 == 0) {
            System.out.println("Jämnt delbart!");
        }
        else {
            System.out.println("Inte jämnt delbart!");
        }

    }
}
