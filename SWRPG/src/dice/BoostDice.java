package dice;

import symbols.Advantage_Icon_Symbol;
import symbols.Blank_Icon_Symbol;
import symbols.Boost_Dice_Symbol;
import symbols.Double_Advantage_Icon_Symbol;
import symbols.Success_Advantage_Icon_Symbol;
import symbols.Success_Icon_Symbol;

public class BoostDice extends W006Dice {

	public BoostDice() {
		super(DiceType.BoostDice, new Boost_Dice_Symbol());
		
		face_symbols.add(new Blank_Icon_Symbol());
		face_symbols.add(new Blank_Icon_Symbol());
		face_symbols.add(new Double_Advantage_Icon_Symbol());
		face_symbols.add(new Advantage_Icon_Symbol());
		face_symbols.add(new Success_Advantage_Icon_Symbol());
		face_symbols.add(new Success_Icon_Symbol());
	}
	
	public BoostDice(byte[] seed) {
		super(DiceType.BoostDice, new Boost_Dice_Symbol(), seed);

		face_symbols.add(new Blank_Icon_Symbol());
		face_symbols.add(new Blank_Icon_Symbol());
		face_symbols.add(new Double_Advantage_Icon_Symbol());
		face_symbols.add(new Advantage_Icon_Symbol());
		face_symbols.add(new Success_Advantage_Icon_Symbol());
		face_symbols.add(new Success_Icon_Symbol());
	}

}
