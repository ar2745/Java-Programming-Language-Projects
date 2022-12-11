class GetCube extends Thread {
	public void run() {
		for(int x = 1; x <= 10; x++) {
			System.out.println("The cube of " + x + " is " + x * x * x);
		}
	}
}
public class AProgramToGetCubeOfNumbersUsingMultithreading {

	public static void main(String[] args) {
		GetCube gc = new GetCube();
		gc.start();

	}

}
