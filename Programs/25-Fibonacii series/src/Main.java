
public class Main 
{
	public static void printFibonacciSeries(int n)
	{
		int a=0, b=1;
		System.out.print(a + " ");
		System.out.print(b + " ");
		for(int i=2; i<n; i++)
		{
			int c=a+b;
			System.out.print(c + " ");
			a=b;
			b=c;
		}
	}
	public static void main(String[] args)
	{
		printFibonacciSeries(10);
	}
}
