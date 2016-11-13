import java.lang.reflect.Array;
import java.security.SecureRandom;
import dice.AbilityDice;
import dice.BoostDice;
import dice.ChallengeDice;
import dice.DifficultyDice;
import dice.ForceDice;
import dice.ProficiencyDice;
import dice.SetbackDice;
import dice.W100Dice;

/**
 * ARdI Dice Set
 *
 * 
 * @author meisl
 *
 */
public class DicePool {
	
	private SecureRandom w100Rand;
	private SecureRandom boostRand;
	private SecureRandom abilityRand;
	private SecureRandom proficiencyRand;
	private SecureRandom setbackRand;
	private SecureRandom difficultyRand;
	private SecureRandom challengeRand;
	private SecureRandom forceRand;
	
	private static final String[] pool = new String[8];
		
	public DicePool() {		
		SecureRandom rand = new SecureRandom();
		
		pool[0] = "W100Dice";
		pool[1] = "BoostDice";
		pool[2] = "AbilityDice";
		pool[3] = "ProficiencyDice";
		pool[4] = "SetbackDice";
		pool[5] = "DifficultyDice";
		pool[6] = "ChallengeDice";
		pool[7] = "ForceDice";
		
		w100Rand = new SecureRandom(rand.generateSeed(8));
		boostRand = new SecureRandom(rand.generateSeed(8));
		abilityRand = new SecureRandom(rand.generateSeed(8));
		proficiencyRand = new SecureRandom(rand.generateSeed(8));
		setbackRand = new SecureRandom(rand.generateSeed(8));
		difficultyRand = new SecureRandom(rand.generateSeed(8));
		challengeRand = new SecureRandom(rand.generateSeed(8));
		forceRand = new SecureRandom(rand.generateSeed(8));
		
	}
	
	public String[] getDicesInPool() {		
		return pool;
	}
	
	public int numberOfDiceTypesInPool() {
		return Array.getLength(pool);
	}
	
	public String getDiceInPool(int pos) {
		return pool[pos];
	}
	
	public DiceSet getNewDiceSet(int numberOfDice[]) {
		DiceSet set = new DiceSet();
		int i = 0;
		
		for(i = 0; i < numberOfDice[0]; i++) {
			set.newDiceToSet(new W100Dice(w100Rand.generateSeed(8)));
		}
				
		for(i = 0; i < numberOfDice[1]; i++) {
			set.newDiceToSet(new BoostDice(boostRand.generateSeed(8)));
		}
		
		for(i = 0; i < numberOfDice[2]; i++) {
			set.newDiceToSet(new AbilityDice(abilityRand.generateSeed(8)));
		}
		
		for(i = 0; i < numberOfDice[3]; i++) {
			set.newDiceToSet(new ProficiencyDice(proficiencyRand.generateSeed(8)));
		}
		
		for(i = 0; i < numberOfDice[4]; i++) {
			set.newDiceToSet(new SetbackDice(setbackRand.generateSeed(8)));
		}
		
		for(i = 0; i < numberOfDice[5]; i++) {
			set.newDiceToSet(new DifficultyDice(difficultyRand.generateSeed(8)));
		}
		
		for(i = 0; i < numberOfDice[6]; i++) {
			set.newDiceToSet(new ChallengeDice(challengeRand.generateSeed(8)));
		}
		
		for(i = 0; i < numberOfDice[7]; i++) {
			set.newDiceToSet(new ForceDice(forceRand.generateSeed(8)));
		}
		
		return set;
	}
	
}
