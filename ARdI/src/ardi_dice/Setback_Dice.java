package dice;

import java.util.LinkedList;

import symbols.Failure_Icon_Symbol;
import symbols.Icon_Symbol;
import symbols.Threat_Icon_Symbol;

public class Setback_Dice extends Dice_6 implements ARdI_Diceable {

	public Setback_Dice() {
		// TODO Auto-generated constructor stub
	}

	public Setback_Dice(long seed) {
		super(seed);
		// TODO Auto-generated constructor stub
	}

	@Override
	public LinkedList<Icon_Symbol> getIcons() {

		switch (getValue()) {
		case 1:
			break;
		case 2:
			break;
		case 3:
			list.add(new Failure_Icon_Symbol());
			break;
		case 4:
			list.add(new Failure_Icon_Symbol());
			break;
		case 5:
			list.add(new Threat_Icon_Symbol());
			break;
		case 6:
			list.add(new Threat_Icon_Symbol());
			break;
		case 7:
			break;
		case 8:
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
