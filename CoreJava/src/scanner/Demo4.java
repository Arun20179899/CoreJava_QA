package scanner;

public class Demo4 {
	void cPON(int n) {
		if (n % 2 == 0) {
			if (n >= 0) {
				System.out.println(n + " is a Positve Even Number");
			} else {
				System.out.println(n + " is a Negative Even Number");
			}
		}

		else if (n % 2 != 0) {
			if (n >= 0) {
				System.out.println(n + " is a Positve Odd Number");
			} else {
				System.out.println(n + " is a Negative Odd Number");
			}

		}

	}
}
