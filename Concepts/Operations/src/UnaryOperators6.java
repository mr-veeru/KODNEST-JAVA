
public class UnaryOperators6 
{
	public static void main(String args[]) {
		int a=6;
		int b;
		b = a++ + --a + a-- + a++;			// 6 + 6 + 6 + 5
		System.out.println(a);			// 6
		System.out.println(b);			// 23
	}
}
