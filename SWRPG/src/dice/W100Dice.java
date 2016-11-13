package dice;

import java.util.LinkedList;

import symbols.Dice_Symbol;
import symbols.Icon_Symbol;

public class W100Dice extends Dice {

	public W100Dice() {
		super(100, DiceType.W100Dice);

		//to do add symbols
	}
	
	public W100Dice(byte[] seed) {
		super(100, DiceType.W100Dice, seed);
	}
	
	public W100Dice(Dice_Symbol dice_symbol) {
		super(100, DiceType.W100Dice, dice_symbol);
	}

	public W100Dice(Dice_Symbol dice_symbol, byte[] seed) {
		super(100, DiceType.W100Dice, dice_symbol, seed);
	}
	
	public W100Dice(Dice_Symbol dice_symbol, LinkedList<Icon_Symbol> face_symbols) {
		super(100, DiceType.W100Dice, dice_symbol, face_symbols);
	}

	public W100Dice(Dice_Symbol dice_symbol, LinkedList<Icon_Symbol> face_symbols, byte[] seed) {
		super(100, DiceType.W100Dice, dice_symbol, face_symbols, seed);
	}
	
	//-----------------------------------------------------------------------------------------------
	
	public W100Dice(DiceType type) {
		super(100, type);

		//to do add symbols
	}
	
	public W100Dice(DiceType type, byte[] seed) {
		super(100, type, seed);
	}
	
	public W100Dice(DiceType type, Dice_Symbol dice_symbol) {
		super(100, type, dice_symbol);
	}

	public W100Dice(DiceType type, Dice_Symbol dice_symbol, byte[] seed) {
		super(100, type, dice_symbol, seed);
	}
	
	public W100Dice(DiceType type, Dice_Symbol dice_symbol, LinkedList<Icon_Symbol> face_symbols) {
		super(100, type, dice_symbol, face_symbols);
	}

	public W100Dice(DiceType type, Dice_Symbol dice_symbol, LinkedList<Icon_Symbol> face_symbols, byte[] seed) {
		super(100, type, dice_symbol, face_symbols, seed);
	}
}
