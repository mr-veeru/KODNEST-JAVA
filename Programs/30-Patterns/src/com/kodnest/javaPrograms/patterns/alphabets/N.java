package com.kodnest.javaPrograms.patterns.alphabets;

public class N 
{
	public static void main(String[] args) 
	{	
		for(int i=0; i<=10; i++)
		{
			for(int j=0; j<=10; j++)
			{
				if(j==0 || j==i || j==10)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}
}
