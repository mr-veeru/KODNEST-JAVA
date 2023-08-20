

public class NamedForLoop 
{
	public static void main(String[] args) 
	{
		veeru:for(int i=0; i<=6; i++)
		{
			for(int j=0; j<=6; j++)
			{
				System.out.println("Hii Veeru...");
				break veeru;
			}
		}
	}

}
