package package0;
import java.util.Scanner;
public class Exercises02_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the amount of water in kilograms: ");
		float kilograms = input.nextFloat();
		System.out.println("Enter the initial temperature: ");
		float initialTemp = input.nextFloat();
		System.out.println("Enter the final temperature: ");
		float finalTemp = input.nextFloat();
		float energyNeeded = kilograms * (finalTemp - initialTemp) * 4184;
		System.out.println("The energy needed is " + energyNeeded);
	}

}
