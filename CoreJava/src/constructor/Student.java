package constructor;

public class Student {
	int id;
	String name;
	static String stdcollege = "BGS Institute of Technology";

	Student(int id, String name) {
		this.id = id;
		this.name = name;
		
	}

	public static void main(String[] args) {
		Student s1 = new Student(101, "John");
		Student s2 = new Student(102, "Tommi");
		System.out.println("---------Details-----------");
		System.out.println(s1.id+"  "+s1.name+"  "+Student.stdcollege);
		System.out.println(s2.id+"  "+s2.name+"  "+Student.stdcollege);
	}

}
