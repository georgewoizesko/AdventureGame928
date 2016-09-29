package com.ourchars;

import com.app.Weapons.Weapon;
import com.interfaces.Mage;
import com.parents.Halfling;

public class HalflingMage extends Halfling implements Mage{

	public HalflingMage() {
		super();
		// TODO Auto-generated constructor stub
	}

	public HalflingMage(int health, int mana, String name, Weapon weapon) {
		super(health, mana, name, weapon);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void changeHealth() {
		// TODO Auto-generated method stub
		Mage.super.changeHealth();
	}

	@Override
	public void changeMana() {
		// TODO Auto-generated method stub
		Mage.super.changeMana();
	}

	@Override
	public void setWeapon(Weapon weapon) {
		// TODO Auto-generated method stub
		super.setWeapon(Weapon.STAFF);
	}

	
	
	

}