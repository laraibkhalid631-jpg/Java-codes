import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take number from user
        System.out.print("Enter first number: ");
        double num1 = sc.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = sc.nextDouble();

        // Take operator from user
        System.out.print("Choose operation (+, -, *, /): ");
        char operator = sc.next().charAt(0);

        double result;

        // Conditions using if-else
        if (operator == '+') {
            result = num1 + num2;
            System.out.println("Result: " + result);
        } 
        else if (operator == '-') {
            result = num1 - num2;
            System.out.println("Result: " + result);
        } 
        else if (operator == '*') {
            result = num1 * num2;
            System.out.println("Result: " + result);
        } 
        else if (operator == '/') {
            result = num1 / num2;
            System.out.println("Result: " + result);
        } 
        else {
            System.out.println("Invalid operator!");
        }

        sc.close();
    }
}
