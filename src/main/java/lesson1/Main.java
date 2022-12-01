package lesson1;

public class Main {
    public static void main(String[] args) {

        /*Cat cat1 = new Cat("Kitty", "Grey", 2);
        System.out.println(cat1);

        Cat cat2 = new Cat("Ton", "Black", 1);

        Cat cat3 = new Cat("Lucky", "White", 3);

        cat1.setAge(-3);
        System.out.println(cat1.getAge());

        Wolf wolf = new Wolf("Trevor", "Grey", 5);

        Animal cat4 = new Cat("Morris", "Red", 4);

        if (cat4 instanceof Wolf) {
            Wolf wolf2 = (Wolf) cat4;
        }

        cat4.voice();*/

        Player player1 = new Player("Ben", 20);
        Player player2 = new Player("John", 10);
        Player player3 = new Player("Mike", 15);
        Player player4 = new Player("Tod", 5);

        Course c = new Course(100);

        Team team = new Team("Star");

        player1.swim(c);
        player2.swim(c);
        player3.swim(c);
        player4.swim(c);


    }
}
