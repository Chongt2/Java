package package0;
import java.util.Scanner;
public class Exercises02_17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the temperature in Fahrenheit between -58F and 41F: ");
		double temperature = input.nextDouble();
		System.out.println("Enter the wind speed (>=2) in miles per hour: ");
		double windSpeed = input.nextDouble();
		double windChillIndex = 35.74 + 0.6215 * temperature - 35.75 * Math.pow(windSpeed, 0.16) 
			+ 0.4275 * temperature * Math.pow(windSpeed, 0.16);
		System.out.println("The wind chill index is " + windChillIndex);
	}

}
