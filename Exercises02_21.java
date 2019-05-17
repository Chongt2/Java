package package0;
import java.util.Scanner;
public class Exercises02_21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter investment amouont: ");
		double investmentAmount = input.nextDouble();
		System.out.println("Enter annual interest rate in percentage: ");
		double interestRate = input.nextDouble();
		System.out.println("Enter number of years: ");
		int years = input.nextInt();
		double futInvestVal = investmentAmount * Math.pow((1 + (interestRate / 1200)),years * 12);
		System.out.println("Accumulated value is $" + (double)((int)(futInvestVal * 100)) / 100);
	}
}
