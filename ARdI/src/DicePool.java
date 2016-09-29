import java.security.SecureRandom;

import ardi_dice.AbilityDice;
import ardi_dice.BoostDice;
import ardi_dice.ChallengeDice;
import ardi_dice.DifficultyDice;
import ardi_dice.ForceDice;
import ardi_dice.ProficiencyDice;
import ardi_dice.SetbackDice;
import dice.W100Dice;

/**
 * ARdI Dice Set
 * 1x W100
 * 6x ....
 * 
 * @author meisl
 *
 */
public class DicePool {
	
	SecureRandom diceChoice;
	
	SecureRandom w100Rand;
	SecureRandom forceRand;
	SecureRandom boostRand;
	SecureRandom abilityRand;
	SecureRandom proficiencyRand;
	SecureRandom setbackRand;
	SecureRandom difficultyRand;
	SecureRandom challengeRand;
	
	public DicePool() {		
		SecureRandom rand = new SecureRandom();
		
		diceChoice = new SecureRandom(rand.generateSeed(8));
		
		w100Rand = new SecureRandom(rand.generateSeed(8));
		forceRand = new SecureRandom(rand.generateSeed(8));
		boostRand = new SecureRandom(rand.generateSeed(8));
		abilityRand = new SecureRandom(rand.generateSeed(8));
		proficiencyRand = new SecureRandom(rand.generateSeed(8));
		setbackRand = new SecureRandom(rand.generateSeed(8));
		difficultyRand = new SecureRandom(rand.generateSeed(8));
		challengeRand = new SecureRandom(rand.generateSeed(8));
		
	}
	
	public DiceSet getNewDiceSet(int numberOfDice[]) {
		DiceSet set = new DiceSet();
		int i = 0;
		
		for(i = 0; i < numberOfDice[0]; i++) {
			set.newDiceToSet(new W100Dice(w100Rand.generateSeed(8)));
		}
		
		for(i = 0; i < numberOfDice[1]; i++) {
			set.newDiceToSet(new ForceDice(forceRand.generateSeed(8)));
		}
		
		for(i = 0; i < numberOfDice[2]; i++) {
			set.newDiceToSet(new BoostDice(boostRand.generateSeed(8)));
		}
		
		for(i = 0; i < numberOfDice[3]; i++) {
			set.newDiceToSet(new AbilityDice(abilityRand.generateSeed(8)));
		}
		
		for(i = 0; i < numberOfDice[4]; i++) {
			set.newDiceToSet(new ProficiencyDice(proficiencyRand.generateSeed(8)));
		}
		
		for(i = 0; i < numberOfDice[5]; i++) {
			set.newDiceToSet(new SetbackDice(setbackRand.generateSeed(8)));
		}
		
		for(i = 0; i < numberOfDice[6]; i++) {
			set.newDiceToSet(new DifficultyDice(difficultyRand.generateSeed(8)));
		}
		
		for(i = 0; i < numberOfDice[7]; i++) {
			set.newDiceToSet(new ChallengeDice(challengeRand.generateSeed(8)));
		}
		
		return set;
	}
	


}
