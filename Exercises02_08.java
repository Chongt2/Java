package package0;
import java.util.Scanner;
public class Exercises02_08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the time zone offest to GMT: ");
		long tzOffset = input.nextLong();
		long totalMilliseconds = System.currentTimeMillis();
		long totalSeconds = totalMilliseconds / 1000;
		long currentSecond = totalSeconds % 60;
		long totalMinutes = totalSeconds / 60;
		long currentMinute = totalMinutes % 60;
		long totalHours = (totalMinutes / 60) + tzOffset;
		long currentHour = totalHours % 24;
		System.out.println("Current time is " + currentHour + ":" + currentMinute + ":" + 
		currentSecond + " GMT");
	}

}
