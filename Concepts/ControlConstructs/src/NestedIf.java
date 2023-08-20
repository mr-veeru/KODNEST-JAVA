
import java.util.Scanner;

public class NestedIf 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter your total marks");
		int totalMarks = sc.nextInt();

		if(totalMarks>=80)
		{
			System.out.println("Enter your CS marks");
			int csMarks = sc.nextInt();
			sc.close();
			
			if(csMarks>=60)
				System.out.println("Welcome to Tech club");
		}	
	}
}
