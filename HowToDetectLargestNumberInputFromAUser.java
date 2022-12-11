import java.util.*;
public class HowToDetectLargestNumberInputFromAUser {

	public static void main(String[] args) {
		int x, y, z;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter three different numbers: ");
		x = sc.nextInt();
		y = sc.nextInt();
		z = sc.nextInt();
		
		if(x > y && x > z) {
			System.out.println(x + " is the greatest number");
		}
		else if(y > x && y > z) {
			System.out.println(y + " is the greatest number");
		}
		else if(z > x && z > y) {
			System.out.println(z + " is the greatest number");
		}
		else {
			System.out.println("These numbers are the same");
		}
		
		sc.close();
	}

}
