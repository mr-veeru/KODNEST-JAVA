package com.kodnest.array1;
import java.util.Scanner;

public class SwapIndex 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter Length of the array: ");
		int arr[] =new int[sc.nextInt()];
		
		System.out.println("Enter " + arr.length + " values of Array");
		for(int i=0; i<arr.length; i++)
		{
			arr[i]=sc.nextInt();
		}
		
		System.out.print("Arr--> ");
		for(int i=0; i<arr.length; i++)
		{
			System.out.print(arr[i] + " ");
		}
		
		System.out.println("\nEnter the Indexes which you want to swap");
		int i1 = sc.nextInt();
		int i2 = sc.nextInt();
		int temp = 0;
		
		temp = arr[i1];
		arr[i1] = arr[i2];
		arr[i2] = temp;
		
		System.out.print("Arr--> ");
		for(int i=0; i<arr.length; i++)
		{
			System.out.print(arr[i] + " ");
		}
		
		
		
	}
}
