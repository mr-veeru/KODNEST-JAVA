package Armstrong;

public class AmstrongNumber 
{
	public static void amstrongNumber(int n) 
	{
		int count=countOfDigits(n);
		int k=n, m=1, temp=0, rem=0;
		
		for(int i=1; i<=count; i++)
		{
			rem = n%10;
			m=1;
			for(int j=1; j<=count; j++)
			{
				m = m*rem;
			}
			temp = temp+m;
			n/=10;
		}
		if(temp==k)
			System.out.println(k + " is a Amstrong Number");
		else
			System.out.println(k + " is not a Amstrong Number");
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
