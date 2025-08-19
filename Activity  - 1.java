// Magararo, Alyssa M.
// BSIT-3B
// Group-3 - ITELEC1
// Activity 1

public class BasicMath {
    public static void main(String[] args) {
        double num1 = 15;
        double num2 = 5;
        char operator = '+';  // Can change to '+', '-', '*', or '/', also the two given numbers.
        double ans;

        System.out.println("Number 1: " + num1);
        System.out.println("Number 2: " + num2);
        System.out.println("Operator: " + operator);

        if (operator == '+') {
            ans = num1 + num2;
            System.out.println("The sum of the two numbers: " + ans);
        } else if (operator == '-') {
            ans = num1 - num2;
            System.out.println("The difference of the two numbers: " + ans);
        } else if (operator == '*') {
            ans = num1 * num2;
            System.out.println("The product of the two numbers: " + ans);
        } else if (operator == '/') {
            if (num2 != 0) {
                ans = num1 / num2;
                System.out.println("The quotient of the two numbers: " + ans);
            } else {
                System.out.println("Division by zero is not allowed.");
            }
        } else {
            System.out.println("Invalid operator! Please use +, -, *, or / only.");
        }
    }
}
