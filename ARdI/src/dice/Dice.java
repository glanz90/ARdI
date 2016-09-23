package dice;

import java.util.Random;

public class Dice implements Diceable {

	private Random rand;
	private int sides;
	
	Dice(int sides) {
		sides = this.sides;
		rand = new Random();
	}


	@Override
	public int getValue() {
		// TODO Auto-generated method stub
		return 0;
	}

}
