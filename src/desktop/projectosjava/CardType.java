package desktop.projectosjava;

public enum CardType {
	
 TWO(1),
 TREE(2),
 FOUR(3),
 FIVE(4),
 SIX(5),
 SEVEN(6),
 JACK(7),
 QUEEN(8),
 KING(9),
 ACE(10);
 
 
 public int value;
 
 CardType(int val){
	 value = val;
 }
 
}
