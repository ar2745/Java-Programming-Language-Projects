import java.io.*;
public class UseOfMathOperatorsForCaluclator {

	public static void main(String[] args) throws NumberFormatException, IOException {
		int x, y, z, xyz = 0;
		
		BufferedReader bufferedreader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter first number: ");
		x = Integer.parseInt(bufferedreader.readLine());
		
		System.out.println("Enter second number: ");
		y = Integer.parseInt(bufferedreader.readLine());
		
	while(xyz != 6) {
		System.out.println("1: Addition");
		System.out.println("2: Subtraction");
		System.out.println("3: Division");
		System.out.println("4: Multiplication");
		System.out.println("5: Exit program");
		
		xyz = Integer.parseInt(bufferedreader.readLine());
		
		switch(xyz) {
		case 1 :
			z = x + y;
			System.out.println("Result of addition is: " + z);
			break;
			
		case 2 :
			z = x - y;
			System.out.println("Result of subtraction is: " + z);
			break;
			
		case 3 :
			z = x / y;
			System.out.println("Result of division is: " + z);
			break;
			
		case 4 :
			z = x * y;
			System.out.println("Result of multiplication is: " + z);
			break;
			
		case 5 :
			System.out.println("Thanks for using program");
			System.exit(0);
			break;
		}
		}
	}
	}
