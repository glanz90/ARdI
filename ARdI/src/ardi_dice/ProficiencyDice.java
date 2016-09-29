package ardi_dice;

import ardi_symbols.Advantage_Icon_Symbol;
import ardi_symbols.Blank_Icon_Symbol;
import ardi_symbols.Double_Advantage_Icon_Symbol;
import ardi_symbols.Double_Success_Icon_Symbol;
import ardi_symbols.Proficiency_Dice_Symbol;
import ardi_symbols.Success_Advantage_Icon_Symbol;
import ardi_symbols.Success_Icon_Symbol;
import ardi_symbols.Triumph_Icon_Symbol;
import dice.W012Dice;

public class ProficiencyDice extends W012Dice {
	
	public ProficiencyDice() {
		super(new Proficiency_Dice_Symbol());
		
		face_symbols.add(new Blank_Icon_Symbol());
		face_symbols.add(new Success_Icon_Symbol());
		face_symbols.add(new Success_Icon_Symbol());
		face_symbols.add(new Double_Success_Icon_Symbol());
		face_symbols.add(new Double_Success_Icon_Symbol());
		face_symbols.add(new Advantage_Icon_Symbol());
		face_symbols.add(new Success_Advantage_Icon_Symbol());
		face_symbols.add(new Success_Advantage_Icon_Symbol());
		face_symbols.add(new Success_Advantage_Icon_Symbol());
		face_symbols.add(new Double_Advantage_Icon_Symbol());
		face_symbols.add(new Double_Advantage_Icon_Symbol());
		face_symbols.add(new Triumph_Icon_Symbol());
	}

	public ProficiencyDice(byte[] seed) {
		super(new Proficiency_Dice_Symbol(), seed);
		
		face_symbols.add(new Blank_Icon_Symbol());
		face_symbols.add(new Success_Icon_Symbol());
		face_symbols.add(new Success_Icon_Symbol());
		face_symbols.add(new Double_Success_Icon_Symbol());
		face_symbols.add(new Double_Success_Icon_Symbol());
		face_symbols.add(new Advantage_Icon_Symbol());
		face_symbols.add(new Success_Advantage_Icon_Symbol());
		face_symbols.add(new Success_Advantage_Icon_Symbol());
		face_symbols.add(new Success_Advantage_Icon_Symbol());
		face_symbols.add(new Double_Advantage_Icon_Symbol());
		face_symbols.add(new Double_Advantage_Icon_Symbol());
		face_symbols.add(new Triumph_Icon_Symbol());
	}
	
	public String toString() {
		return "ProficiencyDice";
	}
}
