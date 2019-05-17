import java.util.Scanner;
public class Exercises03_18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter the weight of the package in pounds: ");
		Scanner input = new Scanner(System.in);
		double weight = input.nextDouble();
		if(weight<=1) System.out.println("$3.50");
		else if(weight<=3) System.out.println("$5.50");
		else if(weight<=10) System.out.println("$8.50");
		else if(weight<=20) System.out.println("$10.50");
		else System.out.println("The package cannot be shipped");
	}

}
