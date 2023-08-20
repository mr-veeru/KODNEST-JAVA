/*
 	Write a Java Program to take name and year of birth as input from keyboard and greet the person with his name printed along with greeting message.
	You should also print the age of the person after greeting.
	Note:
	Greeting is a task...So ...Keep The Task In a Separate Method and let the method be of type- “ Type-3 “
	I,e Method which accept the parameter and would not return the value.
	Note2: 
	Calculating age is also a task ..hence keep it in saperate method of type – 4 
	I,e method should accept parameter and should return value
	
	Sample input
	Omkar
	2020
	
	Sample Output:
	Hello Omkar …
	Your are 3 years old.
*/




import java.util.Scanner;

public class Methods_input2 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("May I know ur name and Year of Birth");
		String name = sc.nextLine();
		int yob = sc.nextInt();
		sc.close();
		
		greet(name);
		System.out.println("Your age is " + age(yob));
		
	}
	public static void greet(String n)
	{
		System.out.println("\nHello! " + n);
	}
	public static int age(int yob)
	{
		int age = 2023-yob;
		return age;
	}
}
