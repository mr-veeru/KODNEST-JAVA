import java.util.Scanner;

public class Main 
{
	public static void calculateSum(int n)
	{
		int sum =0;
		for(int i=1; i<=n; i++)
		{
			sum= sum +i;
		}
		System.out.println(sum);
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();
		calculateSum(num);
	}
}
