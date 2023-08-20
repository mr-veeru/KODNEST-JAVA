import java.util.Scanner;

public class InputsOutputs 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Student ID");
		int id = sc.nextInt();
		System.out.println("ID of student is " + id + "\n");
		
		System.out.println("Enter Student email");
		String email = sc.next();
		System.out.println("Email of student is " + email + "\n");
		
		sc.nextLine();
		
		System.out.println("Enter Student Name");
		String name = sc.nextLine();
		System.out.println("Name of student is " + name + "\n");
		
		System.out.println("Enter Student CGPA");
		float CGPA = sc.nextFloat();
		System.out.println("CGPA of student is " + CGPA + "\n");
		
		System.out.println("Enter Student Contact Number");
		long contact = sc.nextLong();
		System.out.println("Contact of student is " + contact + "\n");
		
		System.out.println("Do u have any backlogs???");
		boolean backlogs = sc.nextBoolean();
		System.out.println(backlogs);
	}
}
