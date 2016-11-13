package dice;


import symbols.Blank_Icon_Symbol;
import symbols.Failure_Icon_Symbol;
import symbols.Setback_Dice_Symbol;
import symbols.Threat_Icon_Symbol;

public class SetbackDice extends W006Dice {

	public SetbackDice() {
		super(DiceType.SetbackDice, new Setback_Dice_Symbol());
		
		face_symbols.add(new Blank_Icon_Symbol());
		face_symbols.add(new Blank_Icon_Symbol());
		face_symbols.add(new Failure_Icon_Symbol());
		face_symbols.add(new Failure_Icon_Symbol());
		face_symbols.add(new Threat_Icon_Symbol());
		face_symbols.add(new Threat_Icon_Symbol());
	}
	
	public SetbackDice(byte[] seed) {
		super(DiceType.SetbackDice, new Setback_Dice_Symbol(), seed);

		face_symbols.add(new Blank_Icon_Symbol());
		face_symbols.add(new Blank_Icon_Symbol());
		face_symbols.add(new Failure_Icon_Symbol());
		face_symbols.add(new Failure_Icon_Symbol());
		face_symbols.add(new Threat_Icon_Symbol());
		face_symbols.add(new Threat_Icon_Symbol());
	}
}
