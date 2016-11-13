package dice;

import symbols.DiceSymbols.Challenge_Dice_Symbol;
import symbols.IconSymbols.BlankIconSymbol;
import symbols.IconSymbols.DespairIconSymbol;
import symbols.IconSymbols.DoubleFailureIconSymbol;
import symbols.IconSymbols.DoubleThreatIconSymbol;
import symbols.IconSymbols.FailureIconSymbol;
import symbols.IconSymbols.FailureThreatIconSymbol;
import symbols.IconSymbols.ThreatIconSymbol;

public class ChallengeDice extends W012Dice {

	public ChallengeDice() {
		super(DiceType.ChallengeDice, new Challenge_Dice_Symbol());
		
		face_symbols.add(new BlankIconSymbol());
		face_symbols.add(new FailureIconSymbol());
		face_symbols.add(new FailureIconSymbol());
		face_symbols.add(new DoubleFailureIconSymbol());
		face_symbols.add(new DoubleFailureIconSymbol());
		face_symbols.add(new ThreatIconSymbol());
		face_symbols.add(new ThreatIconSymbol());
		face_symbols.add(new FailureThreatIconSymbol());
		face_symbols.add(new FailureThreatIconSymbol());
		face_symbols.add(new DoubleThreatIconSymbol());
		face_symbols.add(new DoubleThreatIconSymbol());
		face_symbols.add(new DespairIconSymbol());
	}

	public ChallengeDice(byte[] seed) {
		super(DiceType.ChallengeDice, new Challenge_Dice_Symbol(), seed);
		
		face_symbols.add(new BlankIconSymbol());
		face_symbols.add(new FailureIconSymbol());
		face_symbols.add(new FailureIconSymbol());
		face_symbols.add(new DoubleFailureIconSymbol());
		face_symbols.add(new DoubleFailureIconSymbol());
		face_symbols.add(new ThreatIconSymbol());
		face_symbols.add(new ThreatIconSymbol());
		face_symbols.add(new FailureThreatIconSymbol());
		face_symbols.add(new FailureThreatIconSymbol());
		face_symbols.add(new DoubleThreatIconSymbol());
		face_symbols.add(new DoubleThreatIconSymbol());
		face_symbols.add(new DespairIconSymbol());
	}
}
