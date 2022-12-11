import java.lang.Math;
public class TangentMethod {

	public static void main(String[] args) {
		double degrees = 125.0;
		double radians = Math.toRadians(degrees);
		
		System.out.format("The tangent of %.1f degrees is %.4f%n", degrees, Math.tan(radians));
	}

}
