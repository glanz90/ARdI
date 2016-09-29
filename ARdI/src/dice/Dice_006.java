package dice;

import java.util.LinkedList;

import symbols.Dice_Symbol;
import symbols.Icon_Symbol;

public abstract class Dice_6 extends Dice {

	public Dice_6() {
		super(6);
		//to do add symbols
	}
	
	public Dice_6(long seed) {
		super(6, seed);
	}
	
	public Dice_6(Dice_Symbol dice_symbol) {
		super(6, dice_symbol);
	}

	public Dice_6(Dice_Symbol dice_symbol, long seed) {
		super(6, dice_symbol, seed);
	}
	
	public Dice_6(Dice_Symbol dice_symbol, LinkedList<Icon_Symbol> face_symbols) {
		super(6, dice_symbol, face_symbols);
	}

	public Dice_6(Dice_Symbol dice_symbol, LinkedList<Icon_Symbol> face_symbols, long seed) {
		super(6, dice_symbol, face_symbols, seed);
	}

}
