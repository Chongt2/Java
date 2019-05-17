/*
 * Tai-Yin Chong
 * Science: day of the week
 */
import java.util.Scanner;
public class Exercises03_21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int h, q, m, j, k;
		String day;
		System.out.print("Enter year: (e.g., 2012): ");
		k = input.nextInt();
		System.out.print("Enter month: ");
		m = input.nextInt();
		switch (m) {
		case 1: m = 13; k--; break;
		case 2: m = 14; k--;
		}
		j = k/100; k = k%100;
		System.out.print("Enter the day of the month: 1-31 ");
		q = input.nextInt();
		h = (q + (26*(m + 1))/10 + k + k/4 + j/4 + 5*j)%7;
		switch (h) {
		case 0: day = "Saturday"; break;
		case 1: day = "Sunday"; break;
		case 2: day = "Monday"; break;
		case 3: day = "Tuesday"; break;
		case 4: day = "Wednesday"; break;
		case 5: day = "Thursday"; break;
		case 6: day = "Friday"; break;
		default: day = "error";
		}
		System.out.println("Day of the week is " + day);
	}
}
