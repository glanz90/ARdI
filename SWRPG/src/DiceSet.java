import java.util.Iterator;
import java.util.LinkedList;

import dice.Dice;
import symbols.Icon_Symbol;

public class DiceSet implements Iterable<Dice>{

	private LinkedList<Dice> diceSet;
	private int numberOfDice[] = new int[8];
	
	public DiceSet()
	{
		diceSet = new LinkedList<Dice>();
		
		for(int i : numberOfDice){
			numberOfDice[i] = 0;
		}
	}
	
	public void newDiceToSet(Dice newDice) {
		int offset = 0;
			
		switch(newDice.getDiceType()) {
		
		case W100Dice:
			diceSet.add(offset, newDice);
			numberOfDice[0]++;
		break;
		
		case BoostDice:
			offset = numberOfDice[0];
			diceSet.add(offset, newDice);
			numberOfDice[2]++;
		break;

		case AbilityDice:
			offset = numberOfDice[0] + numberOfDice[1];
			diceSet.add(offset, newDice);
			numberOfDice[3]++;
		break;
		
		case ProficiencyDice:
			offset = numberOfDice[0] + numberOfDice[1] + numberOfDice[2];
			diceSet.add(offset, newDice);
			numberOfDice[4]++;
		break;

		case SetbackDice:
			offset = numberOfDice[0] + numberOfDice[1] + numberOfDice[2] + numberOfDice[3];
			diceSet.add(offset, newDice);
			numberOfDice[5]++;
		break;

		case DifficultyDice:
			offset = numberOfDice[0] + numberOfDice[1] + numberOfDice[2] + numberOfDice[3] + numberOfDice[4];
			diceSet.add(offset, newDice);
			numberOfDice[6]++;
		break;

		case ChallengeDice:
			offset = numberOfDice[0] + numberOfDice[1] + numberOfDice[2] + numberOfDice[3] + numberOfDice[4] + numberOfDice[5];
			diceSet.add(offset, newDice);
			numberOfDice[7]++;
		break;
		
		case ForceDice:
			offset = numberOfDice[0] + numberOfDice[1] + numberOfDice[2] + numberOfDice[3] + numberOfDice[4] + numberOfDice[5] + numberOfDice[6];
			diceSet.add(offset, newDice);
			numberOfDice[1]++;
		break;
		
		default:
			throw new AssertionError("This Type of Dice is not in the Game");
		}
	}

	@Override
	public Iterator<Dice> iterator() {
		return diceSet.iterator();
	}

	public int[] getNumberOfDice() {
		return numberOfDice;
	}
	
	public String toString()
	{
		String retString = "Diceset: ";

			retString += "\n   W100 " + numberOfDice[0];
			retString += "\n   Boost " + numberOfDice[1];
			retString += "\n   Ability " + numberOfDice[2];
			retString += "\n   Proficiency " + numberOfDice[3];
			retString += "\n   Setback " + numberOfDice[4];
			retString += "\n   Difficulty " + numberOfDice[5];
			retString += "\n   Challenge " + numberOfDice[6];
			retString += "\n   Force " + numberOfDice[7];
		
		return retString;
	}
	
	public LinkedList<Icon_Symbol> getDiceRoll() {
		LinkedList<Icon_Symbol> roll = new LinkedList<Icon_Symbol>();
		
		for(Dice nextDice : diceSet) {
			roll.add(nextDice.getThrow());
		}
		
		return roll;
	}

}

