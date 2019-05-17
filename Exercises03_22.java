import java.util.Scanner;
public class Exercises03_22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a point with two coordinates: ");
		double distance, x2, y2;
		x2 = input.nextDouble();
		y2 = input.nextDouble();
		distance = Math.sqrt(Math.pow(x2, 2) + Math.pow(y2, 2));
		if(distance <= 10) System.out.println("Point (" + x2 + ", " + y2 + ") is in the circle");
		else System.out.println("Point (" + x2 + ", " + y2 + ") is not in the circle");
	}

}
