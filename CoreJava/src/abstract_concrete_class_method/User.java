package abstract_concrete_class_method;

public class User extends Car {
	@Override
	void stop() {
		System.out.println("Car Stopped");
	}

	@Override
	void start() {
		System.out.println("Car Started");
	}

	// optionally we can override shiftGear() as well

	public static void main(String[] args) {
		User u = new User();
		u.start();
		u.shifGear();
		u.stop();
		System.out.println("--------------");
		//2nd method to call the objects
		new User().start();
		new User().shifGear();
		new User().stop();

	}

}
