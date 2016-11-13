package dice;

import java.util.LinkedList;

import symbols.DiceSymbols.Dice_Symbol;
import symbols.IconSymbols.IconSymbol;

public interface Diceable{
	public int getValue0();
	public int getValue1();
	public int getValue();
	public int getFaces();
	public Dice_Symbol getDiceSymbol();
	public LinkedList<IconSymbol> getFaceIcons();
	public IconSymbol getThrow();
	public LinkedList<IconSymbol> addThrow(LinkedList<IconSymbol> list);
	public DiceType getDiceType();
}
