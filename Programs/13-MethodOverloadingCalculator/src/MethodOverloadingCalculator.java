
import java.util.Scanner;

public class  MethodOverloadingCalculator
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double num1 = sc.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = sc.nextDouble();

        System.out.print("Enter the operator (+, -, *, /): ");
        char operator = sc.next().charAt(0);

        sc.close();
        double result = 0.0;
        switch (operator) 
        {
            case '+':
                result = calculate(num1, num2);
                break;
            case '-':
                result = calculate(num1, num2, operator);
                break;
            case '*':
                result = calculate(num1, num2, operator);
                break;
            case '/':
                result = calculate(num1, num2, operator);
                break;
            default:
                System.out.println("Invalid operator");
                break;
        }

        System.out.println("Result: " + result);
    }

    public static double calculate(double num1, double num2) 
    {
        return num1 + num2;
    }

    public static double calculate(double num1, double num2, char operator) 
    {
        return num1 - num2;
    }

    public static double calculate(double num1, double num2, char operator) 
    {
        return num1 * num2;
    }

    public static double calculate(double num1, double num2, char operator) 
    {
        if (num2 != 0)
            return num1 / num2;
        else
        {
            System.out.println("Cannot divide by zero");
	            return 0.0;
	    }
    }
}
