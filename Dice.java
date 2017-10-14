public class Dice {
			
	private DiceValue value;
	
	public Dice() {
		value =  DiceValue.getRandom();
	}
	
	public DiceValue getValue() {
		return value;
	}

	public DiceValue roll() { //Bug number 4: Every throw is the same for each game (corresponds with the Dice.java)
		return DiceValue.getRandom();
	}		
	
	public String toString() {
		return value.toString();
	}
}
