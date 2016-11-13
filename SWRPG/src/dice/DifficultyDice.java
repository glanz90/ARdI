package dice;

import symbols.DiceSymbols.Difficulty_Dice_Symbol;
import symbols.IconSymbols.BlankIconSymbol;
import symbols.IconSymbols.DoubleFailureIconSymbol;
import symbols.IconSymbols.DoubleThreatIconSymbol;
import symbols.IconSymbols.FailureIconSymbol;
import symbols.IconSymbols.FailureThreatIconSymbol;
import symbols.IconSymbols.ThreatIconSymbol;

public class DifficultyDice extends W008Dice {

	public DifficultyDice() {
		super(DiceType.DifficultyDice, new Difficulty_Dice_Symbol());
		
		face_symbols.add(new BlankIconSymbol());
		face_symbols.add(new FailureIconSymbol());
		face_symbols.add(new DoubleFailureIconSymbol());
		face_symbols.add(new ThreatIconSymbol());
		face_symbols.add(new ThreatIconSymbol());
		face_symbols.add(new ThreatIconSymbol());
		face_symbols.add(new DoubleThreatIconSymbol());
		face_symbols.add(new FailureThreatIconSymbol());
	}

	public DifficultyDice(byte[] seed) {
		super(DiceType.DifficultyDice, new Difficulty_Dice_Symbol(), seed);
		
		face_symbols.add(new BlankIconSymbol());
		face_symbols.add(new FailureIconSymbol());
		face_symbols.add(new DoubleFailureIconSymbol());
		face_symbols.add(new ThreatIconSymbol());
		face_symbols.add(new ThreatIconSymbol());
		face_symbols.add(new ThreatIconSymbol());
		face_symbols.add(new DoubleThreatIconSymbol());
		face_symbols.add(new FailureThreatIconSymbol());
	}
}
