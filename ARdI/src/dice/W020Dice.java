package dice;

import java.util.LinkedList;

import symbols.Dice_Symbol;
import symbols.Icon_Symbol;

public class W020Dice extends Dice {

	public W020Dice() {
		super(20);
		//to do add symbols
	}
	
	public W020Dice(byte[] seed) {
		super(20, seed);
	}
	
	public W020Dice(Dice_Symbol dice_symbol) {
		super(20, dice_symbol);
	}

	public W020Dice(Dice_Symbol dice_symbol, byte[] seed) {
		super(20, dice_symbol, seed);
	}
	
	public W020Dice(Dice_Symbol dice_symbol, LinkedList<Icon_Symbol> face_symbols) {
		super(20, dice_symbol, face_symbols);
	}

	public W020Dice(Dice_Symbol dice_symbol, LinkedList<Icon_Symbol> face_symbols, byte[] seed) {
		super(20, dice_symbol, face_symbols, seed);
	}
	
	public String toString() {
		return "W020Dice";
	}
}
