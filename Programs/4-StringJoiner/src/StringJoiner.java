import java.util.Scanner;

public class StringJoiner 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		String firstName = sc.next();
		String lastName = sc.next();
		sc.close();
		System.out.println(joinStrings(firstName, lastName));
	}
	
	public static String joinStrings(String str1, String str2)
	{
		return str1 + " " + str2;
	}

}
