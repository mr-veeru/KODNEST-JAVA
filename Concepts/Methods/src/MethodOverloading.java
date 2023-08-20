

public class MethodOverloading 
{
	public static void main(String[] args) 
	{
		teaBill();
		teaBill(6);
		teaBill("Gingger", 12);
		teaBill("leamon");
	}
	public static void teaBill()
	{
		System.out.println("One t bill is 10Rs");
	}
	public static void teaBill(int n)
	{
		System.out.println(n + " t bill is " + (n*10) + "Rs");
	}
	public static void teaBill(String type, int n)
	{
		System.out.println(n + " " + type + " t bill is " + (n*20) + "Rs");
	}
	public static void teaBill(String type)
	{
		System.out.println(type + " t bill is 20Rs");
	}
}
