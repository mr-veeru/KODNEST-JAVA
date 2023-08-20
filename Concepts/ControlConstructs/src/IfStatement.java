

import java.util.Scanner;

public class IfStatement 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter ur marks");
		int marks = sc.nextInt();
		sc.close();
		System.out.println("Welcome to Kodnest");
		cal(marks);
	}
	public static void cal(int marks)
	{
		if(marks>=80)
			System.out.println("Welcome to Tech club");
	}
}
