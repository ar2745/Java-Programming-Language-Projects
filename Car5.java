
public class Car5 {
	
	Car5() {
		//System.out.println("This");
	}
	
	public void hello() {
		System.out.println("This is a sample here");
	}
	
	public void motor() {
		System.out.println("This is all about this");
		this.hello();
	}

	public static void main(String[] args) {
		Car5 move = new Car5(); //Instantiating the class
		move.motor(); //Invoking the motor method

	}

}
