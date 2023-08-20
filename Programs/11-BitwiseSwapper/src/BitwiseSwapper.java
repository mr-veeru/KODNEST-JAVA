import java.util.Scanner;

public class BitwiseSwapper 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first integer: "); 	//5
		int num1 = sc.nextInt();
		
		System.out.println("Enter the second integer: "); 	//8
		int num2 = sc.nextInt();

		swapUsingBitwise(num1, num2);
	}
	public static void  swapUsingBitwise(int num1, int num2)
	{		
		int temp = num1^num2;
		num2 = temp^num2;
		num1 = temp^num2;
		System.out.println("After swapping: First = " + num1 + ", Second = " + num2);
	}
}
