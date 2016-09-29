package dice;

import java.util.LinkedList;

import symbols.Dice_Symbol;
import symbols.Icon_Symbol;

public class W008Dice extends Dice {

	public W008Dice() {
		super(8);
		//to do add symbols
	}
	
	public W008Dice(byte[] seed) {
		super(8, seed);
	}
	
	public W008Dice(Dice_Symbol dice_symbol) {
		super(8, dice_symbol);
	}

	public W008Dice(Dice_Symbol dice_symbol, byte[] seed) {
		super(8, dice_symbol, seed);
	}
	
	public W008Dice(Dice_Symbol dice_symbol, LinkedList<Icon_Symbol> face_symbols) {
		super(8, dice_symbol, face_symbols);
	}

	public W008Dice(Dice_Symbol dice_symbol, LinkedList<Icon_Symbol> face_symbols, byte[] seed) {
		super(8, dice_symbol, face_symbols, seed);
	}
	public String toString() {
		return "W008Dice";
	}
}
