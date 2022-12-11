import java.io.*;
public class PrintOutArrayFromUser {

	public static void main(String[] args) throws NumberFormatException, IOException {
		int x[] = new int[7];
		BufferedReader bufferedreader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter array numbers: ");
		
		for(int y = 0; y < 7; y++) {
			x[y] = Integer.parseInt(bufferedreader.readLine());
		}
		
		for(int y = 0; y < x.length; y++) {
			System.out.print(" " + x[y]);
		}

	}

}
