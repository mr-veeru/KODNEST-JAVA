import java.util.Scanner;

public class TemperatureConverter
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		double fahrenheit = sc.nextDouble();
		sc.close();
		
		TemperatureConverter temperatureConverter = new TemperatureConverter();
		System.out.println(String.format("%.2f", temperatureConverter.convertFahrenheitToCelsius(fahrenheit)));
	}
	public double convertFahrenheitToCelsius(double fahrenheit)
	{
		return ((fahrenheit- 32) * 5/9);	
	}
}
