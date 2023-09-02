package com.kodnest.javaPrograms.patterns.alphabets;

public class W 
{
	public static void main(String[] args) 
	{	
		for(int i=0; i<=10; i++)
		{
			for(int x=0; x<2; x++)
			{
				for(int j=0; j<=10; j++)
				{
					if(j==i)
						System.out.print("*");
					else
						System.out.print(" ");
				}
				for(int j=0; j<=10; j++)
				{
					if(j==10-i)
						System.out.print("*");
					else
						System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
