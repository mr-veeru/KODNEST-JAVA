
public class Main 
{
	public static void findGCD(int a, int b)
	{
		while(b!=0)
		{
			int rem=a%b;
			a=b;
			b=rem;
		}
		System.out.println(a);
	}
	public static void main(String[] args)
	{
		findGCD(36, 60);
	}
}
