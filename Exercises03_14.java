import java.util.Scanner;
public class Exercises03_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int cFlip = (int)(Math.random() * 100 % 2);
		System.out.println("Guess 0 for Heads 1 for Tails: ");
		int cInput = input.nextInt();
		if(cFlip == cInput) System.out.println("Correct!" + cFlip);
		else System.out.println("Incorrect!" + cFlip);
	}

}
