package dice;

import symbols.Advantage_Icon_Symbol;
import symbols.Blank_Icon_Symbol;
import symbols.Double_Advantage_Icon_Symbol;
import symbols.Double_Success_Icon_Symbol;
import symbols.Proficiency_Dice_Symbol;
import symbols.Success_Advantage_Icon_Symbol;
import symbols.Success_Icon_Symbol;
import symbols.Triumph_Icon_Symbol;

public class ProficiencyDice extends W012Dice {
	
	public ProficiencyDice() {
		super(DiceType.ProficiencyDice, new Proficiency_Dice_Symbol());
		
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
		super(DiceType.ProficiencyDice, new Proficiency_Dice_Symbol(), seed);
		
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
