package dice;

import java.util.LinkedList;

import symbols.Dice_Symbol;
import symbols.Icon_Symbol;

public abstract class Dice_8 extends Dice {

	public Dice_8() {
		super(8);
		//to do add symbols
	}
	
	public Dice_8(long seed) {
		super(8, seed);
	}
	
	public Dice_8(Dice_Symbol dice_symbol) {
		super(8, dice_symbol);
	}

	public Dice_8(Dice_Symbol dice_symbol, long seed) {
		super(8, dice_symbol, seed);
	}
	
	public Dice_8(Dice_Symbol dice_symbol, LinkedList<Icon_Symbol> face_symbols) {
		super(8, dice_symbol, face_symbols);
	}

	public Dice_8(Dice_Symbol dice_symbol, LinkedList<Icon_Symbol> face_symbols, long seed) {
		super(8, dice_symbol, face_symbols, seed);
	}

}
