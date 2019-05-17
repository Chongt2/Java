package package0;
import java.util.Scanner;
public class Exercises02_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a degree in Celsius: ");
		double Celsius = input.nextDouble();
		double Fahrenheit = (9.0/5) * Celsius + 32;
		System.out.println(Celsius+ " Celsius is " + Fahrenheit + " Fahrenheit");
	}

}
