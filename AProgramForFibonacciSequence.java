
public class AProgramForFibonacciSequence {

	public static void main(String[] args) {
		int w = 0, x = 1, y, z, count = 20;
		
		System.out.println("The result of the Fibonacci Sequence is: ");
		System.out.print(w + " " + x);
		
		for(z = 2; z < count; z++) {
			y = w + x;
			System.out.print(" " + y);
			
			w = x;
			
			x = y;
		}

	}

}
