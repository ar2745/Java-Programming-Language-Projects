import java.util.*;
public class DetectNegativeAndPositiveNumbersFromAUser {

	public static void main(String[] args) {
		int x;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		x = sc.nextInt();
		
		if(x < 0) {
			System.out.println("This is a negative number");
		}
		else {
			System.out.println("This is a positive number");
		}
		sc.close();
	}

}
