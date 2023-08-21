import java.util.Scanner;

public class Main 
{
	public static void identifyPolygon(int sides)
	{
		//traiangle, Quadrilateral,Pentagon and Hexagon. 
		switch (sides) 
		{
			case 3:
				System.out.println("traiangle");
				break;
			case 4:
				System.out.println("Quadrilateral");
				break;
			case 5:
				System.out.println("Pentagon");
				break;
			case 6:
				System.out.println("Hexagon");
				break;
			default:
				System.out.println("Polygon");
				break;
		}
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		identifyPolygon(n);
	}
}
