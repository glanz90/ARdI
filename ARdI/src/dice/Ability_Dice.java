package dice;


import java.util.LinkedList;

import symbols.Advantage_Icon_Symbol;
import symbols.Icon_Symbol;
import symbols.Success_Icon_Symbol;

public class Ability_Dice extends Dice_8 implements ARdI_Diceable {

	
	public Ability_Dice() {
	}

	public Ability_Dice(long seed) {
		super(seed);
	}

	@Override
	public LinkedList<Icon_Symbol> getIcons() {
		
		switch (getValue()) {
		case 1:
			break;
		case 2:
			list.add(new Success_Icon_Symbol());
			break;
		case 3:
			list.add(new Success_Icon_Symbol());
			break;
		case 4:
			list.add(new Success_Icon_Symbol());
			list.add(new Success_Icon_Symbol());
			break;
		case 5:
			list.add(new Advantage_Icon_Symbol());
			break;
		case 6:
			list.add(new Advantage_Icon_Symbol());
			break;
		case 7:
			list.add(new Success_Icon_Symbol());
			list.add(new Advantage_Icon_Symbol());
			break;
		case 8:
			list.add(new Advantage_Icon_Symbol());
			list.add(new Advantage_Icon_Symbol());
			break;
		case 9:
			break;
		case 10:
			break;
		case 11:
			break;
		case 12:
			break;
		}
		
		return list;
	}

}
