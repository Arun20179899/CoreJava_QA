package org.accessspecifier.PublicDemo;

import com.accessspecifier.PublicDemo.Demo;
import com.accessspecifier.PublicDemo.Test;

public class Sample {
	public static void main(String[] args) {
		Demo d = new Demo(); // access Demo Class
		System.out.println(d.a);
		d.display();
		Test t = new Test(); // Access Test Class
		t.get();

	}
}
