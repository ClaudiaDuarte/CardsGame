package desktop.projectosjava;
import java.util.ArrayList;

public class Game {

	private int numberOfPlayers;
	
	
	public Game(int numberOfPlayers) {
		this.numberOfPlayers = numberOfPlayers;
	}
	
	//compare hands method
	
	public ArrayList<Player> compareHands(Player[] players){
		int winnerCard = 0;
		ArrayList<Player> winners = new ArrayList<Player>();
		
		for(Player p:players){
			if(p.hand.value > winnerCard){
				winnerCard = p.hand.value;
			}
		}
		for(Player p:players){
			if(p.hand.value == winnerCard){
			winners.add(p);	
			}
			
		}
		return winners;
	}
	
}
