package ardi_dice;

import ardi_symbols.Blank_Icon_Symbol;
import ardi_symbols.Difficulty_Dice_Symbol;
import ardi_symbols.Double_Failure_Icon_Symbol;
import ardi_symbols.Double_Threat_Icon_Symbol;
import ardi_symbols.Failure_Icon_Symbol;
import ardi_symbols.Failure_Threat_Icon_Symbol;
import ardi_symbols.Threat_Icon_Symbol;
import dice.W008Dice;

public class DifficultyDice extends W008Dice {

	public DifficultyDice() {
		super(new Difficulty_Dice_Symbol());
		
		face_symbols.add(new Blank_Icon_Symbol());
		face_symbols.add(new Failure_Icon_Symbol());
		face_symbols.add(new Double_Failure_Icon_Symbol());
		face_symbols.add(new Threat_Icon_Symbol());
		face_symbols.add(new Threat_Icon_Symbol());
		face_symbols.add(new Threat_Icon_Symbol());
		face_symbols.add(new Double_Threat_Icon_Symbol());
		face_symbols.add(new Failure_Threat_Icon_Symbol());
	}

	public DifficultyDice(byte[] seed) {
		super(new Difficulty_Dice_Symbol(), seed);
		
		face_symbols.add(new Blank_Icon_Symbol());
		face_symbols.add(new Failure_Icon_Symbol());
		face_symbols.add(new Double_Failure_Icon_Symbol());
		face_symbols.add(new Threat_Icon_Symbol());
		face_symbols.add(new Threat_Icon_Symbol());
		face_symbols.add(new Threat_Icon_Symbol());
		face_symbols.add(new Double_Threat_Icon_Symbol());
		face_symbols.add(new Failure_Threat_Icon_Symbol());
	}
	
	public String toString() {
		return "DifficultyDice";
	}
}
