package package0;
import java.util.Scanner;
public class Exercises02_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of years: ");
		int years = input.nextInt();
		int projectedPopulation = 312032486 + (int)(years * 31535000.0/7) - (int)(years * 31535000.0/13) 
				+ (int)(years * 31535000.0/45);
		System.out.println("The population in " + years + " years is " + projectedPopulation);
	}

}
