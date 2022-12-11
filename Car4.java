
public abstract class Car4 {
	
	abstract void motor();
}
class Corolla extends Car4 {
	
	void motor() {
		System.out.println("I love Corolla");
	}

	public static void main(String[] args) {
		Car4 toyota = new Corolla();
		toyota.motor();

	}

}
