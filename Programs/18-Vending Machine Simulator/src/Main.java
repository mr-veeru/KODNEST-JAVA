import java.util.Scanner;

public class Main 
{
	public static void getProduct(String productCode)
	{
		//Cocacola, Pepsi ,Fanta,JalJeera,MountainDew,and BoatGuava
		
		switch (productCode) 
		{
			case "P01":
				System.out.println("Cocacola");
				break;
			case "P02":
				System.out.println("Pepsi");
				break;
			case "P03":
				System.out.println("Fanta");
				break;
			case "P04":
				System.out.println("JalJeera");
				break;
			case "P05":
				System.out.println("MountainDew");
				break;
			case "P06":
				System.out.println("BoatGuava");
				break;
			default:
				System.out.println("Drink");
				break;
		}
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		String productCode = sc.next();
		sc.close();
		getProduct(productCode);
	}
}
