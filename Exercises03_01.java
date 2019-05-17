import java.util.Scanner;
public class Exercises03_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a, b, c: ");
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		double discriminant = b*b - 4*a*c;
		double root1, root2;
		if(discriminant > 0) {
			root1 = (b * -1 + Math.sqrt(discriminant)) / 2 * a;
			root2 = (b * -1 - Math.sqrt(discriminant)) / 2 * a;
			System.out.println("The equation has two roots " + root1 + " and " + root2);
		}
		else if(discriminant == 0) {
			root1 = (b * -1 + Math.sqrt(discriminant)) / 2 * a;
			System.out.println("The equation has one root " + root1);
		}
		else
			System.out.println("The equation has no real roots");
	}

}
