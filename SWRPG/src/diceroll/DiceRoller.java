package diceroll;

import java.util.Arrays;

public class DiceRoller {

	private DicePool dicePool;
	
	private DiceSet lastDiceSet;
	private int lastNumberOfDice[];
	
	private EvaluationType lastEvaluation;
	
	public DiceRoller() {
		dicePool = new DicePool();
		lastNumberOfDice = new int[8];
		
		lastEvaluation = EvaluationType.DefaultRoll;
	}

	public void destenyRoll(int numberOfPlayer) {
		resetRoller();
		
		lastNumberOfDice[7] = numberOfPlayer;
		lastDiceSet = dicePool.getNewDiceSet(lastNumberOfDice);
		
		lastEvaluation = EvaluationType.DestenyRoll;
	}
	
	public void obligationRoll() {
		resetRoller();
		
		lastNumberOfDice[0] = 1;	
		lastDiceSet = dicePool.getNewDiceSet(lastNumberOfDice);
		
		lastEvaluation = EvaluationType.ObligationRoll;
	}
	
	public void initiativeRoll(int player[][][]) {
		resetRoller();
		
		lastEvaluation = EvaluationType.InitiativeRoll;
	}
	
	public void skillRoll() {
		
	}
	
	public void combatRoll() {
		
		lastEvaluation = EvaluationType.CombatRoll;
	}
	
	private void resetRoller() {
		lastDiceSet = new DiceSet();
		for(int i : lastNumberOfDice){
			lastNumberOfDice[i] = 0;
		}
		lastEvaluation = EvaluationType.DefaultRoll;
	}
	

	public String toString() {
		return lastDiceSet.toString();
	}
	
	public String lastNumberOfDiceToString() {
		return Arrays.toString(lastNumberOfDice);
	}
	
	public String dicePoolToString() {
		return dicePool.toString();
	}
	
}
