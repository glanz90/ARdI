package dice;

import symbols.DiceSymbols.Boost_Dice_Symbol;
import symbols.IconSymbols.AdvantageIconSymbol;
import symbols.IconSymbols.BlankIconSymbol;
import symbols.IconSymbols.DoubleAdvantageIconSymbol;
import symbols.IconSymbols.SuccessAdvantageIconSymbol;
import symbols.IconSymbols.SuccessIconSymbol;

public class BoostDice extends W006Dice {

	public BoostDice() {
		super(DiceType.BoostDice, new Boost_Dice_Symbol());
		
		face_symbols.add(new BlankIconSymbol());
		face_symbols.add(new BlankIconSymbol());
		face_symbols.add(new DoubleAdvantageIconSymbol());
		face_symbols.add(new AdvantageIconSymbol());
		face_symbols.add(new SuccessAdvantageIconSymbol());
		face_symbols.add(new SuccessIconSymbol());
	}
	
	public BoostDice(byte[] seed) {
		super(DiceType.BoostDice, new Boost_Dice_Symbol(), seed);

		face_symbols.add(new BlankIconSymbol());
		face_symbols.add(new BlankIconSymbol());
		face_symbols.add(new DoubleAdvantageIconSymbol());
		face_symbols.add(new AdvantageIconSymbol());
		face_symbols.add(new SuccessAdvantageIconSymbol());
		face_symbols.add(new SuccessIconSymbol());
	}

}
