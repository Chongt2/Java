package package0;
import java.util.Scanner;
public class Exercises02_22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter an integer amount, for example 1156: ");
		int amount = input.nextInt();
		int remainingAmount = amount;
		int numberOfOneDollars = remainingAmount / 100;
		remainingAmount = remainingAmount % 100;
		int numberOfQuarters = remainingAmount / 25;
		remainingAmount = remainingAmount % 25;
		int numberOfDimes = remainingAmount / 10;
		remainingAmount = remainingAmount % 10;
		int numberOfNickels = remainingAmount / 5;
		remainingAmount = remainingAmount % 5;
		int numberOfPennies = remainingAmount;
		
		System.out.println("Your amount " + amount + " consists of");
		System.out.println("     " + numberOfOneDollars + " dollars");
		System.out.println("     " + numberOfQuarters + " quarters");
		System.out.println("     " + numberOfDimes + " dimes");
		System.out.println("     " + numberOfNickels + " nickels");
		System.out.println("     " + numberOfPennies + " pennies");
	}

}
