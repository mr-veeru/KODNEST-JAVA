import java.util.Scanner;

public class Main
{
	public static void checkDiscount(double purchaseAmount)
	{
		if(purchaseAmount > 100)
		{
			System.out.println("Discount Applicable");
		}
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		double purchaseAmount = sc.nextDouble();
		sc.close();
		checkDiscount(purchaseAmount);
	}
}