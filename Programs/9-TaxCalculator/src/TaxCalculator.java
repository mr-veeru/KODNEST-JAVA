import java.util.Scanner;

public class TaxCalculator 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the purchase amount: "); //100
		double amount = sc.nextDouble();
		
		System.out.print("Enter the tax rate (in decimal form): ");  //0.08
		double taxRate = sc.nextDouble();
		sc.close();
		
		System.out.println("Total cost including tax: " + calculateTotalWithTax(amount, taxRate));  //108.0
	}
	public static double calculateTotalWithTax(double amount, double taxRate)
	{
		return (amount*taxRate)+amount;
	}
}
