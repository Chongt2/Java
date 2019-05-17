package package0;
import java.util.Scanner;
public class Exercises02_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the monthly saving amount: ");
		double monthlySaving = input.nextDouble() * 100;
		double monthlyIntRate = (0.05 / 12);
		int firstMonth, secondMonth, thirdMonth, fourthMonth, fifthMonth, sixthMonth;
		firstMonth = (int)(monthlySaving * (1 + monthlyIntRate));
		System.out.println(firstMonth);
		secondMonth = (int)((firstMonth + monthlySaving) * (1 + monthlyIntRate));
		System.out.println(secondMonth);
		thirdMonth = (int)((secondMonth + monthlySaving) * (1 + monthlyIntRate));
		System.out.println(thirdMonth);
		fourthMonth = (int)((thirdMonth + monthlySaving) * (1 + monthlyIntRate));
		System.out.println(fourthMonth);
		fifthMonth = (int)((fourthMonth + monthlySaving) * (1 + monthlyIntRate));
		System.out.println(fifthMonth);
		sixthMonth = (int)((fifthMonth + monthlySaving) * (1 + monthlyIntRate));
		System.out.println(monthlyIntRate);
		System.out.println("After the sixth month, the accont value is $" + (sixthMonth / 100) 
				+ "." + (sixthMonth % 100));
	}

}
