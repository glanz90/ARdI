import java.util.Iterator;
import java.util.LinkedList;

import dice.Dice;

public class DiceSet implements Iterable<Dice>{

	private LinkedList<Dice> diceSet;
	private int numberOfDice[] = new int[8];
	
	public DiceSet() {
		diceSet = new LinkedList<Dice>();
		
		for(int i : numberOfDice){
			numberOfDice[i] = 0;
		}
	}
	
	//need of copy Constructor??
	/*
	public DiceSet(DiceSet original) {
		//Iterator<Dice> setIter = original.iterator();
		System.arraycopy(original.getNumberOfDice(),0, numberOfDice, 0, 8);
		
		for(Dice nextItem : original) {
			diceSet.add(nextItem); //only shallow copy
		}
		
		//System.arraycopy(original.getNumberOfDice(), 0, numberOfDice, 0, 8);
	}
	*/
	public void newDiceToSet(Dice newDice) {
		int offset = 0;
		
		
		switch(newDice.toString()) {
		case "W100Dice":
			diceSet.add(offset, newDice);
			numberOfDice[0]++;
		break;
		
		case "ForceDice":
			offset = numberOfDice[0];
			diceSet.add(offset, newDice);
			numberOfDice[1]++;
		break;

		case "BoostDice":
			offset = numberOfDice[0] + numberOfDice[1];
			diceSet.add(offset, newDice);
			numberOfDice[2]++;
		break;

		case "AbilityDice":
			offset = numberOfDice[0] + numberOfDice[1] + numberOfDice[2];
			diceSet.add(offset, newDice);
			numberOfDice[3]++;
		break;
		
		case "ProficiencyDice":
			offset = numberOfDice[0] + numberOfDice[1] + numberOfDice[2] + numberOfDice[3];
			diceSet.add(offset, newDice);
			numberOfDice[4]++;
		break;

		case "SetbackDice":
			offset = numberOfDice[0] + numberOfDice[1] + numberOfDice[2] + numberOfDice[3] + numberOfDice[4];
			diceSet.add(offset, newDice);
			numberOfDice[5]++;
		break;

		case "DifficultyDice":
			offset = numberOfDice[0] + numberOfDice[1] + numberOfDice[2] + numberOfDice[3] + numberOfDice[4] + numberOfDice[5];
			diceSet.add(offset, newDice);
			numberOfDice[6]++;
		break;

		case "ChallengeDice":
			offset = numberOfDice[0] + numberOfDice[1] + numberOfDice[2] + numberOfDice[3] + numberOfDice[4] + numberOfDice[5] + numberOfDice[6];
			diceSet.add(offset, newDice);
			numberOfDice[7]++;
		break;
		
		default:
			throw new AssertionError("Dice not in Game");
		}
	}

	@Override
	public Iterator<Dice> iterator() {
		return diceSet.iterator();
	}

	public int[] getNumberOfDice() {
		return numberOfDice;
	}

}

