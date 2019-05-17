package package0;
import java.util.Scanner;
public class Exercises02_09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter v0, v1, and t: ");
		float v0 = input.nextFloat();
		float v1 = input.nextFloat();
		float t = input.nextFloat();
		float averageAcceleration = (v1 - v0) / t;
		System.out.println("The average acceleration is " + averageAcceleration);
	}
}
