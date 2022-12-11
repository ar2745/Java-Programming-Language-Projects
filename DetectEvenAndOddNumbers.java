import java.util.*;
public class DetectEvenAndOddNumbers {

	public static void main(String[] args) {
		int x;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		x = sc.nextInt();
		
		if(x % 2 == 0) {
			System.out.println("This is an even number");
		}
		else {
			System.out.println("This is an odd number");
		}
		sc.close();
	}

}
