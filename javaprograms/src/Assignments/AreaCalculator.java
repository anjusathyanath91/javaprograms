package Assignments;

import java.util.Scanner;

public class AreaCalculator {

    // Method to calculate the area of a circle
    public double calculateCircleArea(double radius) {
        return Math.PI * radius * radius;
    }

    // Method to calculate the area of a rectangle
    public double calculateRectangleArea(double length, double breadth) {
        return length * breadth;
    }

    // Method to calculate the area of a square
    public double calculateSquareArea(double side) {
        return side * side;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AreaCalculator calculator = new AreaCalculator();

        System.out.println("Select the figure to calculate area:");
        System.out.println("a) Circle");
        System.out.println("b) Rectangle");
        System.out.println("c) Square");

      
        char choice = scanner.next().charAt(0);

        switch (choice) {
            case 'a':
                System.out.print("Enter the radius of the circle: ");
                double radius = scanner.nextDouble();
                double circleArea = calculator.calculateCircleArea(radius);
                System.out.println("Area of the circle: " + circleArea);
                break;

            case 'b':
                System.out.print("Enter the length of the rectangle: ");
                double length = scanner.nextDouble();
                System.out.print("Enter the breadth of the rectangle: ");
                double breadth = scanner.nextDouble();
                double rectangleArea = calculator.calculateRectangleArea(length, breadth);
                System.out.println("Area of the rectangle: " + rectangleArea);
                break;

            case 'c':
                System.out.print("Enter the side length of the square: ");
                double side = scanner.nextDouble();
                double squareArea = calculator.calculateSquareArea(side);
                System.out.println("Area of the square: " + squareArea);
                break;

            default:
                System.out.println("Invalid choice. Please select a valid option.");
                break;
        }

        
    }
}
