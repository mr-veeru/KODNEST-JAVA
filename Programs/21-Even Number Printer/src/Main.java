import java.util.Scanner;

public class Main 
{
	public static void printEvenNumbers(int n)
	{
		for(int i=1; i<=n; i++)
		{
			if(i%2==0)
				System.out.println(i);
		}
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();
		printEvenNumbers(num);
	}

}
