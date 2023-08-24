import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Simple Calculator");
        System.out.println("Available Operations: +, -, *, /");
        System.out.println("Enter first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter an operator (+, -, *, /,)");
        char operator = scanner.next().charAt(0);
        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();
        double result = 0.0;
        switch (operator) {
            case '+':
            result = num1 + num2;
            break;
            case '-':
            result = num1 - num2;
            break;
            case '*':
            result = num1 * num2;
            break;
            case '/':
            if (num2 != 0) {
                result = num1 / num2;
            } else {
                System.out.println("Error: cannot divide by zero.");
                System.exit(0);
            }
            break;
            default:
            System.out.println("Error: Invalid operator.");
            System.exit(0);
        }
        System.out.println("Result: " + result);
        scanner.close();
    }
}