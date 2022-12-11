
public class Multithreading extends Thread{
	
	public void run() {
		System.out.println("Thread is currently running");
	}

	public static void main(String[] args) {
		Multithreading multithread = new Multithreading();
		multithread.start();

	}

}
