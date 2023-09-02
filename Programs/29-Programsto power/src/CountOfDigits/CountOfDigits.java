package CountOfDigits;

public class CountOfDigits {

	public static void countOfDigits(int n) 
	{
		int count=0;
		while(n>0)
		{
			count++;
			n/=10;
		}
		System.out.println(count);
	}

}
