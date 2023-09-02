package com.kodnest.javaPrograms.patterns.alphabets;

public class X 
{
	public static void main(String[] args)
	{
		for(int i=0; i<=10; i++)
		{
			for(int j=0; j<=10; j++)
			{
				if(j==i || j==10-i)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}
}
