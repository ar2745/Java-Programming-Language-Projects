
public class EnhancedForLoop {

	public static void main(String[] args) {
		int [] numbers = {5, 10, 15, 20, 15};
		
		for(int x : numbers ) {
			System.out.print(x + ", ");
		}
		
		System.out.println();
		
		String [] names = {"Kettle", "Pot", "Cup", "Jug"};
		
		for(String name : names) {
			System.out.print(name + ", ");
		}

	}

}
