package dice;

import symbols.Ability_Dice_Symbol;
import symbols.Advantage_Icon_Symbol;
import symbols.Blank_Icon_Symbol;
import symbols.Double_Advantage_Icon_Symbol;
import symbols.Double_Success_Icon_Symbol;
import symbols.Success_Advantage_Icon_Symbol;
import symbols.Success_Icon_Symbol;

public class AbilityDice extends W008Dice {

	public AbilityDice() {
		super(DiceType.AbilityDice, new Ability_Dice_Symbol());

		
		face_symbols.add(new Blank_Icon_Symbol());
		face_symbols.add(new Success_Icon_Symbol());
		face_symbols.add(new Success_Icon_Symbol());
		face_symbols.add(new Double_Success_Icon_Symbol());
		face_symbols.add(new Advantage_Icon_Symbol());
		face_symbols.add(new Advantage_Icon_Symbol());
		face_symbols.add(new Success_Advantage_Icon_Symbol());
		face_symbols.add(new Double_Advantage_Icon_Symbol());
	}

	public AbilityDice(byte[] seed) {
		super(DiceType.AbilityDice, new Ability_Dice_Symbol(), seed);
		
		face_symbols.add(new Blank_Icon_Symbol());
		face_symbols.add(new Success_Icon_Symbol());
		face_symbols.add(new Success_Icon_Symbol());
		face_symbols.add(new Double_Success_Icon_Symbol());
		face_symbols.add(new Advantage_Icon_Symbol());
		face_symbols.add(new Advantage_Icon_Symbol());
		face_symbols.add(new Success_Advantage_Icon_Symbol());
		face_symbols.add(new Double_Advantage_Icon_Symbol());
	}

}
