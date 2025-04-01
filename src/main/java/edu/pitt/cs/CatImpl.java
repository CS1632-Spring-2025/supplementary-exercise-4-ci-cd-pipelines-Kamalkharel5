package edu.pitt.cs;

public class CatImpl implements Cat {

	// TODO: Fill in with member variables
	private int id;
	private String name;
	private boolean isRented;

	public CatImpl(int id, String name) {
		// TODO: Fill in
		this.id = id;
		this.name = name;
		this.isRented = false;

	}

	public void rentCat() {
		// TODO: Fill in
		this.isRented = true;

	}

	public void returnCat() {
		// TODO: Fill in
		this.isRented = false;
	}

	public void renameCat(String name) {
		// TODO: Fill in
		this.name = name;
	}

	public String getName() {
		// TODO: Fill in
		return this.name;
		// return "";
	}

	public int getId() {
		// TODO: Fill in
		return this.id;
		// return 0;
	}

	public boolean getRented() {
		// TODO: Fill in
		return this.isRented;
		// return false;

	}

	public String toString() {
		// TODO: Fill in
		return "ID " + this.id + ". " + this.name;
		// return "";
	}

}