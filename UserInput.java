import java.util.Scanner;

public class UserInput {
	public static void main(String args[]) {
		String firstName;
		String lastName;
		long phoneNum;		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your first name: ");
		firstName = sc.next();
		
		System.out.println("Enter you last name: ");
		lastName = sc.next();
		
		System.out.println("Enter your phone number: ");
		phoneNum = sc.nextLong();
		
		System.out.println("Welcome " + firstName + " " + lastName);
		System.out.println("Your phone number is: " + phoneNum);
		sc.close();
	}
}
