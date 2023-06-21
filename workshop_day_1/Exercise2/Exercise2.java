package workshop_day_1.Exercise2;

public class Exercise2 {

    /**
     * Create an abstract class to measure area and perimiter of
     * each dimension and volume of the space
     * 
     * @param args
     */
    public static void main(String[] args) {
        Dimension dimension = new Dimension();
        dimension.setRadius(3.5);
        dimension.draw();
        dimension.printInfo();
        System.out.println("Area: " + dimension.getArea());
        System.out.println("Perimeter: " + dimension.getPerimeter());

        Volume volume = new Volume();
        volume.setSideLength(5.0);
        volume.draw();
        volume.printInfo();
        System.out.println("Area: " + volume.getArea());
        System.out.println("Perimeter: " + volume.getPerimeter());
    }
}
