package lesson1;

public class Player implements CanSwim {

    private String name;
    private double swimSpeed;

    public static int result;

    public Player (String name, double swimSpeed) {
        this.name = name;
        this.swimSpeed = swimSpeed;
    }

    static void showResult(Player player1) {
        System.out.println(result);
    }

    public double swim(Course course) {
        System.out.println(this.name + " wins");
        return result = (int) (course.getLength()/swimSpeed);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSwimSpeed() {
        return swimSpeed;
    }

    public void setSwimSpeed(double swimSpeed) {
        this.swimSpeed = swimSpeed;
    }

}
