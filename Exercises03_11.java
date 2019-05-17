import java.util.Scanner;
public class Exercises03_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter month and year in number form: ");
		int inMonth = input.nextInt();
		int inYear = input.nextInt();
		int days;
		String month;
		switch (inMonth) {
		case 1: month = "January"; days = 31; break;
		case 2: month = "February"; if (inYear % 4 == 0) days = 29; else days = 28; break;
		case 3: month = "March"; days = 31; break;
		case 4: month = "April"; days = 30; break;
		case 5: month = "May"; days = 31; break;
		case 6: month = "June"; days = 31; break;
		case 7: month = "July"; days = 30; break;
		case 8: month = "August"; days = 31; break;
		case 9: month = "September"; days = 31; break;
		case 10: month = "October"; days = 31; break;
		case 11: month = "November"; days = 30; break;
		case 12: month = "December"; days = 31; break;
		default: month = "error"; days = 0;
		}
		System.out.println(month + " "+ inYear + " had " + days + " days");
	}

}
