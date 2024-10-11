package accessspecifier.org.PublicDemo;

import accessspecifier.com.PublicDemo.Demo;
import accessspecifier.com.PublicDemo.Test;
//Access in another class in another package

public class Sample {
	public static void main(String[] args) {
		Demo d = new Demo(); // access Demo Class
		System.out.println(d.a);
		d.display();
		Test t = new Test(); // Access Test Class
		t.get();

	}
}
