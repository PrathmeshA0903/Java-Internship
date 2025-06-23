import java.util.Scanner;

public class Calculator {

    // Method for Addition
    public static double add(double a, double b) {
        return a + b;
    }

    // Method for Subtraction
    public static double subtract(double a, double b) {
        return a - b;
    }

    // Method for Multiplication
    public static double multiply(double a, double b) {
        return a * b;
    }

    // Method for Division
    public static double divide(double a, double b) {
        if (b == 0) {
            System.out.println("Error: Division by zero is not allowed.");
            return 0;
        }
        return a / b;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continueCalc = true;

        System.out.println("===== Java Console Calculator =====");

        while (continueCalc) {
            System.out.print("\nEnter first number: ");
            double num1 = scanner.nextDouble();

            System.out.print("Enter an operator (+, -, *, /): ");
            char operator = scanner.next().charAt(0);

            System.out.print("Enter second number: ");
            double num2 = scanner.nextDouble();

            double result = 0;
            boolean validOperation = true;

            switch (operator) {
                case '+':
                    result = add(num1, num2);
                    break;
                case '-':
                    result = subtract(num1, num2);
                    break;
                case '*':
                    result = multiply(num1, num2);
                    break;
                case '/':
                    result = divide(num1, num2);
                    break;
                default:
                    System.out.println("Invalid operator!");
                    validOperation = false;
            }

            if (validOperation) {
                System.out.println("Result: " + result);
            }

            System.out.print("\nDo you want to perform another calculation? (yes/no): ");
            String response = scanner.next();
            continueCalc = response.equalsIgnoreCase("yes");
        }

        System.out.println("Calculator closed. Goodbye!");
        scanner.close();
    }
}
