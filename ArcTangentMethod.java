import java.lang.Math;
public class ArcTangentMethod {

	public static void main(String[] args) {
		double degrees = 55.0;
		double radians = Math.toRadians(degrees);
		
		System.out.format("The arctangent of %.4f is %.4f degrees %n", Math.cos(radians), Math.toDegrees(Math.atan(Math.sin(radians))));
	}

}
