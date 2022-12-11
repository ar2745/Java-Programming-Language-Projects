
public class Car2 {
	String name;
	String model;
	String color;
	int tires;
	
	void engine() {
		System.out.println("The car engine is very good, sound");
	}
	
	void interior() {
		System.out.println("The car interior contains the seats, steering, dashboard");
	}
	
	void exterior() {
		System.out.println("The car exterior is made up of the color, tires");
	}

	public static void main(String[] args) {
		Car2 motor = new Car2();
		motor.engine();
		motor.interior();
		motor.exterior();

	}

}
