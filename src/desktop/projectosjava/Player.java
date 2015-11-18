package desktop.projectosjava;

public class Player {
	
	private String name;
	CardType hand;
	
	
	
	public CardType getHand() {
		return hand;
	}



	public String getName() {
		return name;
	}



	public Player(String name) {
		this.name = name;
		this.hand = chooseHand();
	}



	public CardType chooseHand(){
		int random = (int) (Math.random()*10);
		switch(random){
		case 0: hand = CardType.TWO;
		break;
		case 1: hand = CardType.TREE;
		break;
		case 2: hand = CardType.FOUR;
		break;
		case 3: hand = CardType.FIVE;
		break;
		case 4: hand = CardType.SIX;
		break;
		case 5: hand = CardType.SEVEN;
		break;
		case 6: hand = CardType.JACK;
		break;
		case 7: hand = CardType.QUEEN;
		break;
		case 8: hand = CardType.KING;
		break;
		case 9: hand = CardType.ACE;
		break;
		}
		return hand;
	}

}
