package dice;

import java.util.LinkedList;

import symbols.DiceSymbols.Dice_Symbol;
import symbols.IconSymbols.IconSymbol;

public class W012Dice extends Dice {

	public W012Dice() {
		super(12, DiceType.W012Dice);
		//to do add symbols
	}
	
	public W012Dice(byte[] seed) {
		super(12, DiceType.W012Dice, seed);
	}
	
	public W012Dice(Dice_Symbol dice_symbol) {
		super(12, DiceType.W012Dice, dice_symbol);
	}

	public W012Dice(Dice_Symbol dice_symbol, byte[] seed) {
		super(12, DiceType.W012Dice, dice_symbol, seed);
	}
	
	public W012Dice(Dice_Symbol dice_symbol, LinkedList<IconSymbol> face_symbols) {
		super(12, DiceType.W012Dice, dice_symbol, face_symbols);
	}

	public W012Dice(Dice_Symbol dice_symbol, LinkedList<IconSymbol> face_symbols, byte[] seed) {
		super(12, DiceType.W012Dice, dice_symbol, face_symbols, seed);
	}
	
	//---------------------------------------------------------------------------------------------

	public W012Dice(DiceType type) {
		super(12, type);
		//to do add symbols
	}
	
	public W012Dice(DiceType type, byte[] seed) {
		super(12, type, seed);
	}
	
	public W012Dice(DiceType type, Dice_Symbol dice_symbol) {
		super(12, type, dice_symbol);
	}

	public W012Dice(DiceType type, Dice_Symbol dice_symbol, byte[] seed) {
		super(12, type, dice_symbol, seed);
	}
	
	public W012Dice(DiceType type, Dice_Symbol dice_symbol, LinkedList<IconSymbol> face_symbols) {
		super(12, type, dice_symbol, face_symbols);
	}

	public W012Dice(DiceType type, Dice_Symbol dice_symbol, LinkedList<IconSymbol> face_symbols, byte[] seed) {
		super(12, type, dice_symbol, face_symbols, seed);
	}
	
}
