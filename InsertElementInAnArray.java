import java.util.*;
public class InsertElementInAnArray {

	public static void main(String[] args) {
		int x, y, z;
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter any element: ");
		
		x = scanner.nextInt();
		int num1[] = new int[x + 1];
		
		System.out.println("Enter array of elements now: ");
		
		for(int w = 0; w < x; w++) {
			num1[w] = scanner.nextInt();
		}
		
		System.out.println("Choose a preferred position for your element: ");
		y = scanner.nextInt();
		System.out.print("Enter your preferred element: ");
		
		z = scanner.nextInt();
		
		for(int w = (x - 1); w >= (y - 1); w--) {
			num1[w + 1] = num1[w];
		}
		
		num1[y - 1] = z;
		
		System.out.print("The result after entering element is: ");
		
		for(int w = 0; w < x; w++) {
			System.out.print(num1[w] + ",");
		}
		
		System.out.print(num1[x]);
		
		scanner.close();
	}

}
