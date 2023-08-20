

/*
	Assume You Have A Fan Object.
	And it has no_Of_Wings,color,cost, and brand.
	Fan can rotate and it can blow_Air.
	
	Your Task is to Create 3 fan objects access its data members and give the values to it . 
	You should also print the data mambers on the console.
	You should also access its member functions after printing data members on the console.
	Note that : Fan Can Certainly Rotate But User Should Know Which Color Which Brand And How Many Wings Fan is Rotating and what is the cost of it .
	If blow_Air is accessed then fan can certainly bow air but which color fan is blowing air, the user should know it
*/

public class FanApplication 
{
	public static void main(String[] args) 
	{
		Fan f1=new Fan();
		Fan f2=new Fan();
		Fan f3=new Fan();
		
		f1.brand = "ABC";
		f1.color = "Black";
		f1.cost = 600;
		f1.numOfWings = 3;
		System.out.println("Fan 1 has :");
		System.out.println("\t Brand: " + f1.brand + "\t Color: " + f1.color + "\t Cost:" + f1.cost + "\t Num of Wings: " + f1.numOfWings);
		f1.blowAir();
		f1.rotate();
		
		f2.brand = "CDE";
		f2.color = "Brown";
		f2.cost = 800;
		f2.numOfWings = 4;
		System.out.println("Fan 2 has :");
		System.out.println("\t Brand: " + f2.brand + "\t Color: " + f2.color + "\t Cost:" + f2.cost + "\t Num of Wings: " + f2.numOfWings);
		f2.blowAir();
		f2.rotate();
		
		f3.brand = "EFG";
		f3.color = "Blue";
		f3.cost = 300;
		f3.numOfWings = 3;
		System.out.println("Fan 3 has :");
		System.out.println("\t Brand: " + f3.brand + "\t Color: " + f3.color + "\t Cost:" + f3.cost + "\t Num of Wings: " + f3.numOfWings + "");
		f3.blowAir();
		f3.rotate();
	}
}
