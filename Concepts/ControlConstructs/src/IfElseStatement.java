
import java.util.Scanner;

public class IfElseStatement 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter ur age");
		int age = sc.nextInt();
		sc.close();
		cal(age);
	}
	public static void cal(int age)
	{
		if(age>=18)
			System.out.println("You are eligible to vote");
		else
			System.out.println("You are not eligible to vote");
	}
}
