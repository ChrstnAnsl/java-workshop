package workshop_day_1.Exercise2;

public abstract class Equation {
    public abstract void draw();

    public void printInfo() {
        System.out.println("This is an equation.");
    }

    public abstract double getArea();

    public abstract double getPerimeter();
}
