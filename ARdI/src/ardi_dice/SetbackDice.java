package ardi_dice;


import ardi_symbols.Blank_Icon_Symbol;
import ardi_symbols.Failure_Icon_Symbol;
import ardi_symbols.Setback_Dice_Symbol;
import ardi_symbols.Threat_Icon_Symbol;
import dice.W006Dice;

public class SetbackDice extends W006Dice {

	public SetbackDice() {
		super(new Setback_Dice_Symbol());
		
		face_symbols.add(new Blank_Icon_Symbol());
		face_symbols.add(new Blank_Icon_Symbol());
		face_symbols.add(new Failure_Icon_Symbol());
		face_symbols.add(new Failure_Icon_Symbol());
		face_symbols.add(new Threat_Icon_Symbol());
		face_symbols.add(new Threat_Icon_Symbol());
	}
	
	public SetbackDice(byte[] seed) {
		super(new Setback_Dice_Symbol(), seed);

		face_symbols.add(new Blank_Icon_Symbol());
		face_symbols.add(new Blank_Icon_Symbol());
		face_symbols.add(new Failure_Icon_Symbol());
		face_symbols.add(new Failure_Icon_Symbol());
		face_symbols.add(new Threat_Icon_Symbol());
		face_symbols.add(new Threat_Icon_Symbol());
	}
	
	public String toString() {
		return "SetbackDice";
	}
}
