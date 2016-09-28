package dice;

import java.util.LinkedList;

import symbols.Dice_Symbol;
import symbols.Icon_Symbol;

public abstract class Dice_12 extends Dice {

	public Dice_12() {
		super(12);
		//to do add symbols
	}
	
	public Dice_12(long seed) {
		super(12, seed);
	}
	
	public Dice_12(Dice_Symbol dice_symbol) {
		super(12, dice_symbol);
	}

	public Dice_12(Dice_Symbol dice_symbol, long seed) {
		super(12, dice_symbol, seed);
	}
	
	public Dice_12(Dice_Symbol dice_symbol, LinkedList<Icon_Symbol> face_symbols) {
		super(12, dice_symbol, face_symbols);
	}

	public Dice_12(Dice_Symbol dice_symbol, LinkedList<Icon_Symbol> face_symbols, long seed) {
		super(12, dice_symbol, face_symbols, seed);
	}

}
