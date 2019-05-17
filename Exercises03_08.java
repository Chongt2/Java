import java.util.Scanner;
public class Exercises03_08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter three numbers: ");
		int num1 = input.nextInt();
		int num2 = input.nextInt();
		int num3 = input.nextInt();
		if(num1 >= num2) {
			if(num2 >= num3) System.out.println(num1 + " " + num2 + " " + num3);
			else if(num3 >= num2) System.out.println(num1 + " " + num3 + " " + num2);
		}
		else if(num2 >= num3) {
			if(num3 >= num1) System.out.println(num2 + " " + num3 + " " + num1);
			else if(num1 >= num3) System.out.println(num2 + " " + num1 + " " + num3);
		}
		else if(num3 >= num1){
			if(num1 >= num2) System.out.println(num3 + " " + num1 + " " + num2);
			else if(num2 >= num1) System.out.println(num3 + " " + num2 + " " + num1);
		}
	}

}
