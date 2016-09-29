package com.parents;

import com.app.Weapons.Weapon;

public class CharacterClass {
	
	protected int health = 0;	
	protected int mana = 0;
	protected String name = null;
	
	//Added Weapon
	protected static Weapon weapon = null;
	
	
	
	public CharacterClass() {
		super();
	}



	public CharacterClass(int health, int mana, String name, Weapon weapon) {
		super();
		this.health = health;
		this.mana = mana;
		this.name = name;
		this.weapon = weapon;
	}



	public int getHealth() {
		return health;
	}



	public void setHealth(int health) {
		this.health = health;
	}



	public int getMana() {
		return mana;
	}



	public void setMana(int mana) {
		this.mana = mana;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}
	
	
	//Added Weapon Getters and Setters
	public Weapon getWeapon (){
		return weapon;
	}
	
	public void setWeapon(Weapon weapon) {
		this.weapon = weapon;
	}
	
	

}
