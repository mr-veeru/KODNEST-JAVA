package com.kodnest.javaPrograms.patterns.level4;

public class P08 
{
	public static void main(String[] args) 
	{
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter num of lines");
//		int n = sc.nextInt();
		
		for(int i=0; i<=10; i++)
		{
			for(int j=0; j<=10; j++)
			{
				if(i==0 || j==0 || i==10)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}
}
