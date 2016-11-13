package dice;


import symbols.DiceSymbols.Setback_Dice_Symbol;
import symbols.IconSymbols.BlankIconSymbol;
import symbols.IconSymbols.FailureIconSymbol;
import symbols.IconSymbols.ThreatIconSymbol;

public class SetbackDice extends W006Dice {

	public SetbackDice() {
		super(DiceType.SetbackDice, new Setback_Dice_Symbol());
		
		face_symbols.add(new BlankIconSymbol());
		face_symbols.add(new BlankIconSymbol());
		face_symbols.add(new FailureIconSymbol());
		face_symbols.add(new FailureIconSymbol());
		face_symbols.add(new ThreatIconSymbol());
		face_symbols.add(new ThreatIconSymbol());
	}
	
	public SetbackDice(byte[] seed) {
		super(DiceType.SetbackDice, new Setback_Dice_Symbol(), seed);

		face_symbols.add(new BlankIconSymbol());
		face_symbols.add(new BlankIconSymbol());
		face_symbols.add(new FailureIconSymbol());
		face_symbols.add(new FailureIconSymbol());
		face_symbols.add(new ThreatIconSymbol());
		face_symbols.add(new ThreatIconSymbol());
	}
}
