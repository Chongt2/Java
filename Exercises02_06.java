package package0;
import java.util.Scanner;
public class Exercises02_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number between 0 and 1000: ");
		int testNum = input.nextInt(), firstDigit, secondDigit, thirdDigit, digitSum;
		firstDigit = testNum % 10;
		testNum /= 10;
		secondDigit = testNum % 10;
		testNum /= 10;
		thirdDigit = testNum % 10;
		digitSum = firstDigit + secondDigit + thirdDigit;
		System.out.println("The sum of the digits is " + digitSum);
	}

}
