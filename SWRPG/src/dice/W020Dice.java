package dice;

import java.util.LinkedList;

import symbols.Dice_Symbol;
import symbols.Icon_Symbol;

public class W020Dice extends Dice {

	public W020Dice() {
		super(20, DiceType.W020Dice);

		//to do add symbols
	}
	
	public W020Dice(byte[] seed) {
		super(20, DiceType.W020Dice, seed);
	}
	
	public W020Dice(Dice_Symbol dice_symbol) {
		super(20, DiceType.W020Dice, dice_symbol);
	}

	public W020Dice(Dice_Symbol dice_symbol, byte[] seed) {
		super(20, DiceType.W020Dice, dice_symbol, seed);
	}
	
	public W020Dice(Dice_Symbol dice_symbol, LinkedList<Icon_Symbol> face_symbols) {
		super(20, DiceType.W020Dice, dice_symbol, face_symbols);
	}

	public W020Dice(Dice_Symbol dice_symbol, LinkedList<Icon_Symbol> face_symbols, byte[] seed) {
		super(20, DiceType.W020Dice, dice_symbol, face_symbols, seed);
	}
	
	//-----------------------------------------------------------------------------------------------
	
	public W020Dice(DiceType type) {
		super(20, type);

		//to do add symbols
	}
	
	public W020Dice(DiceType type, byte[] seed) {
		super(20, type, seed);
	}
	
	public W020Dice(DiceType type, Dice_Symbol dice_symbol) {
		super(20, type, dice_symbol);
	}

	public W020Dice(DiceType type, Dice_Symbol dice_symbol, byte[] seed) {
		super(20, type, dice_symbol, seed);
	}
	
	public W020Dice(DiceType type, Dice_Symbol dice_symbol, LinkedList<Icon_Symbol> face_symbols) {
		super(20, type, dice_symbol, face_symbols);
	}

	public W020Dice(DiceType type, Dice_Symbol dice_symbol, LinkedList<Icon_Symbol> face_symbols, byte[] seed) {
		super(20, type, dice_symbol, face_symbols, seed);
	}
}
