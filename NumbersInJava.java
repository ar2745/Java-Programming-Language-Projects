import java.lang.Math;
public class NumbersInJava {

	public static void main(String[] args) {
		Integer a = 2;
		
		/*
		 * byte byteValue()
		 * short shortValue()
		 * int intValue()
		 * long longValue()
		 * float floatValue()
		 * double doubleValue()
		 */
		
		System.out.println(a.intValue()); //int intValue()
		System.out.println(a.shortValue()); //short shortValue()
		System.out.println(a.longValue()); //long longValue()
		System.out.println(a.floatValue()); //float floatValue()
		System.out.println(a.doubleValue()); //double doubleValue()
		System.out.println(a.byteValue()); //byte byteValue()
		System.out.format("The value of pi is %.4f%n", Math.PI);
		

	}

}
