package package0;
import java.util.Scanner;
public class Exercises02_05 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int subtotal;
		float totalCost, gratuity, gratuityRate;
		System.out.print("Enter the subtotal and a gratuity rate: ");
		subtotal = input.nextInt(); gratuityRate = input.nextFloat() / 100;
		gratuity = subtotal * gratuityRate;
		totalCost = subtotal + gratuity;
		System.out.println("The gratuity is $" + gratuity + " and total is $" + totalCost);
	}
}
