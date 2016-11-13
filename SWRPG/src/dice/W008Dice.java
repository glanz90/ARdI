package dice;

import java.util.LinkedList;

import symbols.DiceSymbols.Dice_Symbol;
import symbols.DiceSymbols.W008_Dice_Symbol;
import symbols.IconSymbols.IconSymbol;

public class W008Dice extends Dice {

	public W008Dice() {
		super(8, DiceType.W008Dice, new W008_Dice_Symbol());
		//to do add symbols
	}
	
	public W008Dice(byte[] seed) {
		super(8, DiceType.W008Dice, new W008_Dice_Symbol(), seed);
	}
	
	public W008Dice(Dice_Symbol dice_symbol) {
		super(8, DiceType.W008Dice, dice_symbol);
	}

	public W008Dice(Dice_Symbol dice_symbol, byte[] seed) {
		super(8, DiceType.W008Dice, dice_symbol, seed);
	}
	
	public W008Dice(Dice_Symbol dice_symbol, LinkedList<IconSymbol> face_symbols) {
		super(8, DiceType.W008Dice, dice_symbol, face_symbols);
	}

	public W008Dice(Dice_Symbol dice_symbol, LinkedList<IconSymbol> face_symbols, byte[] seed) {
		super(8, DiceType.W008Dice, dice_symbol, face_symbols, seed);
	}
	
	//----------------------------------------------------------------------------------------
	
	public W008Dice(DiceType type) {
		super(8, type, new W008_Dice_Symbol());
		//to do add symbols
	}
	
	public W008Dice(DiceType type, byte[] seed) {
		super(8, type, new W008_Dice_Symbol(), seed);
	}
	
	public W008Dice(DiceType type, Dice_Symbol dice_symbol) {
		super(8, type, dice_symbol);
	}

	public W008Dice(DiceType type, Dice_Symbol dice_symbol, byte[] seed) {
		super(8, type, dice_symbol, seed);
	}
	
	public W008Dice(DiceType type, Dice_Symbol dice_symbol, LinkedList<IconSymbol> face_symbols) {
		super(8, type, dice_symbol, face_symbols);
	}

	public W008Dice(DiceType type, Dice_Symbol dice_symbol, LinkedList<IconSymbol> face_symbols, byte[] seed) {
		super(8, type, dice_symbol, face_symbols, seed);
	}

}
