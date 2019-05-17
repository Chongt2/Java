import java.util.Scanner;
public class Exercises03_26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter an integer: ");
		int inputNum = input.nextInt();
		System.out.println("Is " + inputNum + " divisible by 5 and 6? " + (inputNum % 5 == 0 
				&& inputNum % 6 == 0));
		System.out.println("Is " + inputNum + " divisible by 5 or 6? " + (inputNum % 5 == 0 
				|| inputNum % 6 == 0));
		System.out.println("Is " + inputNum + " divisible by 5 or 6, but not both? " + (inputNum % 5 == 0 
				^ inputNum % 6 == 0));
	}

}
