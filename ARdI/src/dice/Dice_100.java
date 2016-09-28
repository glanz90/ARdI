package dice;

import java.util.LinkedList;

import symbols.Dice_Symbol;
import symbols.Icon_Symbol;

public abstract class Dice_100 extends Dice {

	public Dice_100() {
		super(100);
		//to do add symbols
	}
	
	public Dice_100(long seed) {
		super(100, seed);
	}
	
	public Dice_100(Dice_Symbol dice_symbol) {
		super(100, dice_symbol);
	}

	public Dice_100(Dice_Symbol dice_symbol, long seed) {
		super(100, dice_symbol, seed);
	}
	
	public Dice_100(Dice_Symbol dice_symbol, LinkedList<Icon_Symbol> face_symbols) {
		super(100, dice_symbol, face_symbols);
	}

	public Dice_100(Dice_Symbol dice_symbol, LinkedList<Icon_Symbol> face_symbols, long seed) {
		super(100, dice_symbol, face_symbols, seed);
	}

}
