import java.util.Arrays;
public class ProgramToSearchAnElementInAnArray {

	public static void main(String[] args) {
		int x[] = {2,6,7,9,1,8,4};
		int index = Arrays.binarySearch(x, 9);
		
		System.out.println("This element is found at index: " + index);

	}

}
