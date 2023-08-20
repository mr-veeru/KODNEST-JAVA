
public class Methods 
{
	public static void main(String[] args) 
	{
		type1();
		System.out.println(type2());
		type3("Veeru");
		System.out.println(type4("Veeru"));
	}
	public static void type1()
	{
		System.out.println("It doesnt takes parameters and dont return any value");
		System.out.println("This is type-1\n");
	}
	public static String type2()
	{
		System.out.println("It dont takes parameters and return any value");
		return "This is type-2\n";
	}
	public static void type3(String name)
	{
		System.out.println("It takes parameters and dont return any value");
		System.out.println("This is type-3\n");
	}
	public static String type4(String name)
	{
		System.out.println("It takes parameters and return a value");
		return "This is type-4";
	}
}
