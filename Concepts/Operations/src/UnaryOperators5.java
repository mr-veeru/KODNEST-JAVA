
public class UnaryOperators5 
{
	public static void main(String args[]){
		int a=6;
		int b;
		b = a++ + --a + a++ + ++a + --a;		// 6 + 6 + 6 + 8 + 7
		System.out.println(a);			// 7
		System.out.println(b);			// 33
	}
}
