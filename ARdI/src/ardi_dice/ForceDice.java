package ardi_dice;

import ardi_symbols.Darkforce_Icon_Symbol;
import ardi_symbols.Double_Darkforce_Icon_Symbol;
import ardi_symbols.Double_Lightforce_Icon_Symbol;
import ardi_symbols.Lightforce_Icon_Symbol;
import dice.W012Dice;
import ardi_symbols.Force_Dice_Symbol;

public class ForceDice extends W012Dice {

	public ForceDice() {
		super(new Force_Dice_Symbol());
		
		face_symbols.add(new Darkforce_Icon_Symbol());
		face_symbols.add(new Darkforce_Icon_Symbol());
		face_symbols.add(new Darkforce_Icon_Symbol());
		face_symbols.add(new Darkforce_Icon_Symbol());
		face_symbols.add(new Darkforce_Icon_Symbol());
		face_symbols.add(new Darkforce_Icon_Symbol());
		face_symbols.add(new Double_Darkforce_Icon_Symbol());
		face_symbols.add(new Lightforce_Icon_Symbol());
		face_symbols.add(new Lightforce_Icon_Symbol());
		face_symbols.add(new Double_Lightforce_Icon_Symbol());
		face_symbols.add(new Double_Lightforce_Icon_Symbol());
		face_symbols.add(new Double_Lightforce_Icon_Symbol());
	}

	public ForceDice(byte[] seed) {
		super(new Force_Dice_Symbol(), seed);
		
		face_symbols.add(new Darkforce_Icon_Symbol());
		face_symbols.add(new Darkforce_Icon_Symbol());
		face_symbols.add(new Darkforce_Icon_Symbol());
		face_symbols.add(new Darkforce_Icon_Symbol());
		face_symbols.add(new Darkforce_Icon_Symbol());
		face_symbols.add(new Darkforce_Icon_Symbol());
		face_symbols.add(new Double_Darkforce_Icon_Symbol());
		face_symbols.add(new Lightforce_Icon_Symbol());
		face_symbols.add(new Lightforce_Icon_Symbol());
		face_symbols.add(new Double_Lightforce_Icon_Symbol());
		face_symbols.add(new Double_Lightforce_Icon_Symbol());
		face_symbols.add(new Double_Lightforce_Icon_Symbol());
	}	
	
	public String toString() {
		return "ForceDice";
	}
}
