package PowerOfNumOFDigits;

public class PowerOfNumOFDigits 
{
	public static void powerOfNumOFDigits(int n) 
	{
		int count=countOfDigits(n);
		int m=1;
		
		for(int i=1; i<=count; i++)
		{
			m = m*n;
		}
		System.out.println(m);
	}
	public static int countOfDigits(int n) 
	{
		int count=0;
		while(n>0)
		{
			count++;
			n/=10;
		}
		return count;
	}
}
