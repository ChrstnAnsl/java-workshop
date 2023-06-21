package workshop_day_1.Exercise2;

public class Volume extends Equation {
    private double sideLength;

    public void setSideLength(double sideLength) {
        this.sideLength = sideLength;
    }

    public void draw() {
        System.out.println("Calculating volume with side length: " + sideLength);
    }

    public double getArea() {
        return sideLength * sideLength;
    }

    public double getPerimeter() {
        return 4 * sideLength;
    }
}