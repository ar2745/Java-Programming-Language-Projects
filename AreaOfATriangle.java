
import java.util.*;

public class AreaOfATriangle {
	
	public static void main(String[] args) {		
		double width, height, result;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter width and height of the triangle: ");
		width = sc.nextDouble();
		height = sc.nextDouble();
		
		result = (width * height) / 2;
		
		System.out.println("Result of area of triangle: " + result);
		sc.close();
	}

}
