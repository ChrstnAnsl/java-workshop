package workshop_day_1.Exercise2;

// Circle.java
public class Dimension extends Equation {
    private double radius;

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void draw() {
        System.out.println("Calculating a circle with radius: " + radius);
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
}
