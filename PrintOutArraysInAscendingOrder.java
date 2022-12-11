import java.io.*;
public class PrintOutArraysInAscendingOrder {

	public static void main(String[] args) throws NumberFormatException, IOException {
		int num1 = 0, num2[] = new int[7], x, y;
		BufferedReader bufferedreader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter only 7 array elements: ");
		
		for(x = 0; x < 7; x++) {
			num2[x] = Integer.parseInt(bufferedreader.readLine());
		}
		
		for(x = 0; x < num2.length; x++) {
			for(y = x + 1; y < num2.length; y++) {
				if(num2[x] > num2[y]) {
					num1 = num2[x];
					num2[x] = num2[y];
					num2[y] = num1;
				}
			}
		}
		
		System.out.print("The result of this array in ascending order:");
		
		for(x = 0; x < 7; x++) {
			System.out.print(" " + num2[x]);
		}

	}

}
