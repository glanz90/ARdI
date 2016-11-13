package dice;

import java.util.LinkedList;

import symbols.Dice_Symbol;
import symbols.Icon_Symbol;

public class W006Dice extends Dice {

	public W006Dice() {
		super(6);
		//to do add symbols
	}
	
	public W006Dice(byte[] seed) {
		super(6, seed);
	}
	
	public W006Dice(Dice_Symbol dice_symbol) {
		super(6, dice_symbol);
	}

	public W006Dice(Dice_Symbol dice_symbol, byte[] seed) {
		super(6, dice_symbol, seed);
	}
	
	public W006Dice(Dice_Symbol dice_symbol, LinkedList<Icon_Symbol> face_symbols) {
		super(6, dice_symbol, face_symbols);
	}

	public W006Dice(Dice_Symbol dice_symbol, LinkedList<Icon_Symbol> face_symbols, byte[] seed) {
		super(6, dice_symbol, face_symbols, seed);
	}

	public String toString() {
		return "W006Dice";
	}

}
