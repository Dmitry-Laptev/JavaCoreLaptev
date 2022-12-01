package lesson1;

public class Wolf extends Animal implements CanSwim {

    private double swimmingSpeed;
    public Wolf(String name, String color, int age) {
        super(name, color, age);
    }

    public void voice() {
        System.out.println("Волк воет");
    }

    public double swim(Course pool) {
        System.out.println("Я волк, я плыву!");
        return pool.getLength() / swimmingSpeed;
    }

    public double getSwimmingSpeed() {
        return swimmingSpeed;
    }

    public void setSwimmingSpeed(double swimmingSpeed) {
        this.swimmingSpeed = swimmingSpeed;
    }
}