package scanner;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		// Create a cPON method with argument and without return type and passed the
		// dynamic value for 5times and check the number is even or not
		Demo4 s1 = new Demo4();
		Scanner sc = new Scanner(System.in);
		for(int i=1; i<=5; i++) {
			System.out.println("Enter the n number");
			int value = sc.nextInt();
			s1.cPON(value);
			System.out.println("================");
		}
		sc.close();
	}

}
