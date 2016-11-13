package dice;

import java.util.LinkedList;
import java.security.SecureRandom;

import symbols.Dice_Symbol;
import symbols.Icon_Symbol;


public abstract class Dice implements Diceable {

	private SecureRandom rand;
	protected int faces;
	protected Dice_Symbol dice_symbol;
	protected LinkedList<Icon_Symbol> face_symbols;

	public Dice(int faces) {
		this.faces = faces;
		rand = new SecureRandom();
		this.face_symbols = new LinkedList<Icon_Symbol>();
	}
	
	public Dice(int faces, byte[] seed) {
		this.faces = faces;
		rand = new SecureRandom(seed);
		this.face_symbols = new LinkedList<Icon_Symbol>();
	}
	
	public Dice(int faces, Dice_Symbol dice_symbol) {
		this.faces = faces;
		rand = new SecureRandom();
		this.dice_symbol = dice_symbol;
		this.face_symbols = new LinkedList<Icon_Symbol>();
	}

	public Dice(int faces, Dice_Symbol dice_symbol, byte[] seed) {
		this.faces = faces;
		rand = new SecureRandom(seed);
		this.dice_symbol = dice_symbol;
		this.face_symbols = new LinkedList<Icon_Symbol>();
	}
	
	public Dice(int faces, Dice_Symbol dice_symbol, LinkedList<Icon_Symbol> face_symbols) {
		this.faces = faces;
		rand = new SecureRandom();
		this.dice_symbol = dice_symbol;
		this.face_symbols = new LinkedList<Icon_Symbol>(face_symbols);
	}

	public Dice(int faces, Dice_Symbol dice_symbol, LinkedList<Icon_Symbol> face_symbols, byte[] seed) {
		this.faces = faces;
		rand = new SecureRandom(seed);
		this.dice_symbol = dice_symbol;
		this.face_symbols = new LinkedList<Icon_Symbol>(face_symbols);
	}
	
	public int getValue() {
		return (rand.nextInt(faces) + 1);
	}

	public int getFaces() {
		return faces;
	}
	
	public Dice_Symbol getDice_symbol() {
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
	
	public abstract String toString();
}

