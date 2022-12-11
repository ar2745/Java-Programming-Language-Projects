
public class ValueOfMethod {

	public static void main(String[] args) {
		Integer a = Integer.valueOf(4);
		Double b = Double.valueOf(17);
		Float c = Float.valueOf("40");
		Integer d = Integer.valueOf("500", 14);
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
	}

}
