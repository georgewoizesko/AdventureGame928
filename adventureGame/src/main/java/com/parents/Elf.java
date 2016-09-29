package com.parents;

import com.app.Weapons.Weapon;

public class Elf extends CharacterClass {

	public Elf() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	//Added Weapon weapon
	public Elf(int health, int mana, String name, Weapon weapon) {
		super(health, mana, name, weapon);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void setHealth(int health) {
		// TODO Auto-generated method stub
		super.setHealth(health + 70);
	}

	@Override
	public void setMana(int mana) {
		// TODO Auto-generated method stub
		super.setMana(mana + 80);
	}

	@Override
	public void setName(String name) {
		// TODO Auto-generated method stub
		super.setName("Evos");
	}

	
	
}
