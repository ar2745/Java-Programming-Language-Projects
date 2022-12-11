
import java.util.*;

public class MultiplicationTable {

	public static void main(String[] args) {
		int x, y;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter a number to print multiplication table: ");
		x = sc.nextInt();
		
		System.out.println("Result of multiplication table is " + x + "is: ");
		
		for(y = 1; y <= 10; y++) {
			System.out.println(x + " * " + y + " = " + (x*y));
			sc.close();
		}			
	}
}
