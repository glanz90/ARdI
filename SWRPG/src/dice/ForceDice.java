package dice;

import symbols.Darkforce_Icon_Symbol;
import symbols.Double_Darkforce_Icon_Symbol;
import symbols.Double_Lightforce_Icon_Symbol;
import symbols.Force_Dice_Symbol;
import symbols.Lightforce_Icon_Symbol;

public class ForceDice extends W012Dice {

	public ForceDice() {
		super(DiceType.ForceDice, new Force_Dice_Symbol());
		
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
		super(DiceType.ForceDice, new Force_Dice_Symbol(), seed);
		
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
}
