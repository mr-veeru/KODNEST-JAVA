import java.util.Scanner;

public class Main 
{
	public static void calculateFactorial(int n)
	{
		int fact=1;
		for(int i=1; i<=n; i++)
		{
			fact=fact*i;
		}
		System.out.println(fact);
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();
		calculateFactorial(num);
	}
}
