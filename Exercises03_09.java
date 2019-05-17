
import java.util.Scanner;
public class Exercises03_09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the first 9 digits of an ISBN as integer: ");
		int ISBN_9 = input.nextInt();
		System.out.println(ISBN_9);
		int firstDigit, secondDigit, thirdDigit, fourthDigit, fifthDigit, sixthDigit,
			seventhDigit, eighthDigit, ninthDigit, tenthDigit;//, testDigit;
		firstDigit = (ISBN_9 / 100000000) % 10;
		secondDigit = (ISBN_9/ 10000000) % 10;
		thirdDigit = (ISBN_9 / 1000000) % 10;
		fourthDigit = (ISBN_9 / 100000) % 10;
		fifthDigit = (ISBN_9 / 10000) % 10;
		sixthDigit = (ISBN_9 / 1000) % 10;
		seventhDigit = (ISBN_9 / 100) % 10;
		eighthDigit = (ISBN_9 / 10) % 10;
		ninthDigit = ISBN_9 % 10;
		tenthDigit = (firstDigit*1 + secondDigit*2 + thirdDigit*3 + fourthDigit*4
				+ fifthDigit*5 + sixthDigit*6 + seventhDigit*7 + eighthDigit*8
				+ ninthDigit*9) % 11;
		if(tenthDigit == 10) System.out.println("The ISBN-10 number is " + ISBN_9 + "X");
		else System.out.println("The ISBN-10 number is " + ISBN_9 + "" + tenthDigit);
//		System.out.println(ISBN);
//		testDigit = ISBN /100 % 10;
//		System.out.println(testDigit);
	}

}
