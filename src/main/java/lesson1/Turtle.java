package lesson1;

public class Turtle extends Animal implements CanSwim {

    double swimmingSpeed;
    public Turtle(String name, String color, int age) {
        super(name, color, age);
    }

    public void voice() {
        System.out.println("Черепаха фыркает");
    }

    @Override
    public double swim(Course pool) {
        System.out.println("Я черепаха, я плыву!");
        return pool.getLength() / swimmingSpeed;
    }

    public double getSwimmingSpeed() {
        return swimmingSpeed;
    }

    public void setSwimmingSpeed(double swimmingSpeed) {
        this.swimmingSpeed = swimmingSpeed;
    }
}