package package0;
import java.util.Scanner;
public class Exercises02_15 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double x1, x2, y1, y2, distance;
		System.out.print("Enter x1 and y1: ");
		x1 = input.nextDouble();
		y1 = input.nextDouble();
		System.out.print("Enter x2 and y2: ");
		x2 = input.nextDouble();
		y2 = input.nextDouble();
		distance = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow(y2 - y1, 2));
		System.out.println("The distance between the two points is " + distance);
	}
}
