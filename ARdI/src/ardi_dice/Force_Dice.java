package dice;

import java.util.LinkedList;

import symbols.Darkforce_Icon_Symbol;
import symbols.Icon_Symbol;
import symbols.Lightforce_Icon_Symbol;

public class Force_Dice extends Dice_12 implements ARdI_Diceable {

	public Force_Dice() {
		// TODO Auto-generated constructor stub
	}

	public Force_Dice(long seed) {
		super(seed);
		// TODO Auto-generated constructor stub
	}

	@Override
	public LinkedList<Icon_Symbol> getIcons() {

		switch (getValue()) {
		case 1:
			break;
		case 2:
			list.add(new Darkforce_Icon_Symbol());
			break;
		case 3:
			list.add(new Darkforce_Icon_Symbol());
			break;
		case 4:
			list.add(new Darkforce_Icon_Symbol());
			break;
		case 5:
			list.add(new Darkforce_Icon_Symbol());
			break;
		case 6:
			list.add(new Darkforce_Icon_Symbol());
			break;
		case 7:
			list.add(new Darkforce_Icon_Symbol());
			list.add(new Darkforce_Icon_Symbol());
			break;
		case 8:
			list.add(new Lightforce_Icon_Symbol());
			break;
		case 9:
			list.add(new Lightforce_Icon_Symbol());
			break;
		case 10:
			list.add(new Lightforce_Icon_Symbol());
			list.add(new Lightforce_Icon_Symbol());
			break;
		case 11:
			list.add(new Lightforce_Icon_Symbol());
			list.add(new Lightforce_Icon_Symbol());
			break;
		case 12:
			list.add(new Lightforce_Icon_Symbol());
			list.add(new Lightforce_Icon_Symbol());
			break;
		}
		
		return list;
	}

	
	
}
