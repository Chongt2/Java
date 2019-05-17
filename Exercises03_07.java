import java.util.Scanner;
public class Exercises03_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		String dollars = "dollars", quarters = "quarters", dimes = "dimes", 
				nickels = "nickels", pennies = "pennies";
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
		
		if(numberOfOneDollars == 1) {
			dollars = "dollar";
		}
		if(numberOfQuarters == 1) {
			quarters = "quarter";
		}
		if(numberOfDimes == 1) {
			dimes = "dime";
		}
		if(numberOfNickels == 1) {
			nickels = "nickel";
		}
		if(numberOfPennies == 1) {
			pennies = "penny";
		}
		
		System.out.println("Your amount " + amount + " consists of");
		System.out.println("     " + numberOfOneDollars + " " + dollars);
		System.out.println("     " + numberOfQuarters + " " + quarters);
		System.out.println("     " + numberOfDimes + " " + dimes);
		System.out.println("     " + numberOfNickels + " " + nickels);
		System.out.println("     " + numberOfPennies + " " + pennies);
	}

}


