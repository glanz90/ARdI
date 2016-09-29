package dice;

import java.util.LinkedList;

import symbols.Dice_Symbol;
import symbols.Icon_Symbol;

public class W012Dice extends Dice {

	public W012Dice() {
		super(12);
		//to do add symbols
	}
	
	public W012Dice(byte[] seed) {
		super(12, seed);
	}
	
	public W012Dice(Dice_Symbol dice_symbol) {
		super(12, dice_symbol);
	}

	public W012Dice(Dice_Symbol dice_symbol, byte[] seed) {
		super(12, dice_symbol, seed);
	}
	
	public W012Dice(Dice_Symbol dice_symbol, LinkedList<Icon_Symbol> face_symbols) {
		super(12, dice_symbol, face_symbols);
	}

	public W012Dice(Dice_Symbol dice_symbol, LinkedList<Icon_Symbol> face_symbols, byte[] seed) {
		super(12, dice_symbol, face_symbols, seed);
	}
	
	public String toString() {
		return "W012Dice";
	}
}
