package package0;
import java.util.Scanner;
public class Exercises02_23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the driving distance: ");
		double distance = input.nextDouble();
		System.out.println("Enter miles per gallon: ");
		double MPG = input.nextDouble();
		System.out.println("Enter price per gallon: ");
		double PPG = input.nextDouble();
		double costOfDriving = (distance / MPG) * PPG; 
		System.out.println("The cost of driving is $" 
				+ (double)(int)(costOfDriving * 100) / 100);
	}

}
