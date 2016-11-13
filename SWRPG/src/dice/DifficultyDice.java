package dice;

import symbols.Blank_Icon_Symbol;
import symbols.Difficulty_Dice_Symbol;
import symbols.Double_Failure_Icon_Symbol;
import symbols.Double_Threat_Icon_Symbol;
import symbols.Failure_Icon_Symbol;
import symbols.Failure_Threat_Icon_Symbol;
import symbols.Threat_Icon_Symbol;

public class DifficultyDice extends W008Dice {

	public DifficultyDice() {
		super(DiceType.DifficultyDice, new Difficulty_Dice_Symbol());
		
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
		super(DiceType.DifficultyDice, new Difficulty_Dice_Symbol(), seed);
		
		face_symbols.add(new Blank_Icon_Symbol());
		face_symbols.add(new Failure_Icon_Symbol());
		face_symbols.add(new Double_Failure_Icon_Symbol());
		face_symbols.add(new Threat_Icon_Symbol());
		face_symbols.add(new Threat_Icon_Symbol());
		face_symbols.add(new Threat_Icon_Symbol());
		face_symbols.add(new Double_Threat_Icon_Symbol());
		face_symbols.add(new Failure_Threat_Icon_Symbol());
	}
}
