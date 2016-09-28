package ardi_dice;

import ardi_symbols.Blank_Icon_Symbol;
import ardi_symbols.Challenge_Dice_Symbol;
import ardi_symbols.Despair_Icon_Symbol;
import ardi_symbols.Double_Failure_Icon_Symbol;
import ardi_symbols.Double_Threat_Icon_Symbol;
import ardi_symbols.Failure_Icon_Symbol;
import ardi_symbols.Failure_Threat_Icon_Symbol;
import ardi_symbols.Threat_Icon_Symbol;
import dice.Dice_12;

public class Challenge_Dice extends Dice_12 {

	public Challenge_Dice() {
		super(new Challenge_Dice_Symbol());
		
		face_symbols.add(new Blank_Icon_Symbol());
		face_symbols.add(new Failure_Icon_Symbol());
		face_symbols.add(new Failure_Icon_Symbol());
		face_symbols.add(new Double_Failure_Icon_Symbol());
		face_symbols.add(new Double_Failure_Icon_Symbol());
		face_symbols.add(new Threat_Icon_Symbol());
		face_symbols.add(new Threat_Icon_Symbol());
		face_symbols.add(new Failure_Threat_Icon_Symbol());
		face_symbols.add(new Failure_Threat_Icon_Symbol());
		face_symbols.add(new Double_Threat_Icon_Symbol());
		face_symbols.add(new Double_Threat_Icon_Symbol());
		face_symbols.add(new Despair_Icon_Symbol());
	}

	public Challenge_Dice(long seed) {
		super(new Challenge_Dice_Symbol(), seed);
		
		face_symbols.add(new Blank_Icon_Symbol());
		face_symbols.add(new Failure_Icon_Symbol());
		face_symbols.add(new Failure_Icon_Symbol());
		face_symbols.add(new Double_Failure_Icon_Symbol());
		face_symbols.add(new Double_Failure_Icon_Symbol());
		face_symbols.add(new Threat_Icon_Symbol());
		face_symbols.add(new Threat_Icon_Symbol());
		face_symbols.add(new Failure_Threat_Icon_Symbol());
		face_symbols.add(new Failure_Threat_Icon_Symbol());
		face_symbols.add(new Double_Threat_Icon_Symbol());
		face_symbols.add(new Double_Threat_Icon_Symbol());
		face_symbols.add(new Despair_Icon_Symbol());
	}
}
