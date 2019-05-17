package package0;
import java.util.Scanner;
public class Exercises02_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter weight in pounds: ");
		double kilograms = input.nextDouble() * 0.45359237;
		System.out.println("Enter height in inches: ");
		double meters = input.nextDouble() * 0.0254;
		double BMI = kilograms / Math.pow(meters, 2);
		System.out.println("BMI is " + BMI);
	}

}
