package exercise4;

public class ForLoop {

    public static void main(String[] args) {

        for (int i = 0; i < 31; i++) {
            System.out.println((i + 1) + " januari");
        }

        System.out.println();


        for (int i = 0; i < 100; i++) {
            System.out.println((i + 1));
        }


        System.out.println();

        for (int i = 0; i < 100; i += 2) {
            System.out.println(i+2);
        }

        System.out.println();

        int first = 1;

        System.out.println(first);

        int second = 1;

        for (int i = 0; i < 10; i++) {
            System.out.println(second);
            int third = first + second;
            first = second;
            second = third;
        }


    }
}
