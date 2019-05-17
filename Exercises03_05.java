import java.util.Scanner;
public class Exercises03_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter today's day: ");
		int todaysDay = input.nextInt();
		System.out.print("Enter the number of days elapsed since today: ");
		int elapsedDays = input.nextInt();
		String todayName = null, futureName = null;
		switch (todaysDay % 7) {
		case 0: todayName = "Sunday"; break;
		case 1: todayName = "Monday"; break;
		case 2: todayName = "Tuesday"; break;
		case 3: todayName = "Wednesday"; break;
		case 4: todayName = "Thursday"; break;
		case 5: todayName = "Friday"; break;
		case 6: todayName = "Saturday";
		}
		switch (todaysDay + elapsedDays % 7) {
		case 0: futureName = "Sunday"; break;
		case 1: futureName = "Monday"; break;
		case 2: futureName = "Tuesday"; break;
		case 3: futureName = "Wednesday"; break;
		case 4: futureName = "Thursday"; break;
		case 5: futureName = "Friday"; break;
		case 6: futureName = "Saturday";
		}
		System.out.print("Today is " + todayName + " and the future day is " + futureName);
	}

}
