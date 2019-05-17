package package0;
import java.util.Scanner;
public class Exercises02_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the radius and length of a clyinder: ");
		double radius = input.nextDouble();
		double length = input.nextDouble();
		double area, volume;
		area = radius * radius * Math.PI;
		volume = area * length;
		System.out.println("The area is " + area);
		System.out.println("The volume is " + volume);
	}
}
