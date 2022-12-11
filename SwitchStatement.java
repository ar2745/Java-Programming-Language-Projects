
public class SwitchStatement {

	public static void main(String[] args) {
		char grade = 'A';
		
		switch(grade) {
		case 'A' :
			System.out.println("Excellent");
			break;
			
		case 'B' :
			System.out.println("Great");
			break;
			
		case 'C' :
			System.out.println("Good");
			break;
			
		case 'D' :
			System.out.println("Poor");
			break;
			
		case 'F' :
			System.out.println("Fail");
			break;
			
		default :
			System.out.println("This is invalid grade");
		}
		
		System.out.println("Your grade is " + grade);

	}

}
