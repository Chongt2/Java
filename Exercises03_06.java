import java.util.Scanner;
public class Exercises03_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final double KILOGRAMS_PER_POUND = 0.45359237;
		final double METERS_PER_INCH = 0.0254;
		Scanner input = new Scanner (System.in);
		System.out.print("Enter weight in pounds ");
		double pounds = input.nextDouble();
		System.out.print("Enter feet: ");
		double feet = input.nextDouble();
		System.out.print("Enter inches: ");
		double inches = input.nextDouble() + (feet * 12);
		double kilograms = pounds * KILOGRAMS_PER_POUND;
		double meters = inches * METERS_PER_INCH;
		double BMI = kilograms / (meters * meters);
		System.out.println("BMI is " + BMI);
		if (BMI < 18.5) System.out.println("Underweight");
		else if (BMI < 25) System.out.println("Normal");
		else if (BMI < 30) System.out.println("Overweight");
		else System.out.println("Obese");
	}

}
