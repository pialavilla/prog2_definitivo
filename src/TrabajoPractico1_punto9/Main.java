package TrabajoPractico1_punto9;

public class Main {
    public static void main(String[] args) {
        // Create instances of different geometric figures
        Circle circle = new Circle(5);
        Rectangle rectangle = new Rectangle(4, 6);

        // Show areas and perimeters
        System.out.println("Circle:");
        System.out.println("Area: " + circle.calculateArea());
        System.out.println("Perimeter: " + circle.calculatePerimeter());

        System.out.println();

        System.out.println("Rectangle:");
        System.out.println("Area: " + rectangle.calculateArea());
        System.out.println("Perimeter: " + rectangle.calculatePerimeter());
    }
}
