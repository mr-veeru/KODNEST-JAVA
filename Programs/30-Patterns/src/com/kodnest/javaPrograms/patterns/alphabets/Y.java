package com.kodnest.javaPrograms.patterns.alphabets;

public class Y 
{
	public static void main(String[] args)
	{
		for(int i=0; i<=10; i++)
		{
			for(int j=0; j<=10; j++)
			{
				if((j==i&&i<5) || (j==10-i&&i<5) || (j==5&&i>=5))
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}
}
