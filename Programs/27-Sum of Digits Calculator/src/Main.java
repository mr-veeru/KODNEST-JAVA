import java.util.Scanner;

public class Main 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		sc.close();
		sumOfDigits(n);
	}
	public static void sumOfDigits(int n)
	{
		int temp=0, sum=0;
		while(n>0)
		{
			temp = n%10;
			sum +=temp;
			n/=10;
		}
		System.out.println(sum);
	}
}
