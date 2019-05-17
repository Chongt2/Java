import java.util.Scanner;
public class Exercises03_23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a point with two coordinates: ");
		double x1 = input.nextDouble(), y1 = input.nextDouble();
		if(x1 <= 5 && x1 >= -5 && y1 <= 2.5 && y1 >= -2.5) 
			System.out.println("Point (" + x1 + ", " + y1 + ") is in the ractangle");
		else System.out.println("Point (" + x1 + ", " + y1 + ") is not in the ractangle");
	}

}
