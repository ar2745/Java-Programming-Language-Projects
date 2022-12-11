
public class Constructor {
	int num1 = 30;
	int num2 = 20;
	
	Constructor() {
		System.out.println("This is a constructor");
	}
	
	public void display() {
		System.out.println("The value of num1 is " + num1);
		System.out.println("The value of num2 is " + num2);
	}

	public static void main(String[] args) {
		Constructor constructor = new Constructor();
		constructor.display();

	}

}
