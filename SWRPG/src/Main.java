import java.security.SecureRandom;
import java.util.Arrays;

import dice.BoostDice;
import dice.Dice;

public class Main {

	public static void main(String[] args) {
		SecureRandom rand = new SecureRandom();
		
		Dice dice = new BoostDice(rand.generateSeed(8));
		
		System.out.println(dice.getDiceType());
		System.out.println(dice.toString());
		System.out.println(dice.getFaces());
		System.out.println(dice.getValue());
		
		DiceSet set = new DiceSet();
		
		int test[] = {3,5,0,1,2,4,5,8};
		
		DicePool pool = new DicePool();
		
		System.out.println(pool.numberOfDiceTypesInPool());
		//System.out.println(Arrays.toString(pool.getDicesInPool()));
		set = pool.getNewDiceSet(test);
		
		System.out.println(set.toString());
		System.out.println(Arrays.toString(set.getNumberOfDice()));
		/*
		for(Dice nextDice : set) {
			System.out.println(nextDice.getDiceType());
		}
		*/
	}
}
