

public class NamedWhileLoop 
{
	public static void main(String[] args) 
	{
		int i=0, j=0;
		veeru: while(i<6)
		{
			System.out.println("Veeru");
			while(j<6)
			{
				System.out.println("Inner Veeru");
				j++;
				break veeru;
			}
			i++;
		}
	}

}
