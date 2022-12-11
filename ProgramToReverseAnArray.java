import java.util.*;
public class ProgramToReverseAnArray {

	public static void main(String[] args) {
		ArrayList<String> arraylist = new ArrayList<String>();
		arraylist.add("H");
		arraylist.add("e");
		arraylist.add("l");
		arraylist.add("l");
		arraylist.add("o");
		
		System.out.println("Before reversal: " + arraylist);
		
		Collections.reverse(arraylist);
		
		System.out.println("After reversal: " + arraylist);

	}

}
