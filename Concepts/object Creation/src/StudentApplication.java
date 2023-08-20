

public class StudentApplication 
{
	public static void main(String[] args) 
	{
		Student s1=new Student();
		
		s1.id = 6;
		s1.name="Veeru";
		s1.gender = 'M';
		s1.percentage = 77.2;
		s1.eat();
		s1.study();
		System.out.println("Student 1 details are: ");
		System.out.println("\tId: " + s1.id + "\n\tName: " + s1.name + "\n\tGender: " + s1.gender + "\n\tPercentage: " + s1.percentage +"%");
		
		Student s2=new Student();
		s2.id = 8;
		s2.name="Yamini";
		s2.gender = 'F';
		s2.percentage = 72.2;
		s2.eat();
		s2.study();
		System.out.println("Student 2 details are: ");
		System.out.println("\tId: " + s2.id + "\n\tName: " + s2.name + "\n\tGender: " + s2.gender + "\n\tPercentage: " + s2.percentage +"%");
		
	}

}
