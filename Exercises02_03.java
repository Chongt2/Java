package package0;
import java.util.Scanner;
public class Exercises02_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a value for feet: ");
		Scanner input = new Scanner(System.in);
		double feet = input.nextDouble();
		double meters = feet * 0.305;
		System.out.println(feet + " feet is " + meters + " meters");
	}

}
