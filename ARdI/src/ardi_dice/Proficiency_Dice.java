package ardi_dice;

import ardi_symbols.Advantage_Icon_Symbol;
import ardi_symbols.Blank_Icon_Symbol;
import ardi_symbols.Double_Advantage_Icon_Symbol;
import ardi_symbols.Double_Success_Icon_Symbol;
import ardi_symbols.Proficiency_Dice_Symbol;
import ardi_symbols.Success_Advantage_Icon_Symbol;
import ardi_symbols.Success_Icon_Symbol;
import ardi_symbols.Triumph_Icon_Symbol;
import dice.Dice_12;

public class Proficiency_Dice extends Dice_12 {
	
	public Proficiency_Dice() {
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

	public Proficiency_Dice(long seed) {
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
}
