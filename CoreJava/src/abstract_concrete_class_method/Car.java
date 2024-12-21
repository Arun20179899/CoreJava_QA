package abstract_concrete_class_method;

public abstract class Car extends Vehicle {

	abstract void stop();
	
	// start() and shiftGear() implemented implicitly
	
	public void toDisplay() {
		System.out.println("Hello Java");
	}

}
