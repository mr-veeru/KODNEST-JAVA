import java.util.Scanner;

public class JourneyCalculator 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		double speed = sc.nextDouble();
		double time = sc.nextDouble();
		sc.close();
		
		JourneyCalculator journeyCalculator = new JourneyCalculator();
		System.out.println(journeyCalculator.calculateDistance(speed, time));
	}
	
	public double calculateDistance(double speed, double time)
	{
		return speed*time;
	}
}