import java.util.Scanner;

public class Main 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n =sc.nextInt();
		sc.close();
		palindromeChecker(n);
	}
	public static void palindromeChecker(int n)
	{
		int m = n;
		int rem = 0, temp=0;
		while(m>0)
		{
			rem = m%10;
			temp = temp*10 + rem;
			m/=10;
		}
		if(temp==n)
			System.out.println("true");
		else
			System.out.println("false");
	}
}
