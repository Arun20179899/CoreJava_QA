package day3;

public class OperatorsDemo {

	public static void main(String[] args) {
		
//		Arithmetic Operators + - * / %
		
		int a = 20, b = 10;
		System.out.println("Sum of a and b is: "+(a+b));
		System.out.println("Difference of a and b is: "+(a-b));
		System.out.println("Multiflication of a and b is: "+(a*b));
		System.out.println("Division of a and b is: "+(a/b));
		System.out.println("Modulo division of a and b is: "+(a%b));
		
//		Relational/Comparison Operators > >= < <= != ==
		// returns always boolean value -> true/ false
		System.out.println(a>b);
		System.out.println(a>=b);
		b=20;
		System.out.println(a<b);
		System.out.println(a<=b);
		System.out.println(a!=b);
		System.out.println(a==b);
		

	}

}
