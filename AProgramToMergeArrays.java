import java.util.*;
import java.util.Arrays;
public class AProgramToMergeArrays {

	public static void main(String[] args) {
		String x[] = {"H", "e", "l", "l", "o"};
		String y[] = {"W", "o", "r", "l", "d"};
		
		List<String> list = new ArrayList<String>(Arrays.asList(x));
		list.addAll(Arrays.asList(y));
		
		Object[] z = list.toArray();
		
		System.out.println(Arrays.toString(z));

	}

}
