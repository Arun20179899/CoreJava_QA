package abstract_concrete_class_method;

public abstract class College {
	College(){
		System.out.println("college Fees");
	}
	College(double amount){
		this(); // access  another constructor in the same class
		System.out.println("college fees is: "+amount);
	}

}
