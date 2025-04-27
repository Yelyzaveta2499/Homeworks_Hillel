import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter radius for the circle: ");
        double circleRadius = scanner.nextDouble();
        Circle circle = new Circle(circleRadius);

        System.out.print("Enter base for the triangle: ");
        double triangleBase = scanner.nextDouble();
        System.out.print("Enter height for the triangle: ");
        double triangleHeight = scanner.nextDouble();
        Triangle triangle = new Triangle(triangleBase, triangleHeight);

        System.out.print("Enter side length for the square: ");
        double squareSide = scanner.nextDouble();
        Square square = new Square(squareSide);

        System.out.println("Circle area: " + circle.getArea());
        System.out.println("Triangle area: " + triangle.getArea());
        System.out.println("Square area: " + square.getArea());
    }
}