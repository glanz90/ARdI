package dice;

import symbols.DiceSymbols.Force_Dice_Symbol;
import symbols.IconSymbols.DarkforceIconSymbol;
import symbols.IconSymbols.DoubleDarkforceIconSymbol;
import symbols.IconSymbols.DoubleLightforceIconSymbol;
import symbols.IconSymbols.LightforceIconSymbol;

public class ForceDice extends W012Dice {

	public ForceDice() {
		super(DiceType.ForceDice, new Force_Dice_Symbol());
		
		face_symbols.add(new DarkforceIconSymbol());
		face_symbols.add(new DarkforceIconSymbol());
		face_symbols.add(new DarkforceIconSymbol());
		face_symbols.add(new DarkforceIconSymbol());
		face_symbols.add(new DarkforceIconSymbol());
		face_symbols.add(new DarkforceIconSymbol());
		face_symbols.add(new DoubleDarkforceIconSymbol());
		face_symbols.add(new LightforceIconSymbol());
		face_symbols.add(new LightforceIconSymbol());
		face_symbols.add(new DoubleLightforceIconSymbol());
		face_symbols.add(new DoubleLightforceIconSymbol());
		face_symbols.add(new DoubleLightforceIconSymbol());
	}

	public ForceDice(byte[] seed) {
		super(DiceType.ForceDice, new Force_Dice_Symbol(), seed);
		
		face_symbols.add(new DarkforceIconSymbol());
		face_symbols.add(new DarkforceIconSymbol());
		face_symbols.add(new DarkforceIconSymbol());
		face_symbols.add(new DarkforceIconSymbol());
		face_symbols.add(new DarkforceIconSymbol());
		face_symbols.add(new DarkforceIconSymbol());
		face_symbols.add(new DoubleDarkforceIconSymbol());
		face_symbols.add(new LightforceIconSymbol());
		face_symbols.add(new LightforceIconSymbol());
		face_symbols.add(new DoubleLightforceIconSymbol());
		face_symbols.add(new DoubleLightforceIconSymbol());
		face_symbols.add(new DoubleLightforceIconSymbol());
	}	
}
