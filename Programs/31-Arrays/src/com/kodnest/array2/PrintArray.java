package com.kodnest.array2;

import java.util.Scanner;

public class PrintArray 
{
	public static void main(String[] args) 
	{

		printArray();
	}
	
	public static void printArray()
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter Length of the array: ");
		int arr[] =new int[sc.nextInt()];
		
		System.out.println("Enter " + arr.length + " values of Array");
		for(int i=0; i<arr.length; i++)
		{
			arr[i]=sc.nextInt();
		}
		
		System.out.println("\nArray in forward direction.");
		for(int i=0; i<arr.length; i++)
		{
			System.out.print(arr[i] + " ");
		}
		
		System.out.println("\nArray in reverse direction.");
		for(int i=0; i<arr.length; i++)
		{
			System.out.print(arr[arr.length-1-i] + " ");
		}
	}
	
	
}
