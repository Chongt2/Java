import java.util.Scanner;
public class Exercises03_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a three-digit integer: ");
		int inputnum = input.nextInt();
		int d0 = inputnum % 10, d1 = (inputnum / 10) % 10, d2  = (inputnum / 100) % 10;
		if(d0 == d2) System.out.println(inputnum + " is a palindrome");
		else System.out.println(inputnum + " is not a palindrome");
	}

}
