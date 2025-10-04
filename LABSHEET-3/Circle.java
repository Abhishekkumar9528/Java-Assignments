public class Circle {
    double radius;

    // Constructor
    Circle(double radius) {
        this.radius = radius;
    }

    // Method to calculate area
    double area() {
        return Math.PI * radius * radius;
    }

    // Method to calculate circumference
    double circumference() {
        return 2 * Math.PI * radius;
    }

    public static void main(String[] args) {
        Circle circle = new Circle(7.0);
        System.out.println("Area: " + circle.area());
        System.out.println("Circumference: " + circle.circumference());
    }
    
}
