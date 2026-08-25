package day6;

import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- Advanced Java Calculator ---");
        System.out.println("Available operations:");
        System.out.println("Basic: +, -, *, /");
        System.out.println("Advanced: ^ (power), sqrt (square root), sin, cos, tan");
        System.out.println("---------------------------------");

        System.out.print("Enter operation type (basic / advanced): ");
        String type = scanner.next().toLowerCase();

        if (type.equals("basic")) {
            System.out.print("Enter first number: ");
            double num1 = scanner.nextDouble();
            System.out.print("Enter operator (+, -, *, /): ");
            char op = scanner.next().charAt(0);
            System.out.print("Enter second number: ");
            double num2 = scanner.nextDouble();

            switch (op) {
                case '+': System.out.println("Result: " + (num1 + num2)); break;
                case '-': System.out.println("Result: " + (num1 - num2)); break;
                case '*': System.out.println("Result: " + (num1 * num2)); break;
                case '/':
                    if (num2 != 0) System.out.println("Result: " + (num1 / num2));
                    else System.out.println("Error: Division by zero!");
                    break;
                default: System.out.println("Invalid operator!");
            }

        } else if (type.equals("advanced")) {
            System.out.print("Enter function (^, sqrt, sin, cos, tan): ");
            String func = scanner.next().toLowerCase();

            switch (func) {
                case "^":
                    System.out.print("Enter base number: ");
                    double base = scanner.nextDouble();
                    System.out.print("Enter exponent: ");
                    double exp = scanner.nextDouble();
                    System.out.println("Result: " + Math.pow(base, exp));
                    break;
                case "sqrt":
                    System.out.print("Enter number: ");
                    double num = scanner.nextDouble();
                    if (num >= 0) System.out.println("Result: " + Math.sqrt(num));
                    else System.out.println("Error: Cannot calculate square root of a negative number!");
                    break;
                case "sin":
                    System.out.print("Enter angle in degrees: ");
                    double sinDeg = scanner.nextDouble();
                    System.out.println("Result: " + Math.sin(Math.toRadians(sinDeg)));
                    break;
                case "cos":
                    System.out.print("Enter angle in degrees: ");
                    double cosDeg = scanner.nextDouble();
                    System.out.println("Result: " + Math.cos(Math.toRadians(cosDeg)));
                    break;
                case "tan":
                    System.out.print("Enter angle in degrees: ");
                    double tanDeg = scanner.nextDouble();
                    System.out.println("Result: " + Math.tan(Math.toRadians(tanDeg)));
                    break;
                default:
                    System.out.println("Invalid advanced function!");
            }
        } else {
            System.out.println("Invalid choice!");
        }

        scanner.close();
    }
}
