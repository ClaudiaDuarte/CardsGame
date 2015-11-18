package desktop.projectosjava;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		Game game = new Game(3);
		
		Player[] listOfPlayers = new Player[]{
			new Player("Claudia"), new Player("Bernardo"), new Player("Gina")
		};
		
		ArrayList<Player> winners = game.compareHands(listOfPlayers);
		System.out.println("The following players won the hand: ");
		for (Player p: winners){
			System.out.println(p.getName() + " with card " + p.getHand());
		}
	

	}

}
