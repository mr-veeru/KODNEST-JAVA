/*
 	Assume You Have A Fan Object.
	And it has no_Of_Wings,color,cost, and brand.
	Fan can rotate and it can blow_Air.
	Your Task is to Create 3 fan objects access its data members and give the values to it . You should also print the data mambers on the console.
	You should also access its member functions after printing data members on the console.
	Note that : Fan Can Certainly Rotate But User Should Know Which Color Which Brand And How Many Wings Fan is Rotating and what is the cost of it .
	If blow_Air is accessed then fan can certainly bow air but which color fan is blowing air, the user should know it
*/

public class Fan 
{
	int numOfWings;
	String color;
	int cost;
	String brand;
	
	void rotate()
	{
		System.out.println(color + " fan is rotating and Its brand is " + brand + " with " + numOfWings + " Wings which costs " + cost + "\n");
	}
	void blowAir()
	{
		System.out.println(color + " fan is blowing air");
	}
}
