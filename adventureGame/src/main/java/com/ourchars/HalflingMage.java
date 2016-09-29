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
		super.setHealth(health +0);
	}

	@Override
	public void changeMana() {
		super.setMana(mana + 200);
	}


	@Override
	public void setWeapon(Weapon weapon) {
		// TODO Auto-generated method stub
		super.setWeapon(Weapon.STAFF);
	}

	
	
	

}
