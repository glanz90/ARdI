import diceroll.DiceRoller;

public class Main {

	public static void main(String[] args) {

		DiceRoller roller = new DiceRoller();
		
		roller.DestenyRoll(4);
		
		System.out.println(roller.toString());
		System.out.println(roller.lastNumberOfDiceToString());
	}
}
