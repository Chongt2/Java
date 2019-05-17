package package0;
import java.util.Scanner;
public class Exercises02_19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		double x1, x2, x3, y1, y2, y3, side1, side2, side3, s, area;
		System.out.println("Enter three points for a triangle: ");
		x1 = input.nextDouble();
		y1 = input.nextDouble();
		x2 = input.nextDouble();
		y2 = input.nextDouble();
		x3 = input.nextDouble();
		y3 = input.nextDouble();
		side1 = Math.sqrt((Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2)));
		side2 = Math.sqrt((Math.pow(x3 - x2, 2) + Math.pow(y3 - y2, 2)));
		side3 = Math.sqrt((Math.pow(x1 - x3, 2) + Math.pow(y1 - y3, 2)));
		s = (side1 + side2 + side3) / 2;
		area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
		System.out.println("The area of the triangle is " + area);
	}

}
