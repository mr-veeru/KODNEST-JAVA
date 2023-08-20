import java.util.Scanner;

public class LogicalOperatorValidation 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Is input valid (true/false): ");
		boolean inputValid = sc.nextBoolean();
		
		System.out.println("Does input meet a certain condition (true/false): ");
		boolean inputMeets = sc.nextBoolean();
		
		if(isValidInput(inputValid, inputMeets) == true)
			System.out.println("Input is valid.");
		else
			System.out.println("Input is not valid.");
	}
	public static boolean isValidInput(boolean inputValid, boolean inputMeets)
	{
		return inputValid && inputMeets;
		
	}
}
