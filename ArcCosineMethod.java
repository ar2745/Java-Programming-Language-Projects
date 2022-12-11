import java.lang.Math;
public class ArcCosineMethod {

	public static void main(String[] args) {
		double degrees = 45.0;
		double radians = Math.toRadians(degrees);
		
		System.out.format("The arccosine of %.4f is %.4f degrees %n", Math.cos(radians), Math.toDegrees(Math.acos(Math.sin(radians))));
	}

}
