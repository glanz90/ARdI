package dice;

import java.util.LinkedList;
import java.util.Random;

import symbols.Dice_Symbol;
import symbols.Icon_Symbol;


public abstract class Dice implements Diceable {

	private Random rand;
	protected int faces;
	protected Dice_Symbol dice_symbol;
	protected LinkedList<Icon_Symbol> face_symbols;

	public Dice(int faces) {
		this.faces = faces;
		rand = new Random();
		this.face_symbols = new LinkedList<Icon_Symbol>();
	}
	
	public Dice(int faces, long seed) {
		this.faces = faces;
		rand = new Random(seed);
		this.face_symbols = new LinkedList<Icon_Symbol>();
	}
	
	public Dice(int faces, Dice_Symbol dice_symbol) {
		this.faces = faces;
		rand = new Random();
		this.dice_symbol = dice_symbol;
		this.face_symbols = new LinkedList<Icon_Symbol>();
	}

	public Dice(int faces, Dice_Symbol dice_symbol, long seed) {
		this.faces = faces;
		rand = new Random(seed);
		this.dice_symbol = dice_symbol;
		this.face_symbols = new LinkedList<Icon_Symbol>();
	}
	
	public Dice(int faces, Dice_Symbol dice_symbol, LinkedList<Icon_Symbol> face_symbols) {
		this.faces = faces;
		rand = new Random();
		this.dice_symbol = dice_symbol;
		this.face_symbols = new LinkedList<Icon_Symbol>(face_symbols);
	}

	public Dice(int faces, Dice_Symbol dice_symbol, LinkedList<Icon_Symbol> face_symbols, long seed) {
		this.faces = faces;
		rand = new Random(seed);
		this.dice_symbol = dice_symbol;
		this.face_symbols = new LinkedList<Icon_Symbol>(face_symbols);
	}
	
	@Override
	public int getValue() {
		return (rand.nextInt(faces) + 1);
	}

	public int getFaces() {
		return faces;
	}
	
	public Dice_Symbol getDice_symbol() {
		return dice_symbol;
	}

	public Icon_Symbol getThrow() {
		return face_symbols.get((getValue() - 1));
	}
	
	public LinkedList<Icon_Symbol> addThrow(LinkedList<Icon_Symbol> list) {
		
		list.add(getThrow());
		
		return list;
	}
}

