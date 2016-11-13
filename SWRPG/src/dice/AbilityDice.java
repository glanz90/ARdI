package dice;

import symbols.DiceSymbols.Ability_Dice_Symbol;
import symbols.IconSymbols.AdvantageIconSymbol;
import symbols.IconSymbols.BlankIconSymbol;
import symbols.IconSymbols.DoubleAdvantageIconSymbol;
import symbols.IconSymbols.DoubleSuccessIconSymbol;
import symbols.IconSymbols.SuccessAdvantageIconSymbol;
import symbols.IconSymbols.SuccessIconSymbol;

public class AbilityDice extends W008Dice {

	public AbilityDice() {
		super(DiceType.AbilityDice, new Ability_Dice_Symbol());

		
		face_symbols.add(new BlankIconSymbol());
		face_symbols.add(new SuccessIconSymbol());
		face_symbols.add(new SuccessIconSymbol());
		face_symbols.add(new DoubleSuccessIconSymbol());
		face_symbols.add(new AdvantageIconSymbol());
		face_symbols.add(new AdvantageIconSymbol());
		face_symbols.add(new SuccessAdvantageIconSymbol());
		face_symbols.add(new DoubleAdvantageIconSymbol());
	}

	public AbilityDice(byte[] seed) {
		super(DiceType.AbilityDice, new Ability_Dice_Symbol(), seed);
		
		face_symbols.add(new BlankIconSymbol());
		face_symbols.add(new SuccessIconSymbol());
		face_symbols.add(new SuccessIconSymbol());
		face_symbols.add(new DoubleSuccessIconSymbol());
		face_symbols.add(new AdvantageIconSymbol());
		face_symbols.add(new AdvantageIconSymbol());
		face_symbols.add(new SuccessAdvantageIconSymbol());
		face_symbols.add(new DoubleAdvantageIconSymbol());
	}

}
