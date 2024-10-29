package exercise3;

public class whileLoop {

    public static void main(String[] args) {

        /*int day = 1;

        while(day <= 31) {
            System.out.println(day + " Januari");
            day++;
        } */

        int x = 1;

        while (x <= 100) {
            System.out.println(x);
            x++;
        }

        System.out.println();

        int y = 2;

        while (y <= 100) {
            System.out.println(y);
            y = y + 2;
        }

        System.out.println();

        int first = 1;
        System.out.println(first + " ");

        int second = 1;

        while (second <= 100) {
            System.out.println(second + " ");
            int third = first + second;

            first = second;
            second = third;

        }



    }
}
