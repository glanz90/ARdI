package dice;

import symbols.Blank_Icon_Symbol;
import symbols.Challenge_Dice_Symbol;
import symbols.Despair_Icon_Symbol;
import symbols.Double_Failure_Icon_Symbol;
import symbols.Double_Threat_Icon_Symbol;
import symbols.Failure_Icon_Symbol;
import symbols.Failure_Threat_Icon_Symbol;
import symbols.Threat_Icon_Symbol;

public class ChallengeDice extends W012Dice {

	public ChallengeDice() {
		super(DiceType.ChallengeDice, new Challenge_Dice_Symbol());
		
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

	public ChallengeDice(byte[] seed) {
		super(DiceType.ChallengeDice, new Challenge_Dice_Symbol(), seed);
		
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
