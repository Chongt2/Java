package package0;
import java.util.Scanner;
public class Exercises02_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		double minutes;
		double years, days;
		System.out.println("Enter the number of minutes ");
		minutes = input.nextInt();
		years = minutes / (60 * 24 * 365);
		days = (minutes / (60 * 24)) % 365;
		System.out.println(minutes + " minutes is approximately " + 
		(int)years +" and "+ (int)days + " days");
	}

}
