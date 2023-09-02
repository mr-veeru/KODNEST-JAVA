package PowerOfN;

public class PowerOfN 
{

	public static void powerOfTwo(int n) 
	{
		int m=1;
		for(int i=1; i<=n; i++)
		{
			m = m*n;
		}
		System.out.println(m);
	}
}
