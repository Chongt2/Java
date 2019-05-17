package package0;
import java.util.Scanner;
public class Exercises02_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter speed and acceleration: ");
		float speed = input.nextFloat();
		float acceleration = input.nextFloat();
		float minRunwayLength = speed * speed / (2 * acceleration);
		System.out.println("The minimum runway length for this airplane is " + minRunwayLength);
	}

}
