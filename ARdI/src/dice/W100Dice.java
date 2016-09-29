package dice;

import java.util.LinkedList;

import symbols.Dice_Symbol;
import symbols.Icon_Symbol;

public class W100Dice extends Dice {

	public W100Dice() {
		super(100);
		//to do add symbols
	}
	
	public W100Dice(byte[] seed) {
		super(100, seed);
	}
	
	public W100Dice(Dice_Symbol dice_symbol) {
		super(100, dice_symbol);
	}

	public W100Dice(Dice_Symbol dice_symbol, byte[] seed) {
		super(100, dice_symbol, seed);
	}
	
	public W100Dice(Dice_Symbol dice_symbol, LinkedList<Icon_Symbol> face_symbols) {
		super(100, dice_symbol, face_symbols);
	}

	public W100Dice(Dice_Symbol dice_symbol, LinkedList<Icon_Symbol> face_symbols, byte[] seed) {
		super(100, dice_symbol, face_symbols, seed);
	}
	
	public String toString() {
		return "W100Dice";
	}
}
