/*
	Write a Java Program to take name as input from keyboard and greet the person with his name printed along with greeting message.
	Note:
	Greeting is a task...So ...Keep The Task In a Separate Method and let the method be of type- “ Type-3 “
	I,e Method which accept the parameter and would not return the value.
	
	Sample input
	Omkar
	
	Sample Output:
	Hello Omkar ...How Are You ..
*/



import java.util.Scanner;

public class Methods_input 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("May I know ur name please...");
		String name = sc.nextLine();
		sc.close();
		
		greet(name);
		
	}
	public static void greet(String n)
	{
		System.out.println("\nHello! " + n + "... How are u???");
	}
}