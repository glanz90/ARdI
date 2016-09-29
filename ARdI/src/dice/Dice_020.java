package dice;

import java.util.LinkedList;

import symbols.Dice_Symbol;
import symbols.Icon_Symbol;

public class Dice_20 extends Dice {

	public Dice_20() {
		super(20);
		//to do add symbols
	}
	
	public Dice_20(long seed) {
		super(20, seed);
	}
	
	public Dice_20(Dice_Symbol dice_symbol) {
		super(20, dice_symbol);
	}

	public Dice_20(Dice_Symbol dice_symbol, long seed) {
		super(20, dice_symbol, seed);
	}
	
	public Dice_20(Dice_Symbol dice_symbol, LinkedList<Icon_Symbol> face_symbols) {
		super(20, dice_symbol, face_symbols);
	}

	public Dice_20(Dice_Symbol dice_symbol, LinkedList<Icon_Symbol> face_symbols, long seed) {
		super(20, dice_symbol, face_symbols, seed);
	}

}
