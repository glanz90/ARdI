package ardi_dice;

import ardi_symbols.Advantage_Icon_Symbol;
import ardi_symbols.Blank_Icon_Symbol;
import ardi_symbols.Boost_Dice_Symbol;
import ardi_symbols.Double_Advantage_Icon_Symbol;
import ardi_symbols.Success_Advantage_Icon_Symbol;
import ardi_symbols.Success_Icon_Symbol;
import dice.W006Dice;

public class BoostDice extends W006Dice {

	public BoostDice() {
		super(new Boost_Dice_Symbol());
		
		face_symbols.add(new Blank_Icon_Symbol());
		face_symbols.add(new Blank_Icon_Symbol());
		face_symbols.add(new Double_Advantage_Icon_Symbol());
		face_symbols.add(new Advantage_Icon_Symbol());
		face_symbols.add(new Success_Advantage_Icon_Symbol());
		face_symbols.add(new Success_Icon_Symbol());
	}
	
	public BoostDice(byte[] seed) {
		super(new Boost_Dice_Symbol(), seed);

		face_symbols.add(new Blank_Icon_Symbol());
		face_symbols.add(new Blank_Icon_Symbol());
		face_symbols.add(new Double_Advantage_Icon_Symbol());
		face_symbols.add(new Advantage_Icon_Symbol());
		face_symbols.add(new Success_Advantage_Icon_Symbol());
		face_symbols.add(new Success_Icon_Symbol());
	}

	public String toString() {
		return "BoostDice";
	}
}
