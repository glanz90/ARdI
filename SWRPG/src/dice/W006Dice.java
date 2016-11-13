package dice;

import java.util.LinkedList;

import symbols.Dice_Symbol;
import symbols.Icon_Symbol;
import symbols.W006_Dice_Symbol;

public class W006Dice extends Dice {

	//to do add symbols
	
	public W006Dice() {
		super(6, DiceType.W006Dice, new W006_Dice_Symbol());
		//to do add symbols
	}
	
	public W006Dice(byte[] seed) {
		super(6, DiceType.W006Dice, new W006_Dice_Symbol(), seed);
	}
	
	public W006Dice(Dice_Symbol dice_symbol) {
		super(6, DiceType.W006Dice, dice_symbol);
	}

	public W006Dice(Dice_Symbol dice_symbol, byte[] seed) {
		super(6, DiceType.W006Dice, dice_symbol, seed);
	}
	
	public W006Dice(Dice_Symbol dice_symbol, LinkedList<Icon_Symbol> face_symbols) {
		super(6, DiceType.W006Dice, dice_symbol, face_symbols);
	}

	public W006Dice(Dice_Symbol dice_symbol, LinkedList<Icon_Symbol> face_symbols, byte[] seed) {
		super(6, DiceType.W006Dice, dice_symbol, face_symbols, seed);
	}
	
	//------------------------------------------------------------------------------------------
	
	public W006Dice(DiceType type) {
		super(6, type);
		//to do add symbols
	}
	
	public W006Dice(DiceType type, byte[] seed) {
		super(6, type, seed);
		//to do add symbols
	}
	
	public W006Dice(DiceType type, Dice_Symbol dice_symbol) {
		super(6, type, dice_symbol);
	}

	public W006Dice(DiceType type, Dice_Symbol dice_symbol, byte[] seed) {
		super(6, type, dice_symbol, seed);
	}
	
	public W006Dice(DiceType type, Dice_Symbol dice_symbol, LinkedList<Icon_Symbol> face_symbols) {
		super(6, type, dice_symbol, face_symbols);
	}

	public W006Dice(DiceType type, Dice_Symbol dice_symbol, LinkedList<Icon_Symbol> face_symbols, byte[] seed) {
		super(6, type, dice_symbol, face_symbols, seed);
	}
}
