
public class Main 
{
	public static void identifyCharacter(char ch)
	{
		if(ch >= 'a' && ch <= 'z')
		{
			if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
				System.out.println("Lower-case vowel");
			else
				System.out.println("Lower-case consonant");
		}
		else if(ch >= 'A' && ch <= 'Z')
		{
			if(ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')
				System.out.println("upper-case vowel");
			else
				System.out.println("upper-case consonant");
		}
		else if (ch >= '0' && ch <= '9')
		{
			System.out.println("digit");
		}
		else
		{
			System.out.println("special character");
		}
	}
	public static void main(String[] args)
	{
		identifyCharacter('a');
	}
}
