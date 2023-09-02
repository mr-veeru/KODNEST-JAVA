package com.kodnest.javaPrograms.patterns.alphabets;

public class J 
{
	public static void main(String[] args) 
	{	
		for(int i=0; i<=10; i++)
		{
			for(int j=0; j<=10; j++)
			{
				if(i==0 || j==10/2 || (i==10&&j<=5) || (j==0&&i>=5))
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}
}
