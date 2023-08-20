import java.util.Scanner;

public class temperatureConvertion  
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		/*
		 * Welcome to the Temperature Conversion Tool!
			Select an option:
			
			2. Convert Fahrenheit to Celsius
			 1
			Enter the temperature in Celsius: 25
			25.0°C is equivalent to 77.0°F
		 */
		System.out.println("Welcome to the Temperature Conversion Tool!");
		System.out.println("Select an option:");
		System.out.println("1. Convert Celsius to Fahrenheit");
		System.out.println("2. Convert Fahrenheit to Celsius");
		System.out.print("Enter your choice: ");
		int choice = sc.nextInt();
		
		if(choice == 1)
		{
			System.out.print("Enter the temperature in Celsius: ");
			double temperature = sc.nextDouble();
			System.out.println(temperature + "°C is equivalent to " + celsiusToFahrenheit(temperature) + "°F");
		}
		else if(choice == 2)
		{
			System.out.print("Enter the temperature in Fahrenheit: ");
			double temperature = sc.nextDouble();
			System.out.println(temperature + "°F is equivalent to " + fahrenheitToCelsius(temperature) + "°C");
		}
	}
	public static double celsiusToFahrenheit(double celsius)
	{
		return (celsius*9/5) + 32;
	}
	public static double fahrenheitToCelsius(double fahrenheit)
	{
		return (fahrenheit - 32) * 5/9;
		
	}

}
