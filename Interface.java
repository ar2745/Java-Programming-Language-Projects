
interface Output {
	void display();
}

public class Interface implements Output {
	
	public void display() {
		System.out.println("This is a sample of interface class");
	}

	public static void main(String[] args) {
		Interface face = new Interface();
		face.display();

	}

}
