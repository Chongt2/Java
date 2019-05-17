import java.util.Scanner;
public class Exercises03_27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a point's x- and y- coordinates: ");
		double x = input.nextDouble(), y = input.nextDouble();
		if((x >= 0 && x <= -2*(y-100)) && (y >= 0 && y <= -0.5*x + 100)) 
			System.out.println("The point is in the triangle");
		else System.out.println("The point is not in the triangle");
	}

}
