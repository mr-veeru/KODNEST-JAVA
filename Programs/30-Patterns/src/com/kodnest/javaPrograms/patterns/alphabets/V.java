package com.kodnest.javaPrograms.patterns.alphabets;

public class V 
{
	public static void main(String[] args) 
	{	
		for(int i=0; i<=10; i++)
		{
			for(int j=0; j<=10; j++)
			{
				if((j==i&&i<5) || (j==10-i&&i<5))
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}
}
