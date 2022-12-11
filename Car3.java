
public class Car3 {	
	public void motor() {
		System.out.println("Toyota Corolla is the best car");
	}
}
class Vehicle extends Car3 {
	public void motor() {
		System.out.println("I like Jeep");
	}
}
class Mobile {
	
	public static void main(String[] args) {
		Car3 a = new Car3();
		Car3 b = new Vehicle();
		
		a.motor();
		b.motor();

	}

}
