import java.util.*;
import java.util.Arrays;
public class MinimumAndMaximumElementInArray {

	public static void main(String[] args) {
		Integer[] num1 = {7,3,5,0,2,8,9,1};
		int min = (int)Collections.min(Arrays.asList(num1));
		int max = (int)Collections.max(Arrays.asList(num1));
		
		System.out.println("Results of minimum element is: " + min);
		System.out.println("Results of maximum element is: " + max);

	}

}
