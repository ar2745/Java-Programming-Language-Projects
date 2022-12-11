import java.util.*;
public class AProgramToCheckPalindromeNumber {

	public static void main(String[] args) {
		int w, x, y = 0, z = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter numbers to check if it is a palindrome: ");
		z = sc.nextInt();
		w = z;
		
		while(z > 0) {
			x = z % 10;
			y = (y * 10) + x;
			z = z / 10;
		}
		
		if(w == y) {
			System.out.println("This number is a palindrome");
		}
		else {
			System.out.println("This number is not a palindrome");
		}
		
		sc.close();
		

	}

}
