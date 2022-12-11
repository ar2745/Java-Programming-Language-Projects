import java.io.*;
public class PrintOutStringArray {

	public static void main(String[] args) throws IOException {
		String string[] = new String[7];
		BufferedReader bufferedreader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter string elements: ");
		
		for(int x = 0; x < 7; x++) {
			string[x] = bufferedreader.readLine();
		}
		
		System.out.print("The result of the string array: ");
		
		for(int x = 0; x < 7; x++) {
			System.out.print(" " + string[x]);
		}

	}

}
