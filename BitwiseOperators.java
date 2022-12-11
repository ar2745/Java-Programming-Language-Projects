
public class BitwiseOperators {

	public static void main(String[] args) {
		int a = 20; //20 = 0001 0100 
		int b = 15; //15 = 0000 1111
		int c;
		
		c = a & b; //4 = 0000 0100
		System.out.println("a & b = " + c);
		
		c = a | b; //31 = 0001 1111
		System.out.println("a | b = " + c);
		
		c = a ^ b; //27 = 0001 1011
		System.out.println("a ^ b = " + c);
		
		c = a << 3; //160 = 1010 0000
		System.out.println("a << 2 = " + c);
		
		c = b >> 2; //3 = 0000 0011 
		System.out.println("a >> 2 = " + c);

	}

}
