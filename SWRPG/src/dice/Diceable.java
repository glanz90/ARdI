package dice;

import java.util.LinkedList;

import symbols.Dice_Symbol;
import symbols.Icon_Symbol;

public interface Diceable{
	public int getValue0();
	public int getValue1();
	public int getValue();
	public int getFaces();
	public Dice_Symbol getDiceSymbol();
	public LinkedList<Icon_Symbol> getFaceIcons();
	public Icon_Symbol getThrow();
	public LinkedList<Icon_Symbol> addThrow(LinkedList<Icon_Symbol> list);
	public DiceType getDiceType();
}
