package dice;

import java.util.LinkedList;
import java.security.SecureRandom;

import symbols.Dice_Symbol;
import symbols.Icon_Symbol;


public abstract class Dice implements Diceable {

	private DiceType type;
	private SecureRandom rand;
	private int faces;
	private Dice_Symbol dice_symbol;
	protected LinkedList<Icon_Symbol> face_symbols;

	public Dice(int faces) {
		this.type = DiceType.DefaultDice;
		this.faces = faces;
		rand = new SecureRandom();
		this.face_symbols = new LinkedList<Icon_Symbol>();
	}
	
	public Dice(int faces, byte[] seed) {
		this.type = DiceType.DefaultDice;
		this.faces = faces;
		rand = new SecureRandom(seed);
		this.face_symbols = new LinkedList<Icon_Symbol>();
	}
	
	public Dice(int faces, DiceType type) {
		this.type = type;
		this.faces = faces;
		rand = new SecureRandom();
		this.face_symbols = new LinkedList<Icon_Symbol>();
	}
	
	public Dice(int faces, DiceType type, byte[] seed) {
		this.type = type;
		this.faces = faces;
		rand = new SecureRandom(seed);
		this.face_symbols = new LinkedList<Icon_Symbol>();
	}
	
	public Dice(int faces, DiceType type, Dice_Symbol dice_symbol) {
		this.type = type;
		this.faces = faces;
		rand = new SecureRandom();
		this.dice_symbol = dice_symbol;
		this.face_symbols = new LinkedList<Icon_Symbol>();
	}

	public Dice(int faces, DiceType type, Dice_Symbol dice_symbol, byte[] seed) {
		this.type = type;
		this.faces = faces;
		rand = new SecureRandom(seed);
		this.dice_symbol = dice_symbol;
		this.face_symbols = new LinkedList<Icon_Symbol>();
	}
	
	public Dice(int faces, DiceType type, Dice_Symbol dice_symbol, LinkedList<Icon_Symbol> face_symbols) {
		this.type = type;
		this.faces = faces;
		rand = new SecureRandom();
		this.dice_symbol = dice_symbol;
		this.face_symbols = new LinkedList<Icon_Symbol>(face_symbols);
	}

	public Dice(int faces, DiceType type, Dice_Symbol dice_symbol, LinkedList<Icon_Symbol> face_symbols, byte[] seed) {
		this.type = type;
		this.faces = faces;
		rand = new SecureRandom(seed);
		this.dice_symbol = dice_symbol;
		this.face_symbols = new LinkedList<Icon_Symbol>(face_symbols);
	}
	
	//------------------------------------------------------------------------------------------------
	
	public int getValue0() {
		return rand.nextInt(faces);
	}
	
	public int getValue1() {
		return (getValue0() + 1);
	}
	
	public int getValue() {
		return getValue1();
	}

	public int getFaces() {
		return faces;
	}
	
	public Dice_Symbol getDiceSymbol() {
		return dice_symbol;
	}
	
	public LinkedList<Icon_Symbol> getFaceIcons() {
		return face_symbols;
	}

	public Icon_Symbol getThrow() {
		return face_symbols.get((getValue() - 1));
	}
	
	public LinkedList<Icon_Symbol> addThrow(LinkedList<Icon_Symbol> list) {
		
		list.add(getThrow());
		
		return list;
	}
	
	public DiceType getDiceType() {
		return type;
	}
}

