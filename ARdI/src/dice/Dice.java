package dice;

import java.util.LinkedList;
import java.util.Random;

import symbols.Icon_Symbol;


public abstract class Dice implements Diceable {

	private Random rand;
	private int sides;
	protected LinkedList<Icon_Symbol> list;

	public Dice(int sides) {
		sides = this.sides;
		rand = new Random();
		list = new LinkedList<Icon_Symbol>();
	}

	public Dice(int sides, long seed) {
		sides = this.sides;
		rand = new Random(seed);
		list = new LinkedList<Icon_Symbol>();
	}
	
	@Override
	public int getValue() {
		return rand.nextInt(sides);
	}

}
