
public class ContinueStatement {

	public static void main(String[] args) {
		int [] numbers = {5, 10, 15, 20, 25};
		
		for(int x : numbers) {
			if(x == 5) {
				continue;
			}
			System.out.println(x);
		}

	}

}
