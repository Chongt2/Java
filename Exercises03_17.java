import java.util.Scanner;
public class Exercises03_17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int cChoice = (int)(Math.random() * 3);
		String cName, pName, result;
		System.out.print("scissor (0), rock (1), paper (2): ");
		int pChoice = input.nextInt();
		switch(cChoice) {
		case 0: cName = "scissor"; switch (pChoice) {
			case 0: pName = "scissor"; result = "It is a draw"; break;
			case 1: pName = "rock"; result = "You won"; break; 
			case 2: pName = "paper"; result = "You lost"; break;
			default: pName = "error"; result = "error";
		}  break;
		case 1: cName = "rock"; switch (pChoice) {
			case 0: pName = "scissor"; result = "You lost"; break;
			case 1: pName = "rock"; result = "It is a draw"; break;
			case 2: pName = "paper"; result = "You won"; break;
			default: pName = "error"; result = "error";
		}	break;
		case 2: cName = "paper"; switch (pChoice) {
			case 0: pName = "scissor"; result = "You won"; break;
			case 1: pName = "rock"; result = "You lost"; break; 
			case 2: pName = "paper"; result = "It is a draw"; break;
			default: pName = "error"; result = "error";
		}  	break;
		default: cName = "error"; pName = "error"; result = "error";
		}
		System.out.println("The computer is " + cName + ". You are " + pName 
				+ ". " + result);
	}

}
