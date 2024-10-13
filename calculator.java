import java.util.Scanner;

public class calculator{
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter the second number: ");        double num2 = scanner.nextDouble();
        System.out.println("Choose an operation: +, -, *, /");
    char operation = scanner.next().charAt(0);
    double result;
     if (operation == '/') {
    result = num1 / num2;
    } else if (operation == '*') {
         result = num1 * num2;
     } else if (operation == '-') {
    result = num1 - num2;
     } else if (operation == '+') {
    if (num2 != 0) {
    result = num1 + num2;
     } else {
     System.out.println("Error: Division by zero is not allowed.");
    return;
     }
        } else {
     System.out.println("Invalid operation. Please try again.");
    return;
        }
        System.out.println("The answer is: " + result);
        scanner.close();
    }
}
