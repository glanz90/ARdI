import java.security.SecureRandom;
import java.util.Arrays;

import ardi_dice.BoostDice;
import dice.Dice;

public class Main {

	public static void main(String[] args) {
		SecureRandom rand = new SecureRandom();
		
		Dice dice = new BoostDice(rand.generateSeed(8));
		
		System.out.println(dice.toString());
		System.out.println(dice.getFaces());
		System.out.println(dice.getValue());
		
		DiceSet set = new DiceSet();
		//set.newDiceToSet(new W020Dice());
		
		int test[] = {3,5,0,1,2,4,5,8};
		
		DicePool pool = new DicePool();
		set = pool.getNewDiceSet(test);
		
		System.out.println(Arrays.toString(set.getNumberOfDice()));
		for(Dice nextDice : set) {
			System.out.println(nextDice.toString());
		}
	}

}
