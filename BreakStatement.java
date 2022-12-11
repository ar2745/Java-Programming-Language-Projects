
public class BreakStatement {

	public static void main(String[] args) {
		int [] numbers = {5, 10, 18, 15, 12};
		
		for(int x : numbers) {
			if(x == 12) {
				break;
			}
			System.out.println(x);
		}

	}

}
