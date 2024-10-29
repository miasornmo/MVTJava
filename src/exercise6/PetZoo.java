package exercise6;

public class PetZoo {

    public static void main(String[] args) {

        Pet dog = new Pet("Sluggo");
        Pet cat = new Pet("Trasan");
        Pet rabbit = new Pet("Benjamin");

        /*dog.printName();
        cat.printName();
        rabbit.printName();*/

        String dogName = dog.getName();
        String catName = cat.getName();
        String rabbitName = rabbit.getName();

        for (int i = 0; i < 2; i++) {
            System.out.println(dogName + " " + catName + " " + rabbitName);
        }

    }
}
