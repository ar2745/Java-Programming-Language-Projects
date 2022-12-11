
public class Arrays {

	public static void main(String[] args) {
		int num[] = {100, 200, -99, 70, 93}, i;
		String [] names = {"Kettle", "Pot", "Cup", "Jug"};
		
		for(i = 0; i <= 4; i++) {
			System.out.print(num[i] + ", ");
		}
		
		System.out.println();
		
		for(String name : names) {
			System.out.print(name + ", ");
		}

	}

}
