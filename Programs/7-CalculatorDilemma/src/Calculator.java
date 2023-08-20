import java.util.Scanner;

public class Calculator 
{
	public static void main(String[] args) 
	{
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter any two numbers to perform Calculation...");
		 int num1 = sc.nextInt();
		 int num2 = sc.nextInt();
		 
		 System.out.println("Enter any one Operator among the following:");
		 System.out.println("Click + for Addition");
		 System.out.println("Click - for Subtraction");
		 System.out.println("Click * for Multiplication");
		 System.out.println("Click / for Division");
		 char operator = sc.next().charAt(0);
		 
		 sc.close();
		 arithmeticOperations(operator, num1, num2);
	}
	public static void arithmeticOperations(char operator, int num1, int num2)
	{
		switch(operator)
		{
			case '+' : System.out.println(num1 + "+" + num2 + " = " + (num1+num2));
					break;
			case '-' : System.out.println(num1 + "-" + num2 + " = " + (num1-num2));
					break;
			case '*' : System.out.println(num1 + "*" + num2 + " = " + (num1*num2));
					break;
			case '/' : System.out.println(num1 + "/" + num2 + " = " + (num1/num2));
					break;
			default : System.out.println("Enter the valid Operator...");
		
		}
	}
}
