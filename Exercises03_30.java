import java.util.Scanner;
public class Exercises03_30 {

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
		long currentHour = totalHours % 12;
		if(currentHour == 0) {
			currentHour = 12;
		}
		String output = "Current time is " + currentHour + ":" + currentMinute + ":" + currentSecond;
		if(totalHours % 24 >= 12 && currentHour % 24 != 0) {
			output += " AM";
		}
		else {
			output += " PM";
		}
		System.out.println(output);
	}
}