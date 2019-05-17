
public class Exercises03_24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int cardNum = (int)(Math.random() * 52);
		String card, suit;
		if(cardNum >= 0 && cardNum <= 13) suit = " of Clubs";
		else if(cardNum > 13 && cardNum <= 26) suit = " of Diamonds";
		else if(cardNum > 26 && cardNum <= 39) suit = " of Hearts";
		else suit = " of Spades";
		switch(cardNum % 14) {
		case 0: card = "Ace" + suit; break;
		case 1: card = cardNum % 14 + suit; break;
		case 2: card = cardNum % 14 + suit; break;
		case 3: card = cardNum % 14 + suit; break;
		case 4: card = cardNum % 14 + suit; break;
		case 5: card = cardNum % 14 + suit; break;
		case 6: card = cardNum % 14 + suit; break;
		case 7: card = cardNum % 14 + suit; break;
		case 8: card = cardNum % 14+ suit; break;
		case 9: card = cardNum % 14 + suit; break;
		case 10: card = cardNum % 14 + suit; break;
		case 11: card = "Jack" + suit; break;
		case 12: card = "Queen" + suit; break;
		case 13: card = "King" + suit; break;
		default: card = "Joker";
		}
		System.out.println("The card you picked is " + card);
	}

}
