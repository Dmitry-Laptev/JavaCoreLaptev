package lesson1;

import java.util.Objects;

public class Cat extends Animal implements CanSwim {

    private boolean isWIld;
    private double swimmingSpeed;


    public void voice() {
        System.out.println("Кот мяукает");
    }

    public double swim(Course pool) {
        System.out.println("Я кот, я плыву!");
        return pool.getLength() / swimmingSpeed;
    }

    public Cat(String name, String color, int age) {
        super(name, color, age);
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + getName() + '\'' +
                ", color='" + getColor() + '\'' +
                ", age=" + getAge() +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cat cat = (Cat) o;
        return getAge() == cat.getAge() &&
                Objects.equals(getName(), cat.getName()) &&
                Objects.equals(getColor(), cat.getColor());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getAge(), getColor(), getAge());
    }

    public double getSwimmingSpeed() {
        return swimmingSpeed;
    }

    public void setSwimmingSpeed(double swimmingSpeed) {
        this.swimmingSpeed = swimmingSpeed;
    }
}