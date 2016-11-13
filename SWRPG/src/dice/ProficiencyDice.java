package dice;

import symbols.DiceSymbols.Proficiency_Dice_Symbol;
import symbols.IconSymbols.AdvantageIconSymbol;
import symbols.IconSymbols.BlankIconSymbol;
import symbols.IconSymbols.DoubleAdvantageIconSymbol;
import symbols.IconSymbols.DoubleSuccessIconSymbol;
import symbols.IconSymbols.SuccessAdvantageIconSymbol;
import symbols.IconSymbols.SuccessIconSymbol;
import symbols.IconSymbols.TriumphIconSymbol;

public class ProficiencyDice extends W012Dice {
	
	public ProficiencyDice() {
		super(DiceType.ProficiencyDice, new Proficiency_Dice_Symbol());
		
		face_symbols.add(new BlankIconSymbol());
		face_symbols.add(new SuccessIconSymbol());
		face_symbols.add(new SuccessIconSymbol());
		face_symbols.add(new DoubleSuccessIconSymbol());
		face_symbols.add(new DoubleSuccessIconSymbol());
		face_symbols.add(new AdvantageIconSymbol());
		face_symbols.add(new SuccessAdvantageIconSymbol());
		face_symbols.add(new SuccessAdvantageIconSymbol());
		face_symbols.add(new SuccessAdvantageIconSymbol());
		face_symbols.add(new DoubleAdvantageIconSymbol());
		face_symbols.add(new DoubleAdvantageIconSymbol());
		face_symbols.add(new TriumphIconSymbol());
	}

	public ProficiencyDice(byte[] seed) {
		super(DiceType.ProficiencyDice, new Proficiency_Dice_Symbol(), seed);
		
		face_symbols.add(new BlankIconSymbol());
		face_symbols.add(new SuccessIconSymbol());
		face_symbols.add(new SuccessIconSymbol());
		face_symbols.add(new DoubleSuccessIconSymbol());
		face_symbols.add(new DoubleSuccessIconSymbol());
		face_symbols.add(new AdvantageIconSymbol());
		face_symbols.add(new SuccessAdvantageIconSymbol());
		face_symbols.add(new SuccessAdvantageIconSymbol());
		face_symbols.add(new SuccessAdvantageIconSymbol());
		face_symbols.add(new DoubleAdvantageIconSymbol());
		face_symbols.add(new DoubleAdvantageIconSymbol());
		face_symbols.add(new TriumphIconSymbol());
	}
}
