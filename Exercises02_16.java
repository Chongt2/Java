package package0;
import java.util.Scanner;
public class Exercises02_16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the side: ");
		double side = input.nextDouble();
		double area = ((3 * Math.sqrt(3)) / 2) * Math.pow(side, 2);
		System.out.println("The area of the hexagon is " + area);
	}

}
